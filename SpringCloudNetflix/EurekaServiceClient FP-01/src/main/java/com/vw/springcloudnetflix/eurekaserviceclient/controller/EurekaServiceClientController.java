package com.vw.springcloudnetflix.eurekaserviceclient.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.hazelcast.core.HazelcastInstance;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vw.springcloudnetflix.eurekaserviceclient.domain.Student;

@RestController
public class EurekaServiceClientController {

    private static Logger log = LoggerFactory.getLogger(EurekaServiceClientController.class.getName());

    @Autowired
    private HazelcastInstance instance;

    @RequestMapping("/write")
    String writeDataInCache(@RequestParam("value")String value) {

        java.util.Map<String,String> stringStringMap = instance.getMap("records");    // get map from hazel cast
        stringStringMap.put("data",value);

        return "Data Written in Cache: " + stringStringMap.get("data");
    }

    @RequestMapping("/read")
    String readDataFromCache() {
        java.util.Map<String,String> stringStringMap = instance.getMap("records");
        return "Data Fetched from Cache: " + stringStringMap.get("data");
    }

    @RequestMapping("/")
    String index() {
        log.info("Service Client 9094 Index Method Called.");
        return "Hello World BAY from Client - 9094";
    }

    @RequestMapping("/getStudent")
    Student getStudent() {

        log.info("Service Client 9094 Get Student Method Called.");

        Student student = new Student();

        student.setId(54);
        student.setAge(27);
        student.setGrade(75.56);
        student.setStdName("BAY");
        student.setCountry("Pakistan");

        return student;
    }
}