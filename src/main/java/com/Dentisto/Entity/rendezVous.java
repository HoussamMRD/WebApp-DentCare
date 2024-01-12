package com.Dentisto.Entity;





import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.*;



@Entity 
@Table(name = "rendvous")











public class rendezVous {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = " Name_Patient", nullable = false)
	private String Name_Patient;
	
	
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DateRV;
	

	
	@Column(name = "heure")
	private String heure;

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	public rendezVous(Long id, String name_Patient, Date dateRV, String heure) {
		super();
		this.id = id;
		this.Name_Patient = name_Patient;
		this.DateRV = dateRV;
		this.heure = heure;
	}



	public rendezVous() {
		// TODO Auto-generated constructor stub
	}



	public Long getId() {
		return id;
	}



	public void setIdRV(Long id) {
		this.id = id;
	}



	public String getName_Patient() {
		return Name_Patient;
	}



	public void setName_Patient(String name_Patient) {
		Name_Patient = name_Patient;
	}



	public Date getDateRV() {
		return DateRV;
	}



	public void setDateRV(Date dateRV) {
		DateRV = dateRV;
	}



	public String getHeure() {
		return heure;
	}



	public void setHeure(String heure) {
		this.heure = heure;
	}
	


	
	
	
	
	
	
	
	
	
	
	
	
	
}
