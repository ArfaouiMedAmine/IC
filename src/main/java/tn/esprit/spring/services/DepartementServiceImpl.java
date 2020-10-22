package tn.esprit.spring.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.repository.DepartementRepository;

@Service
public class DepartementServiceImpl implements IDepartementService {


	@Autowired
	DepartementRepository deptRepoistory;
	private static final Logger l = LogManager.getLogger(DepartementServiceImpl.class);

	public List<Departement> getAllDepartements() {
		l.info("in getAlldepartement : ");
		List <Departement> depts=(List<Departement>) deptRepoistory.findAll();
		for(Departement dep : depts ){
			l.debug("departement +++ : "+dep);
		}
		return depts;
	}

	
	public Departement AddDepartement(Departement d){
		l.info("in addDepartement : "+d);
		Departement dep=deptRepoistory.save(d);
		l.info("out of addDepartement .");
		return dep;
	}
	
	
	
	
}
