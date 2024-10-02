package com.rasmoo.codeinbook.application.adapter.out.repository;

import com.rasmoo.codeinbook.common.dto.response.PaymentResponseDTO;
import com.rasmoo.codeinbook.domain.port.out.repository.PaymentRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public class PaymentRepositoryAdapter implements PaymentRepositoryPort {
    @Override
    public void updatePaymentStatus(String paymentId, PaymentResponseDTO paymentResponse) {

    }
}
