package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entities.Contrat;


public interface IContratService {
	
	
	public List<Contrat> getAllContrats();
	public Contrat addContrat(Contrat c);
	public Contrat updateContrat(Contrat c) ;
	public void deleteContrat(String id);
	public Contrat retrieveContrat(String id) ;


	
	
	

	
}
