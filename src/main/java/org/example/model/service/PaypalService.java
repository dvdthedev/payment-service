package org.example.model.service;

import org.example.model.interfaces.OnlinePaymentService;

public class PaypalService implements OnlinePaymentService {
    @Override
    public Double paymentFee(Double amount) {
        return 0.0;
    }

    @Override
    public Double interest(Double amount, Integer months) {
        return 0.0;
    }
}
