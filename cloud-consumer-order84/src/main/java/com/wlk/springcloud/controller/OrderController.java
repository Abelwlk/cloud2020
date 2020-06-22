package com.wlk.springcloud.controller;

import cn.hutool.core.lang.UUID;
import com.wlk.springcloud.entity.CommonResult;
import com.wlk.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    public static final String INVOKE_URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;


    @RequestMapping("/consumer/payment/zk")
    public String paymentzk() {
        return restTemplate.getForObject(INVOKE_URL + "/payment/zk", String.class);
    }

}
