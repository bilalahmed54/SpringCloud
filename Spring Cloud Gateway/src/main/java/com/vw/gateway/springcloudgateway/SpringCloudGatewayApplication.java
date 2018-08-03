package com.vw.gateway.springcloudgateway;


import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SpringCloudGatewayApplication {

    private static Logger log = LoggerFactory.getLogger(SpringCloudGatewayApplication.class);

    public static void main(String[] args) {
        log.info("Spring Cloud Gateway Application Initialized.");
        SpringApplication.run(SpringCloudGatewayApplication.class, args);
    }
}