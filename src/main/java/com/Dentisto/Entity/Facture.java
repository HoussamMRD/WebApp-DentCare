package com.Dentisto.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "factures")


public class Facture {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	
	@Column(name = "name_Patient")
	private String NamePatient;
	
	
	@Column(name = "Montant_Payee")
	private String MontantPayee;
	
	@Column(name = "Mode_Payment")
	private String ModePayment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNamePatient() {
		return NamePatient;
	}

	public void setNamePatient(String namePatient) {
		this.NamePatient = namePatient;
	}

	public String getMontantPayee() {
		return MontantPayee;
	}

	public void setMontantPayee(String montantPayee) {
		this.MontantPayee = montantPayee;
	}

	public String getModePayment() {
		return ModePayment;
	}

	public void setModePayment(String modePayment) {
		this.ModePayment = modePayment;
	}

	public Facture(Long id, String namePatient, String montantPayee, String modePayment) {
		super();
		this.id = id;
		this.NamePatient = namePatient;
		this.MontantPayee = montantPayee;
		this.ModePayment = modePayment;
	}
	
	
	
public Facture() {
		
	}
	
	
	

}
