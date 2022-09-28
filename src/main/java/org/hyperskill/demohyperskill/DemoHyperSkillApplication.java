package org.hyperskill.demohyperskill;

import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoHyperSkillApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoHyperSkillApplication.class, args);
    }

    @Bean
    public Customer customer(@Qualifier("address2") String address) {
        return new Customer("Clara Foster", address);
    }

    @Bean
    public int temporary(@Autowired Customer customer) {
        System.out.println(customer);
        return 2;
    }

    @Bean
    public int temporaryTest(int customer, @Qualifier("address1") String address) {
        System.out.println("second : \n" +customer);
        System.out.println("second : \n" +address);

        return customer;
    }
}
