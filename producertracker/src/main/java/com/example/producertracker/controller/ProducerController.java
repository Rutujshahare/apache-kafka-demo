package com.example.producertracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.producertracker.DTO.Course;
import com.example.producertracker.service.ProducerCourseService;

@RestController
@RequestMapping("/kafkaproducer")
public class ProducerController {
	
	@Autowired
public ProducerCourseService producerservice;
	
	@PostMapping("/addCourse")
	public ResponseEntity<String> addProducerCourse(@RequestBody  Course course){
		String responseString=this.producerservice.updateCourse(course);
		return new ResponseEntity<String>(responseString,HttpStatus.OK);
	}
}
