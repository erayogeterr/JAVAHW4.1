package kodlama.io.SpringHW.webApi.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.SpringHW.business.abstracts.ProgrammingLanguageService;
import kodlama.io.SpringHW.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/programminglanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		this.programmingLanguageService = programmingLanguageService;
	}

	@GetMapping("/getall")
	public List<ProgrammingLanguage> getAll() {
		return programmingLanguageService.getAllProgrammingLanguages();
	}

	@GetMapping("{id}")
	public ProgrammingLanguage getProgrammingLanguageById(@PathVariable("id") Long programmingLanguageId) throws Exception {
		return programmingLanguageService.getProgrammingLanguageById(programmingLanguageId);
	}

	@PostMapping
	public ProgrammingLanguage addProgrammingLanguage(@RequestBody ProgrammingLanguage programmingLanguage)
			throws Exception {
		return programmingLanguageService.saveProgrammingLanguage(programmingLanguage);
	}

	@PutMapping("{id}")
	public ProgrammingLanguage updateProgrammingLanguage(@PathVariable("id") Long programmingLanguageId,
			@RequestBody ProgrammingLanguage programmingLanguage) {
		return programmingLanguageService.updateProgrammingLanguage(programmingLanguage, programmingLanguageId);
	}

	@DeleteMapping("{id}")
	public void deleteProgrammingLanguage(@PathVariable("id") Long programmingLanguageId) throws Exception {
		programmingLanguageService.deleteProgrammingLanguage(programmingLanguageId);
	}
}
