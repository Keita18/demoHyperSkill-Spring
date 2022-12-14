package org.hyperskill.demohyperskill;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Address {

    @Bean("greenStreet")
    public String address() {
        return "Green Street, 102";
    }

    @Bean
    public String address1() {
        return "Green Street, 112";
    }

    @Bean
    public String address2() {
        return "Apple Street, 15";
    }

}
