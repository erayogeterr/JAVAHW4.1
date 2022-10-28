package kodlama.io.SpringHW.business.concretes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.SpringHW.business.abstracts.ProgrammingLanguageService;
import kodlama.io.SpringHW.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {
	
	private ProgrammingLanguageRepository programmingLanguageRepository;

	
	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageRepository.getAll();
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int programmingLanguageId) {
		return programmingLanguageRepository.getProgrammingLanguageById(programmingLanguageId);
	}

	@Override
	public ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguage) throws Exception {
		if (isNameBlankAndEmpty(programmingLanguage)) {
			throw new Exception("Programlama Dili Boş Geçilemez");
		}
		return programmingLanguageRepository.addProgrammingLanguage(programmingLanguage);
	}

	@Override
	public ProgrammingLanguage updateProgrammingLanguage(int programmingLanguageId, ProgrammingLanguage programmingLanguage) {
		return programmingLanguageRepository.updateProgrammingLanguage(programmingLanguageId, programmingLanguage);
	}

	@Override
	public void deleteProgrammingLanguage(int programmingLanguageId) {
		programmingLanguageRepository.deleteProgrammingLanguage(programmingLanguageId);
	}

	@Override
	public boolean isNameBlankAndEmpty(ProgrammingLanguage programmingLanguage) {
		if(programmingLanguage.getName().isEmpty() || programmingLanguage.getName().isBlank()) {
			return true;
		}
		return false;
	}


}
