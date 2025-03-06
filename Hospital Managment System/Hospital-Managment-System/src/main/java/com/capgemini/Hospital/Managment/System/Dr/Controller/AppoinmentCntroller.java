package com.capgemini.Hospital.Managment.System.Dr.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.Hospital.Managment.System.Dr_Entity.Appoinment;
import com.capgemini.Hospital.Managment.System.Dr_Repository.AppoinmentRepository;

@RestController
@RequestMapping("api/v1")
public class AppoinmentCntroller {

	private AppoinmentRepository appoinmentRepository;

	public AppoinmentCntroller(AppoinmentRepository appoinmentRepository) {
		super();
		this.appoinmentRepository = appoinmentRepository;
	}

	@PostMapping("/createaapoinment")
	public Appoinment createAppoinment(@RequestBody Appoinment appoinment) {
		return appoinmentRepository.save(appoinment);
	}

}