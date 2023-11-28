package com.dynamic.programming.demo.recursion;

import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@Getter
@NoArgsConstructor
public class GroupedOrderStatus {
    private OrderStatus status;
    private List<Order> orders;

    public GroupedOrderStatus(OrderStatus status, List<Order> orders) {
        this.status=status;
        this.orders=orders;
    }


    // Constructors, getters, and setters
}