package com.sucre.jpatravel.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sucre.jpatravel.dao.PaymentRepository;
import com.sucre.jpatravel.model.Payment;
import com.sucre.jpatravel.service.PaymentService;

import cn.hutool.core.date.DateUtil;

@Service
@CacheConfig(cacheNames = "caffeineCacheManager")
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    @Cacheable(key = "#id")
    public Payment getPaymentInfo() {
    	String id="1";
    	System.out.println("coming..."+ DateUtil.date());
        Payment payment =  paymentRepository.findAll().stream().findFirst().get();
      return payment;

    }
}
