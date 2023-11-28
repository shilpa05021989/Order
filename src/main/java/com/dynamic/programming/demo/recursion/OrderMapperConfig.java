package com.dynamic.programming.demo.recursion;

import com.dynamic.programming.demo.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

@Configuration
public  class OrderMapperConfig {

    private final OrderService orderService;

    @Autowired
    public OrderMapperConfig(OrderService orderService) {
        this.orderService = orderService;
    }

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();

        // Call the method to group orders by status in the configuration phase
        Map<String, List<Order>> groupedOrders = orderService.groupOrdersByStatus(Arrays.asList(OrderStatus.DELIVERED, OrderStatus.SHIPPED));

        // Add any further configuration if needed

        return modelMapper;
    }
}
