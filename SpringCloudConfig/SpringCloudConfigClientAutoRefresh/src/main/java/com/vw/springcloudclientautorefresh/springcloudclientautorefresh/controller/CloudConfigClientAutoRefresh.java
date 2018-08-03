package com.vw.springcloudclientautorefresh.springcloudclientautorefresh.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@RefreshScope
@RestController
public class CloudConfigClientAutoRefresh {

    @Value("${myName}")
    String myName;

    @RequestMapping("/")
    String getReadCloudConfigServerProperties() {
        return "Hello World: " + myName;
    }
}