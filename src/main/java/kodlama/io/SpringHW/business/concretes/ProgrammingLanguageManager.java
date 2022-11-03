package kodlama.io.SpringHW.business.concretes;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import kodlama.io.SpringHW.business.abstracts.ProgrammingLanguageService;
import kodlama.io.SpringHW.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getAllProgrammingLanguages() {
		return programmingLanguageRepository.findAll();
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(Long programmingLanguageId) {
		return programmingLanguageRepository.findById(programmingLanguageId).orElse(null);

	}	

	@Override
	public ProgrammingLanguage saveProgrammingLanguage(ProgrammingLanguage programmingLanguage) throws Exception {
		
		if (isNameBlankAndEmpty(programmingLanguage)) {
			throw new Exception("Programming Language Cannot be Empty.");
		} else if (isNameExist(programmingLanguage)) {
			throw new Exception("The Programming Language Cannot Repeat.");
		}
		return programmingLanguageRepository.save(programmingLanguage);
}

	@Override
	public ProgrammingLanguage updateProgrammingLanguage(ProgrammingLanguage programmingLanguage, Long programmingLanguageId) {
		Optional<ProgrammingLanguage> existingProgrammingLanguage = programmingLanguageRepository.findById(programmingLanguageId);
	
		if (existingProgrammingLanguage.isPresent()) {
			ProgrammingLanguage toUpdate = existingProgrammingLanguage.get();
			toUpdate.setName(programmingLanguage.getName());
			programmingLanguageRepository.save(toUpdate);
			return toUpdate;
		}
		return null;

	}

	@Override
	public void deleteProgrammingLanguage(Long programmingLanguageId) {
		programmingLanguageRepository.deleteById(programmingLanguageId);

	}
	

	@Override
	public boolean isNameBlankAndEmpty(ProgrammingLanguage programmingLanguage) {
		if (programmingLanguage.getName().isEmpty() || programmingLanguage.getName().isBlank()) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isNameExist(ProgrammingLanguage programmingLanguage) {
		for (ProgrammingLanguage programmingL : getAllProgrammingLanguages()) {
			if (programmingL.getName().equalsIgnoreCase(programmingLanguage.getName())) {
				return true;
			}
		}
		return false;
	}
	


}
