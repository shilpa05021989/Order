package com.dynamic.programming.demo.recursion;

import java.util.List;

@Mapper
public interface OrderStatusConverter {

    OrderStatus toOrderStatus(String status);

    List<GroupedOrderStatus> toGroupedOrderStatus(List<Order> orders);
}
