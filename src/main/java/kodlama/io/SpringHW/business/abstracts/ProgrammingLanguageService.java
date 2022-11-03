package kodlama.io.SpringHW.business.abstracts;

import java.util.List;

import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getAllProgrammingLanguages();

	ProgrammingLanguage getProgrammingLanguageById(Long programmingLanguageId);

	ProgrammingLanguage saveProgrammingLanguage(ProgrammingLanguage programmingLanguage) throws Exception;

	ProgrammingLanguage updateProgrammingLanguage(ProgrammingLanguage programmingLanguage, Long programmingLanguageId);

	void deleteProgrammingLanguage(Long programmingLanguageId);

	boolean isNameBlankAndEmpty(ProgrammingLanguage programmingLanguage);

	boolean isNameExist(ProgrammingLanguage programmingLanguage);

}
