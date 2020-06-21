package com.wlk.springcloud.service;

import com.wlk.springcloud.entity.Payment;

public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(Long id);
}
