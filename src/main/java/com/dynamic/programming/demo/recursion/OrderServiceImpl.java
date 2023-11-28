package com.dynamic.programming.demo.recursion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;


// OrderServiceImpl.java
// OrderServiceImpl.java
@Service
public class OrderServiceImpl implements OrderService {


    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Map<String, List<Order>> groupOrdersByStatus(OrderStatus targetStatus) {
        List<Order> orders = orderRepository.getAllOrders();

        Map<String, List<Order>> groupedOrders = new HashMap<>();

        // Use if condition to group orders based on the target status
        if (targetStatus == OrderStatus.PENDING) {
            groupedOrders.put("Pending Orders", orders.stream()
                    .filter(order -> order.getStatus() == OrderStatus.PENDING)
                    .collect(Collectors.toList()));
        } else if (targetStatus == OrderStatus.SHIPPED) {
            groupedOrders.put("Shipped Orders", orders.stream()
                    .filter(order -> order.getStatus() == OrderStatus.SHIPPED)
                    .collect(Collectors.toList()));
        } // Add more conditions as needed

        return groupedOrders;
    }

    private List<Order> getAllOrders() {
        // Implement logic to fetch orders from the database
        // For simplicity, returning a static list here
        // Replace this with your actual data source
        // For example, you could use JPA repositories to interact with a database
        return Arrays.asList(
                new Order(1L, "John Doe", OrderStatus.PENDING),
                new Order(2L, "Jane Doe", OrderStatus.PROCESSING),
                new Order(3L, "Alice", OrderStatus.SHIPPED),
                new Order(4L, "Bob", OrderStatus.PENDING),
                new Order(5L, "Charlie", OrderStatus.SHIPPED)
                // Add more orders as needed
        );
    }

}



