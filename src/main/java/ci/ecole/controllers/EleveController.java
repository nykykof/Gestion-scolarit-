package ci.ecole.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ci.ecole.dao.entities.Eleve;
import ci.ecole.dao.repositories.EleveRepository;

@RestController
@RequestMapping("/eleve")
public class EleveController {

	@Autowired
	EleveRepository elRepo;
	
	@RequestMapping("/voir")
	public List<Eleve> getEleves(){
		
		return elRepo.findAll();
	}
	@RequestMapping("/voir/{id}")
	public Eleve getEleve(@PathVariable Integer id){
		
		return elRepo.findById(id);
	}
	@RequestMapping(value="/ajouter", method=RequestMethod.POST, consumes={"application/json"}, produces={"application/json"})
	public List<Eleve> creerEleve(@RequestBody List<Eleve> eleve){
		elRepo.save(eleve);
		
		return elRepo.findAll();		
	}
	@RequestMapping(value="/supprimer", method=RequestMethod.POST, consumes={"application/json"}, produces={"application/json"})
	public Eleve supprimerEleve(@RequestBody Eleve eleve){
		Eleve el = elRepo.findById(eleve.getId());
		elRepo.delete(eleve.getId());
		elRepo.flush();
		return el;
		
	}
}
