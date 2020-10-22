package tn.esprit.spring;



import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.services.IDepartementService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DepartementServiceImplTest {
	@Autowired
	IDepartementService ds;
	
	@Test
	public void testgetAllDepartements(){
	List <Departement> depts=ds.getAllDepartements();
	}
	@Test
	public void testAddDepartement() throws ParseException {
		Departement d =new Departement("telecom");
		Departement DepAdded=ds.AddDepartement(d);
		
	}
	

	
}
