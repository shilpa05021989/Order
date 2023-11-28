package com.dynamic.programming.demo.recursion;

import java.util.List;
import java.util.Map;

// OrderService.java
public interface OrderService {
 Map<String, List<Order>> groupOrdersByStatus(OrderStatus targetStatus);
}

