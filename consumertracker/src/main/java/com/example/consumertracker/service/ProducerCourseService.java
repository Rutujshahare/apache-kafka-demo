package com.example.consumertracker.service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.example.consumertracker.constant.AppConstant;
import com.example.producertracker.DTO.Course;

@Service
public class ProducerCourseService {	
	
	
	String messageString="";
	public String getMessageString() {
		return messageString;
	}
	public void setMessageString(String messageString) {
		this.messageString = messageString;
	}
	@KafkaListener(topics = AppConstant.TOPIC_NAME_STRING,groupId = AppConstant.TOPIC_NAME_STRING)
	public void UpdateCourseConsumer(Course course) {
		messageString=course+" the data has been recieved by producer";
		System.out.println(messageString);
	}
}
