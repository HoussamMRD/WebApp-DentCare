package com.Dentisto.Entity;




import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

import javax.persistence.*;








@Entity 
@Table(name = "medicFile")

















public class MedicFile {
	
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "First_name", nullable = false)
	private String FirstName;
	
	@Column(name = "Last_name")
	private String LastName;
	
	
	
	@Column(name = "Age")
	private String Age;
	
	
	
	@Column(name = "Gender")
	private Gender Gender;
	
	
	@Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date DateNaissance;
	
	
	
	
	@Column(name = "Dental_treatment")
	private String Dental_treatment;




	
	
	
	
	
	
	
	
	
	
	
	
public MedicFile() {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public MedicFile(Long id, String firstName, String lastName, String age, com.Dentisto.Entity.Gender gender,
			Date dateNaissance, String dental_treatment) {
		super();
		this.id = id;
		this.FirstName = firstName;
		this.LastName = lastName;
		this.Age = age;
		this.Gender = gender;
		this.DateNaissance = dateNaissance;
		this.Dental_treatment = dental_treatment;
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




	public String getAge() {
		return Age;
	}




	public void setAge(String age) {
		this.Age = age;
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




	public String getDental_treatment() {
		return Dental_treatment;
	}




	public void setDental_treatment(String dental_treatment) {
		this.Dental_treatment = dental_treatment;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
