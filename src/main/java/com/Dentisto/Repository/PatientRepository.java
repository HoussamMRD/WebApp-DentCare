package com.Dentisto.Repository;




import org.springframework.data.jpa.repository.JpaRepository;

import   com.Dentisto.Entity.Patient;



public interface PatientRepository  extends JpaRepository<Patient, Long> {

}
