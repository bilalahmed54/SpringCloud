package com.vw.springcloudnetflix.eurekaapplicationclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EurekaApplicationClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicationClientApplication.class, args);
    }
}