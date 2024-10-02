package com.rasmoo.codeinbook.application.configuration;

import com.rasmoo.codeinbook.domain.port.out.repository.PaymentRepositoryPort;
import com.rasmoo.codeinbook.domain.port.out.webservice.EmailWSPort;
import com.rasmoo.codeinbook.domain.port.out.webservice.PaymentWSPort;
import com.rasmoo.codeinbook.domain.service.PaymentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {


    @Bean
    public PaymentService paymentService(PaymentWSPort paymentWSPort, PaymentRepositoryPort paymentRepositoryPort,
                                         EmailWSPort emailWSPort) {
        return new PaymentService(paymentWSPort, paymentRepositoryPort, emailWSPort);
    }

}
