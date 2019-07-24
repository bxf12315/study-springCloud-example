package com.learning.spring.cloud.eurekaconsumer.consumer;

import org.springframework.stereotype.Component;

@Component
public class ApiServiceError implements ApiService {

    @Override
    public String index() {
        return "server is down！";
    }
}
