package com.example.consumertracker.constant;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class ProducerConfiguration {

	public NewTopic topic() {
		return TopicBuilder.name(AppConstant.TOPIC_NAME_STRING).build();
	}
}
