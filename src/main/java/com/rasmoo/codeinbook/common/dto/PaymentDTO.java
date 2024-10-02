package com.rasmoo.codeinbook.common.dto;


import com.rasmoo.codeinbook.common.enums.PaymentStatus;

import java.math.BigDecimal;
import java.util.List;

public record PaymentDTO(

        String id,

        UserInfoDTO userInfo,

        CreditCardInfoDTO creditCardInfo,

        List<BookDTO> bookList,

        PaymentStatus paymentStatus
) {

    public record UserInfoDTO(

            String firstName,
            String lastName,
            String cpf
    ) {

    }
    public record CreditCardInfoDTO(
            String number,
            String fullName,
            String securityCode,
            String expirationYear
    ) {

    }

    public record BookDTO(
            String id,
            String title,
            BigDecimal price


    ) {
    }
}
