package com.rasmoo.codeinbook.application.adapter.out.webservice;

import com.rasmoo.codeinbook.common.dto.PaymentDTO;
import com.rasmoo.codeinbook.common.dto.response.PaymentResponseDTO;
import com.rasmoo.codeinbook.domain.port.out.webservice.PaymentWSPort;
import org.springframework.stereotype.Component;

@Component
public class PaymentWSAdapter implements PaymentWSPort {
    @Override
    public PaymentResponseDTO process(PaymentDTO dto) {
        return null;
    }
}
