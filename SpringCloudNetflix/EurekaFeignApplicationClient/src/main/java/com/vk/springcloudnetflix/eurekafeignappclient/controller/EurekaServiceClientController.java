package com.vk.springcloudnetflix.eurekafeignappclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vk.springcloudnetflix.eurekafeignappclient.domain.Student;
import com.vk.springcloudnetflix.eurekafeignappclient.interfaces.IEurekaServiceClientInterface;

@RestController
public class EurekaServiceClientController {


    private static Logger log = LoggerFactory.getLogger(EurekaServiceClientController.class.getName());

    @Autowired
    IEurekaServiceClientInterface eurekaServiceClientInterface;

    @RequestMapping("/")
    String index() {
        log.info("Feign Client - Calling Service Client Index Method");
        return eurekaServiceClientInterface.index();
    }

    @RequestMapping("/feign")
    String feignService() {
        log.info("Feign Client Own Feign Method Called!");
        return "Feign Own Service";
    }

    @RequestMapping("/getStudent")
    Student getStudent() {
        log.info("Feign Client - Calling Service Client Get Student Method");
        return eurekaServiceClientInterface.getStudent();
    }
}