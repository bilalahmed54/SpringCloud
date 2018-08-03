package com.vw.springcloudconfigclient.springcloudconfigclient.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class CloudConfigClient {

    @Value("${myName}")
    String myName;

    @RequestMapping("/")
    String getReadCloudConfigServerProperties() {
        return "Hello World: " + myName;
    }
}