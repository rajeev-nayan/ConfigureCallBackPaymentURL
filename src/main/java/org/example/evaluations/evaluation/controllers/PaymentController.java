package org.example.evaluations.evaluation.controllers;

import org.example.evaluations.evaluation.dtos.CompletePaymentDto;
import org.example.evaluations.evaluation.services.IPaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    private IPaymentService paymentService;

    @PostMapping("/completePayment")
    public String completePayment(@RequestBody CompletePaymentDto dto) {

        return paymentService.completePayment(dto.getName(), dto.getPhoneNumber(), dto.getEmail(), dto.getAmount(),
                dto.getDescription(), dto.getOrderId(), dto.getCallback());
    }
}
