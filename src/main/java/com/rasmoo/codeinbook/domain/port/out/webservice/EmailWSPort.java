package com.rasmoo.codeinbook.domain.port.out.webservice;

import com.rasmoo.codeinbook.common.dto.response.PaymentResponseDTO;

public interface EmailWSPort {

    void send(String paymentId, PaymentResponseDTO paymentResponse);
}
