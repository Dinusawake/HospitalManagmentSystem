package com.capgemini.Hospital.Managment.System.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Hospital.Managment.System.Entity.Patient;
import com.capgemini.Hospital.Managment.System.Repository.PatientRepository;


@RestController
@RequestMapping("api/v1")
public class PatientController {

	private PatientRepository patientRepository;

	public PatientController(PatientRepository patintRepository) {
		super();
		this.patientRepository = patintRepository;
	}

	@PostMapping("/insert")
	public Patient createPatient(@RequestBody Patient patient) {
		return patientRepository.save(patient);
	}

}
