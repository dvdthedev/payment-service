package org.example.model.service;

import org.example.model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double interest(Double amount, Integer months) {
        double interestValue = 0.01;
        return amount * (interestValue * months);
    }

    @Override
    public Double paymentFee(Double amount) {
        double feeValue = 0.02;
        return amount * feeValue;
    }


}
