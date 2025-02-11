package com.devspring.hr_payroll.service;

import com.devspring.hr_payroll.entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment gePayment(long workerId, int days){
        return new Payment("Bob", 200.0, days);
    }

}
