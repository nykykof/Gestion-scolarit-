package ci.ecole.dao.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Matiere {

	@Id
	@GeneratedValue
	private Integer id;
	private String libelle;
	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Matiere(Integer id) {
		super();
		// TODO Auto-generated constructor stub
		this.id=id;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
}
