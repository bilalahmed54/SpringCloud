package com.vw.springcloudnetflix.eurekaserviceclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import zipkin.server.EnableZipkinServer;

@EnableZipkinServer
@SpringBootApplication
@EnableDiscoveryClient
public class EurekaServiceClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceClientApplication.class, args);
    }
}