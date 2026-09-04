package com.demo.renderdeploymentpoc.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestClient;

@Configuration
public class RestClientConfig {

  @Bean
  public RestClient client() {
    return RestClient.builder()
        .build();
  }
}
