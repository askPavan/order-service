package com.javadzone.order.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javadzone.order.bean.Order;

@RestController
@RequestMapping("/orders")
public class OrderController {

	private List<Order> orders = new ArrayList<>();
	private Long orderCounter = 1L;
	
	@PostMapping("/create")
	public Order createOrder(@RequestBody Order order) {
		order.setId(orderCounter++);
		orders.add(order);
		return order;
	}
	
	@GetMapping
	public List<Order> getOrders() {
		return orders;
	}
	
}
