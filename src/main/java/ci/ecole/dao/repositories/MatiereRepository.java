package ci.ecole.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.ecole.dao.entities.Matiere;

public interface MatiereRepository extends JpaRepository<Matiere, Integer>{

	Matiere findByLibelle(String libelle);
	Matiere findById(Integer id);
}
