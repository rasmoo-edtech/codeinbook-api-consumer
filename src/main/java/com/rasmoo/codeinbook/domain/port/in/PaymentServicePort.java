package com.rasmoo.codeinbook.domain.port.in;

import com.rasmoo.codeinbook.common.dto.PaymentDTO;

public interface PaymentServicePort {

    void process(PaymentDTO dto);

}
