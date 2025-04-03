package com.example.paymentservice.service;

import com.example.paymentservice.dto.PaymentRequest;
import com.example.paymentservice.dto.PaymentResponse;
import com.example.paymentservice.model.Payment;
import java.util.List;

public interface PaymentService {
    PaymentResponse processPayment(PaymentRequest paymentRequest);
    Payment getPaymentById(String paymentId);
    List<Payment> getPaymentsByOrderId(Long orderId);
    List<Payment> getPaymentsByUserId(Long userId);
}