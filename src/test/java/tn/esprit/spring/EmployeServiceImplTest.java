package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import java.text.ParseException;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Employe;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.services.IEmployeService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeServiceImplTest {

	@Autowired
	IEmployeService es;

	@Test
	public void testAddOrUpdateEmploye() throws ParseException {

		Employe e = new Employe("arfaoui", "med", "arfa1@marfa.arfa", "arfa", true, Role.INGENIEUR);
		Employe EmployeAdded = es.addOrUpdateEmploye(e);
		assertEquals(e.getNom(), EmployeAdded.getNom());
	}



	@Test
	public void testgetAllEmployes() {
		List<Employe> listEmployees = es.getAllEmployes();
		assertEquals(6, listEmployees.size());
	}
	
	
	@Test
	public void testdeleteEmployeById() {
		es.deleteEmployeById(3);
	}

}
