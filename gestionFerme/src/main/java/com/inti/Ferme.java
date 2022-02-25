package com.inti;
import javax.persistence.Entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ferme {
	private Long idFerme;
	private String nom;
	private Date dateAchat;
	
	@OneToMany(mappedBy="ferme")
	List <Gerant> liste_gerant = new ArrayList<>();
	
	
	

}
