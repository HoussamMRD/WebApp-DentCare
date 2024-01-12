package com.Dentisto.Entity;




import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.*;



@Entity 
@Table(name = "patients")



public class Patient {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "First_name", nullable = false)
	private String FirstName;
	
	@Column(name = "Last_name")
	private String LastName;
	
	
	@Column(name = "CIN")
	private String CIN;
	
	@Column(name = "Email")
	private String Email;
	
	@Column(name = "Adress")
	private String Adress;
	
	
	@Column(name = "Tel")
	private String Tel;
	
	
	@Column(name = "Gender")
	private Gender Gender;
	
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DateNaissance;
	
	
	


	public Patient(Long id, String firstName, String lastName, String cIN, String email, String adress, String tel,
			com.Dentisto.Entity.Gender gender, Date dateNaissance) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.CIN = cIN;
		this.Email = email;
		this.Adress = adress;
		this.Tel = tel;
		this.Gender = gender;
		this.DateNaissance = dateNaissance;
	}


	public Patient() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getFirstName() {
		return FirstName;
	}


	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		this.LastName = lastName;
	}


	public String getCIN() {
		return CIN;
	}


	public void setCIN(String cIN) {
		this.CIN = cIN;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		this.Email = email;
	}


	public String getAdress() {
		return Adress;
	}


	public void setAdress(String adress) {
		this.Adress = adress;
	}


	public String getTel() {
		return Tel;
	}


	public void setTel(String tel) {
		this.Tel = tel;
	}


	public Gender getGender() {
		return Gender;
	}


	public void setGender(Gender gender) {
		this.Gender = gender;
	}


	public Date getDateNaissance() {
		return DateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.DateNaissance = dateNaissance;
	}
	
	
	
	
	
	
	
	

}
