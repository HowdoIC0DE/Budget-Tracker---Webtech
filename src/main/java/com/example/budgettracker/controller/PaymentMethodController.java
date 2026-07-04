package com.example.budgettracker.controller;

import com.example.budgettracker.model.PaymentMethod;
import com.example.budgettracker.repository.PaymentMethodRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class PaymentMethodController {

    private final PaymentMethodRepository paymentMethodRepository;

    public PaymentMethodController(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    @GetMapping("/payment-methods")
    public List<PaymentMethod> getPaymentMethods() {
        return paymentMethodRepository.findAll();
    }

    @PostMapping("/payment-methods")
    public PaymentMethod createPaymentMethod(@RequestBody PaymentMethod paymentMethod) {
        return paymentMethodRepository.save(paymentMethod);
    }
}
