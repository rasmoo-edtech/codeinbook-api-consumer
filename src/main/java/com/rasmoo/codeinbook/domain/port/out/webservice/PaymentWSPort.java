package com.rasmoo.codeinbook.domain.port.out.webservice;

import com.rasmoo.codeinbook.common.dto.PaymentDTO;
import com.rasmoo.codeinbook.common.dto.response.PaymentResponseDTO;

public interface PaymentWSPort {

    PaymentResponseDTO process(PaymentDTO dto);
}
