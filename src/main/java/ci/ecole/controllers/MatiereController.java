package ci.ecole.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import ci.ecole.dao.entities.Matiere;
import ci.ecole.dao.repositories.MatiereRepository;

@RestController
@RequestMapping("/matiere")
public class MatiereController {

	@Autowired
	MatiereRepository matRepo;
	
	@RequestMapping(value="/ajouter",method=RequestMethod.POST, consumes={"application/json"}, produces={"application/json"})
	public Matiere addMatiere(@RequestBody Matiere matiere){
		
		return matRepo.save(matiere);
	}
	@RequestMapping(value="/voir",method=RequestMethod.GET, produces={"application/json"})
	public List<Matiere> getMatiere(){
		
		return matRepo.findAll();
	}
	@RequestMapping(value="/voir/libelle/{libelle}",method=RequestMethod.GET, produces={"application/json"})
	public Matiere getMatiereByLibelle(@PathVariable String libelle){
		
		return matRepo.findByLibelle(libelle);
	}
	@RequestMapping("/voir/id/{id}")
	public Matiere getMatiere(@PathVariable Integer id){
		
		return matRepo.findById(id);
	}
	
	@RequestMapping(value="/supprimer/{id}",method=RequestMethod.GET, produces={"application/json"})
	public Matiere deleteMatiere(@PathVariable Integer id){
		Matiere mat = matRepo.findById(id);
		matRepo.delete(id);
		
		return mat;
	}
}
