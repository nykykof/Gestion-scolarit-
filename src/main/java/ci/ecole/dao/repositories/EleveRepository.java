package ci.ecole.dao.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import ci.ecole.dao.entities.Eleve;

public interface EleveRepository extends JpaRepository<Eleve, Integer>{

	Eleve findByNom(String name);
	Eleve findById(Integer id);
}
