package com.inti;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gerant {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long idGerant;
	private String nomGerant;
	private String prenomGerant;
	
	@ManyToOne
	private Ferme ferme;

	public Long getIdGerant() {
		return idGerant;
	}

	public void setIdGerant(Long idGerant) {
		this.idGerant = idGerant;
	}

	public String getNomGerant() {
		return nomGerant;
	}

	public void setNomGerant(String nomGerant) {
		this.nomGerant = nomGerant;
	}

	public String getPrenomGerant() {
		return prenomGerant;
	}

	public void setPrenomGerant(String prenomGerant) {
		this.prenomGerant = prenomGerant;
	}

	public Ferme getFerme() {
		return ferme;
	}

	public void setFerme(Ferme ferme) {
		this.ferme = ferme;
	}
	
	

}
