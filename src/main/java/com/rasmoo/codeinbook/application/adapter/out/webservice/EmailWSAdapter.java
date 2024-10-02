package com.rasmoo.codeinbook.application.adapter.out.webservice;

import com.rasmoo.codeinbook.common.dto.response.PaymentResponseDTO;
import com.rasmoo.codeinbook.domain.port.out.webservice.EmailWSPort;
import org.springframework.stereotype.Component;

@Component
public class EmailWSAdapter implements EmailWSPort {

    @Override
    public void send(String paymentId, PaymentResponseDTO paymentResponse) {

    }
}
