package kodlama.io.SpringHW.dataAccess.abstracts;

import java.util.List;

import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository {

	List<ProgrammingLanguage> getAll();

	ProgrammingLanguage getProgrammingLanguageById(int programmingLanguageId);

	ProgrammingLanguage addProgrammingLanguage(ProgrammingLanguage programmingLanguage) throws Exception;

	ProgrammingLanguage updateProgrammingLanguage(int programmingLanguageId, ProgrammingLanguage programmingLanguage);

	void deleteProgrammingLanguage(int programmingLanguageId);
}
