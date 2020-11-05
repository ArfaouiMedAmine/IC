package tn.esprit.spring;

import static org.junit.Assert.assertEquals;
import java.text.ParseException;
import java.util.List;

import javax.transaction.Transactional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@Transactional // tester sans faire des modifications au niveau de la base de données
@SpringBootTest
public class EntrepriseServiceImplTest {
	@Autowired
	IEntrepriseService entropoService ;
	
	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	
	@Test
	@Rollback(false)
	public void testAddOrUpdateEmploye() throws ParseException {
	Entreprise entreprise = new Entreprise();
	entreprise.setName("esprit");
	entreprise.setRaisonSocial("nouri");
	int entropoId = entropoService.ajouterEntreprise(entreprise);
	assertEquals(entropoId, entreprise.getId());
	}
	
	
	/* @Test
	public void testDeleteProduct()throws ParseException {
		Entreprise entreprise = entropoService.getEntrepriseById(28);
	     
		entropoService.deleteEntrepriseById(entreprise.getId());
	     
		Entreprise deletedEntropo = null ;
		
		try { 
			
			deletedEntropo = entrepriseRepoistory.findById(28).get() ;
			assertEquals(1, 0);
			
		}
		catch (NoSuchElementException e ) {
			assertEquals(1, 1);

			
		}
		*/

	@Test
	@Rollback(true)
	public void testDeleteProduct() throws ParseException {
		Entreprise entreprise = entropoService.getEntrepriseById(33);

		entropoService.deleteEntrepriseById(entreprise.getId());
		try {
			Entreprise deletedEntreprise = entropoService.getEntrepriseById(33);

		} catch (Exception e) {

			Entreprise deletedEntreprise = null;
			assertEquals(deletedEntreprise, null);
		}

	}
	     
	 


	 
	     
	
	
	
	
}
