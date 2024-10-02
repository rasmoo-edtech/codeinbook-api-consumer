package com.rasmoo.codeinbook.domain.port.out.repository;

import com.rasmoo.codeinbook.common.dto.response.PaymentResponseDTO;

public interface PaymentRepositoryPort {

    void updatePaymentStatus(String paymentId, PaymentResponseDTO paymentResponse);

}
