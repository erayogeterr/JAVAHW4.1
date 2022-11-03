package kodlama.io.SpringHW.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {

}
