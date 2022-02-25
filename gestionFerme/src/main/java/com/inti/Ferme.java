package com.inti;
import javax.persistence.Entity;
import java.util.Date;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ferme {
	private Long idFerme;
	private String nom;
	private Date dateAchat;
	
	@ManyToOne
	@JoinColumn(name="gerant")
	private Gerant gerant;
	
	

}
