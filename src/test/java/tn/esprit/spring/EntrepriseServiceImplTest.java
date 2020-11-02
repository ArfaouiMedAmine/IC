package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	@Autowired
	IEntrepriseService entropoService ;
	
	@Test
	public void testAddOrUpdateEmploye() throws ParseException {
	Entreprise entreprise = new Entreprise();
	entreprise.setName("esprit");
	entreprise.setRaisonSocial("nouri");
	int entropoId = entropoService.ajouterEntreprise(entreprise);
	assertEquals(entropoId, entreprise.getId());
	}
}
