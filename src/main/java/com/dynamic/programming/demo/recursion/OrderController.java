package com.dynamic.programming.demo.recursion;

import com.dynamic.programming.demo.AccoutTransaction;
import com.dynamic.programming.demo.recursion.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

// OrderController.java
@RestController
@RequestMapping("/api/orders")
public class OrderController {

    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/grouped-status")
    public ResponseEntity<Map<String, List<AccoutTransaction>>> groupOrdersByStatus(@RequestParam("status") OrderStatus targetStatus) {
        Map<String, List<AccoutTransaction>> groupedOrders = orderService.groupOrdersByStatus(targetStatus);
        return ResponseEntity.ok(groupedOrders);
    }
}
