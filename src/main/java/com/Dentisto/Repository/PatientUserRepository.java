package com.Dentisto.Repository;




import org.springframework.data.jpa.repository.JpaRepository;


import   com.Dentisto.Entity.PatientUser;






public interface PatientUserRepository extends JpaRepository<PatientUser, Long> {

}
