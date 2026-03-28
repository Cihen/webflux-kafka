package com.thucchien02.commonservice.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReactiveKafkaAppProperties {
    @Value("${kafka.bootstrap.servers}") // port bootstrap server
    String bootstrapServers;

    @Value("${payment.kafka.consumer-group-id}") // consumer group id
    String consumerGroupId;
}
