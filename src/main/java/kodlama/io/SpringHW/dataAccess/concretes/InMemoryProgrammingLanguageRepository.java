package kodlama.io.SpringHW.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.SpringHW.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

	List<ProgrammingLanguage> programmingLanguages;

	public InMemoryProgrammingLanguageRepository() {
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		programmingLanguages.add(new ProgrammingLanguage(0, "boş"));
		programmingLanguages.add(new ProgrammingLanguage(1, "C#"));
		programmingLanguages.add(new ProgrammingLanguage(2, "Java"));
		programmingLanguages.add(new ProgrammingLanguage(3, "Python"));
	}

	@Override
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguages;
	}

	@Override
	public ProgrammingLanguage getProgrammingLanguageById(int programmingLanguageId) {
		return programmingLanguages.get(programmingLanguageId);
	}

	@Override
	public ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguage) throws Exception {

		programmingLanguages.add(programmingLanguage);
		return programmingLanguage;

	}

	@Override
	public ProgrammingLanguage updateProgrammingLanguage(int programmingLanguageId,
			ProgrammingLanguage programmingLanguage) {
		programmingLanguages.set(programmingLanguageId, programmingLanguage);
		return null;
	}

	@Override
	public void deleteProgrammingLanguage(int programmingLanguageId) {
		programmingLanguages.remove(programmingLanguageId);
	}
}
