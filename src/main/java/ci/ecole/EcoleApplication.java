package ci.ecole;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import ci.ecole.dao.entities.Eleve;
import ci.ecole.dao.repositories.EleveRepository;

@SpringBootApplication
public class EcoleApplication {

	@Bean
	InitializingBean saveData(EleveRepository repo){
	return () -> {
		
	repo.save(new Eleve(1,"n'zi","koffi yannick"));
	repo.save(new Eleve(2,"Traore","fanta"));
	repo.save(new Eleve(3,"Tuo","allassane"));
	repo.save(new Eleve(4,"Essanin","Arnaud"));
	};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(EcoleApplication.class, args);
	}
}
