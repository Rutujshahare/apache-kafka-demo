package com.example.consumertrackercontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.consumertracker.DTO.Course;
import com.example.consumertracker.service.ProducerCourseService;

@RestController
@RequestMapping("/kafkaconsumer")
public class ProducerController {
	
	@Autowired
public ProducerCourseService producerservice;
	@GetMapping("/getCourse")
	public ResponseEntity<String> addProducerCourse(){
		String responseString=this.producerservice.getMessageString();
		return new ResponseEntity<String>(responseString,HttpStatus.OK);
	}
}
