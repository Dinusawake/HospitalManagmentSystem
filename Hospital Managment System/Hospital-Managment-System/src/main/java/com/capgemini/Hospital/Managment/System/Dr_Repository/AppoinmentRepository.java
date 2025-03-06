package com.capgemini.Hospital.Managment.System.Dr_Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capgemini.Hospital.Managment.System.Dr_Entity.Appoinment;

public interface AppoinmentRepository extends JpaRepository<Appoinment,Long>{

}
