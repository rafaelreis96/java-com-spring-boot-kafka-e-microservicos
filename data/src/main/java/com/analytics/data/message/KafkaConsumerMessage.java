package com.analytics.data.message;

 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.analytics.data.dto.CarPostDTO;
import com.analytics.data.service.PostAnalyticsService;

@Component
public class KafkaConsumerMessage {

	private final Logger LOG =  LoggerFactory.getLogger(KafkaConsumerMessage.class);
	
	@Autowired
	private PostAnalyticsService postAnalyticsService;
	
	@KafkaListener(topics = "car-post-topic", groupId="analytics-posts-group")
	public void listening(CarPostDTO carPostDTO) {
		LOG.info("ANALYTICS DATA - Received Car Post Information: {}", carPostDTO);
		postAnalyticsService.saveDataAnalytics(carPostDTO);
	}
}
 