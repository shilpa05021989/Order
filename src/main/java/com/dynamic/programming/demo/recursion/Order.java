package com.dynamic.programming.demo.recursion;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Order {
    private Long id;
    private String customerName;
    private OrderStatus status;

    public Order(long id, String customerName, OrderStatus status) {
        this.id=id;
        this.customerName=customerName;
        this.status=status;
    }

    public void setOrderStatusGroup(Order order) {
        order.getOrderGroup(order);
    }

    private OrderStatusGroup orderStatusGroup;

    private Order getOrderGroup(Order order){
        order.setOrderStatusGroup(getGroup(order));
        return order;
    }
    private Order getGroup(Order o){
        if(o.getStatus() == OrderStatus.PENDING){
            return OrderStatusGroup.PENDING;
        }
        return OrderStatusGroup.COMPLETED;
    }
    // Constructors, getters, and setters
}