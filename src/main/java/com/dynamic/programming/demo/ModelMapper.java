package com.dynamic.programming.demo;

import com.dynamic.programming.demo.recursion.Order;
import com.dynamic.programming.demo.recursion.OrderDto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
