package com.vk.springcloudnetflix.eurekafeignappclient.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import com.vk.springcloudnetflix.eurekafeignappclient.domain.Student;

@FeignClient(name = "eureka-service-client")
public interface IEurekaServiceClientInterface {

    @RequestMapping("/")
    String index();

    @RequestMapping("/getStudent")
    Student getStudent();
}