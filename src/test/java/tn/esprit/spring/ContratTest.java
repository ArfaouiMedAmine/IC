package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
//import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Contrat;

import tn.esprit.spring.services.IContratService;

@RunWith(SpringRunner.class)
@SpringBootTest

public class ContratTest {
	
	@Autowired 
	IContratService co;
	
	@Test
	public void testaddContrat() throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-10-22");
		Contrat c = new Contrat(d, "CDD",500);
		Contrat contratAdded = co.addContrat(c); 
		assertEquals(c.getTypeContrat(), contratAdded.getTypeContrat());
	}
	/*@Test
	public void testupdateContrat() throws ParseException   {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date d = dateFormat.parse("2020-10-22");
		Contrat c = new Contrat(d, "CDI",1500); 
		Contrat contratUpdated  = co.updateContrat(c); 
		assertEquals(c.getTypeContrat(),  contratUpdated.getTypeContrat());
	}*/
	
	/*@Test
	public void testgetAllContrats() {
		List<Contrat> listContrats = co.getAllContrats();  
		assertEquals(5, listContrats.size());
	}*/
	
	/*@Test
	public void testretrieveContrat() {
		Contrat contratRetrieved = co.retrieveContrat("1"); 
		assertEquals(1L, contratRetrieved.getReference());
	}*/
}
