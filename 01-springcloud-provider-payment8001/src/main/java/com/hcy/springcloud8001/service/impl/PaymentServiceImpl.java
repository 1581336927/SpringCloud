package com.hcy.springcloud8001.service.impl;


import com.hcy.springcloud8001.dao.PaymentDao;
import com.hcy.springcloud.entities.Payment;
import com.hcy.springcloud8001.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;


    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
