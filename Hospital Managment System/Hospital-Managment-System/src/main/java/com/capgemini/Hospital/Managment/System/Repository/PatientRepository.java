package com.capgemini.Hospital.Managment.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.Hospital.Managment.System.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient,Long> {
	
	
	

}
