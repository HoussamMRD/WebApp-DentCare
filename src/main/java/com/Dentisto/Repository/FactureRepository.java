package com.Dentisto.Repository;





import org.springframework.data.jpa.repository.JpaRepository;

import   com.Dentisto.Entity.Facture;







public interface FactureRepository  extends JpaRepository<Facture, Long> {

}