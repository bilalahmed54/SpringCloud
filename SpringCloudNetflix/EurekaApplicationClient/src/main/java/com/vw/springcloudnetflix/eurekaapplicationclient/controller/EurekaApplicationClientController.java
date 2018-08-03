package com.vw.springcloudnetflix.eurekaapplicationclient.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.client.RestTemplateBuilder;

import java.util.ArrayList;
import java.util.List;

@RestController
public class EurekaApplicationClientController {

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private RestTemplateBuilder restTemplateBuilder;

    @RequestMapping("/")
    public String invokeService() {

        RestTemplate restTemplate = restTemplateBuilder.build();
        InstanceInfo instanceInfo = eurekaClient.getNextServerFromEureka("eureka-service-client", false);

        System.out.println("Instance Fetched: " + instanceInfo.getIPAddr() + " :: " + instanceInfo.getPort());

        String serviceBaseUrl = instanceInfo.getHomePageUrl();
        return restTemplate.getForObject(serviceBaseUrl, String.class);
    }
}