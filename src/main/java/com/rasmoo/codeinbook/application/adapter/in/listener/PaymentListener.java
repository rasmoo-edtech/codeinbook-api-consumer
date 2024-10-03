package com.rasmoo.codeinbook.application.adapter.in.listener;

import com.rasmoo.codeinbook.common.dto.PaymentDTO;
import com.rasmoo.codeinbook.domain.port.in.PaymentServicePort;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class PaymentListener {

    private final PaymentServicePort paymentServicePort;

    @KafkaListener(topics = "payment-topic", groupId = "group-payment")
    public void paymentTopicEvent(PaymentDTO message, Acknowledgment acknowledgment) {
        log.info("consumer 1 - id {}", message.id() );
   //     paymentServicePort.process(message);
        acknowledgment.acknowledge();
    }
}
