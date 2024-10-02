package com.rasmoo.codeinbook.common.dto.response;

import com.rasmoo.codeinbook.common.enums.PaymentStatus;

public record PaymentResponseDTO(

        String id,
        PaymentStatus paymentStatus

) {

}
