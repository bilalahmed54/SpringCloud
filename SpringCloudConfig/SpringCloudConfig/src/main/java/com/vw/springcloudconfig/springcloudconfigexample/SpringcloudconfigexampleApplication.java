package com.vw.springcloudconfig.springcloudconfigexample;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableConfigServer
@SpringBootApplication
public class SpringcloudconfigexampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudconfigexampleApplication.class, args);
    }
}