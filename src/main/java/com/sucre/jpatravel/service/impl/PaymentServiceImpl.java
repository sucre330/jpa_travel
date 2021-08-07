package com.sucre.jpatravel.service.impl;

import com.sucre.jpatravel.dao.PaymentRepository;
import com.sucre.jpatravel.model.Payment;
import com.sucre.jpatravel.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Override
    public Payment getPaymentInfo() {
//        return paymentRepository.findOneById(1);
      List<Payment> list=  paymentRepository.findAll();
      return null;

    }
}
