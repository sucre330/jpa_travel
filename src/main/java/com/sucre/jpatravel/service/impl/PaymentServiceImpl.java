package com.sucre.jpatravel.service.impl;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.util.ObjectUtil;
import com.github.benmanes.caffeine.cache.Cache;
import com.sucre.jpatravel.dao.PaymentRepository;
import com.sucre.jpatravel.model.Payment;
import com.sucre.jpatravel.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Administrator
 */
@Slf4j
@Service
public class PaymentServiceImpl implements PaymentService {



    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private Cache<String,Object> caffeineCache;

    @Override
    public Payment getPaymentInfo() {
        System.out.println("coming..."+ DateUtil.date());
        String id = "1";
        Payment payment = (Payment)caffeineCache.getIfPresent(id);
        if(ObjectUtil.isNotEmpty(payment)){
            System.out.println("从缓存里取");
            return  payment;
        }
        System.out.println("从数据库里取");
        payment =  paymentRepository.findAll().stream().findFirst().get();
        caffeineCache.put(id,payment);
      return payment;
    }
}
