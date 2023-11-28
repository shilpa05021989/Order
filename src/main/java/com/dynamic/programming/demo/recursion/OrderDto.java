package com.dynamic.programming.demo.recursion;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class OrderDto {
    //private Long id;
    //private String customerName;
    private OrderStatus status;

    public OrderDto(OrderStatus status) {
        this.status=status;
    }

    // Constructors, getters, and setters


    // Constructors, getters, and setters
}