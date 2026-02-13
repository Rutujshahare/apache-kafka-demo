package com.example.producertracker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.example.producertracker.DTO.Course;
import com.example.producertracker.constant.AppConstant;

@Service
public class ProducerCourseService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate; 
	
	public String updateCourse(Course course) {
		kafkaTemplate.send(AppConstant.TOPIC_NAME_STRING,course);
		return "Course has been updated successfully by Producer team ";
	}
}
