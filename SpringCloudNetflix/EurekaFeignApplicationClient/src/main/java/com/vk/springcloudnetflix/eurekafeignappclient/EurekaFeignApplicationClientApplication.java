package com.vk.springcloudnetflix.eurekafeignappclient;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaFeignApplicationClientApplication {

    private static Logger log = LoggerFactory.getLogger(EurekaFeignApplicationClientApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(EurekaFeignApplicationClientApplication.class, args);
    }
}