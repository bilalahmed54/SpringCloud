package com.vw.springcloudnetflix.eurekaserviceclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.vw.springcloudnetflix.eurekaserviceclient.domain.Student;

@RestController
public class EurekaServiceClientController {

    private static Logger log = LoggerFactory.getLogger(EurekaServiceClientController.class.getName());

    @RequestMapping("/")
    String index() {
        log.info("Service Client 9091 Index Method Called!");
        return "Hello World BAY from Client - 9091";
    }

    @RequestMapping("/getStudent")
    Student getStudent() {

        log.info("Service Client 9091 Get Student Method Called!");

        Student student = new Student();

        student.setId(54);
        student.setAge(27);
        student.setGrade(75.56);
        student.setStdName("BAY");
        student.setCountry("Pakistan");

        return student;
    }
}