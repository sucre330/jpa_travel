package com.sucre.jpatravel.controller;

import com.sucre.jpatravel.model.Payment;
import com.sucre.jpatravel.service.PaymentService;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/payment")
@RestController
public class PaymentController {

//    LoggerFactory.getLogger()

    @Resource
    private PaymentService paymentService;

    @PostMapping("/paymentInfo")
    public Payment paymentInfo(){
        return  paymentService.getPaymentInfo();
    }

}
