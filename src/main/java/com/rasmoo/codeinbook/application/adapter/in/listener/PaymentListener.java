package com.rasmoo.codeinbook.application.adapter.in.listener;

import com.rasmoo.codeinbook.common.dto.PaymentDTO;
import com.rasmoo.codeinbook.domain.port.in.PaymentServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PaymentListener {

    private final PaymentServicePort paymentServicePort;

    @KafkaListener(topics = "payment-topic", groupId = "group")
    public void paymentTopicEvent(PaymentDTO message) {
        paymentServicePort.process(message);
    }
}
