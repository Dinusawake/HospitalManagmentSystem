package com.capgemini.Hospital.Managment.System.Dr_Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Hospital.Managment.System.Dr_Entity.Medicine;
import com.capgemini.Hospital.Managment.System.Entity.Patient;
import com.capgemini.Hospital.Managment.System.Repository.PatientRepository;

public interface MedicineRepository extends JpaRepository<Medicine,Long> {

}