package kodlama.io.SpringHW.business.abstracts;

import java.util.List;

import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {
	
	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getProgrammingLanguageById(int programmingLanguageId);

	ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguage) throws Exception;

	void deleteProgrammingLanguage(int programmingLanguageId);

	ProgrammingLanguage updateProgrammingLanguage(int id, ProgrammingLanguage programmingLanguage);
}
