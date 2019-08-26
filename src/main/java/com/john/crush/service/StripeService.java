package com.john.crush.service;

import org.springframework.stereotype.Service;

import com.john.crush.user.ChargeRequest;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;

@Service
public interface StripeService {
    public void init();
    public Charge charge(ChargeRequest chargeRequest)  throws StripeException;
}
