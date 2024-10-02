package com.rasmoo.codeinbook.domain.service;

import com.rasmoo.codeinbook.common.dto.PaymentDTO;
import com.rasmoo.codeinbook.common.enums.PaymentStatus;
import com.rasmoo.codeinbook.domain.port.in.PaymentServicePort;
import com.rasmoo.codeinbook.domain.port.out.repository.PaymentRepositoryPort;
import com.rasmoo.codeinbook.domain.port.out.webservice.EmailWSPort;
import com.rasmoo.codeinbook.domain.port.out.webservice.PaymentWSPort;

public class PaymentService implements PaymentServicePort {

    private final PaymentWSPort paymentWSPort;

    private final PaymentRepositoryPort paymentRepositoryPort;

    private final EmailWSPort emailWSPort;

    public PaymentService(PaymentWSPort paymentWSPort, PaymentRepositoryPort paymentRepositoryPort,
                          EmailWSPort emailWSPort) {
        this.paymentWSPort = paymentWSPort;
        this.paymentRepositoryPort  = paymentRepositoryPort;
        this.emailWSPort = emailWSPort;
    }


    @Override
    public void process(PaymentDTO dto) {
        var response = paymentWSPort.process(dto);
        paymentRepositoryPort.updatePaymentStatus(dto.id(), response);
        if (!PaymentStatus.PROCESSING.equals(response.paymentStatus())) {
            emailWSPort.send(dto.id(), response);
        }
    }

}
