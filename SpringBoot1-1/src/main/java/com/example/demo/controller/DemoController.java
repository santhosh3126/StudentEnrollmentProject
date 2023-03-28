package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.EnrollmentModel;
import com.example.demo.Repository.EnrollmentRepository;

@RestController
public class DemoController {
	@Autowired
	  EnrollmentRepository emprep;
    @PostMapping("/getEnrollment")
    public EnrollmentModel getEnrollment(@RequestBody EnrollmentModel enr) {
    return emprep.save(enr);
    }
	@RequestMapping("/demo")
	public List<EnrollmentModel> getName() {
		return emprep.findAll();
	}
	@GetMapping("/san")
	public String getNa() {
		return "santhosh";
	}
}
