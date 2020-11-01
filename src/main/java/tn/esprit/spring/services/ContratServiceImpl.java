package tn.esprit.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entities.Contrat;
import tn.esprit.spring.repository.ContratRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Service
public class ContratServiceImpl implements IContratService {

	@Autowired
	ContratRepository contratRepository;

	private static final Logger l = LogManager.getLogger(ContratServiceImpl.class);

	public List<Contrat> getAllContrats() {
		l.info("In  getAllContrats : ");
		List<Contrat> contrats = (List<Contrat>) contratRepository.findAll();
		for (Contrat contrat : contrats) {
			l.debug("contrat +++ : " + contrat);
		}
		l.info("Out of getAllContrats.");
		return contrats;
	}

	@Override
	public Contrat addContrat(Contrat c) {
		l.info("In  addContrat : " + c);
		Contrat contratSaved = contratRepository.save(c);
		l.info("Out of  addContrat. ");
		return contratSaved;
	}

	@Override
	public Contrat updateContrat(Contrat c) {
		return contratRepository.save(c);
	}

	@Override
	public void deleteContrat(String id) {
		contratRepository.deleteById((int)Long.parseLong(id));
	}

	@Override
	public Contrat retrieveContrat(String id) {
		l.info("in  retrieveContrat id = " + id);
		Contrat c = contratRepository.findById((int)Long.parseLong(id)).orElse(null);
		l.info("contrat returned : " + c);
		return c;
	}
}
