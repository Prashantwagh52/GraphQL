package com.prashant.graphql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.prashant.graphql.entity.Order;
import com.prashant.graphql.service.OrderService;

@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;

	@MutationMapping
	public Order createOrder(@Argument String orderDetail, @Argument String address, @Argument int price,
			@Argument int userId) {
		Order order = new Order();
		order.setOrderDetail(orderDetail);
		order.setAddress(address);
		order.setPrice(price);

		return orderService.createOrder(order);
	}

	@MutationMapping
	public boolean deleteOrder(@Argument int orderId) {
		return orderService.deleteOrder(orderId);
	}

	@QueryMapping(name = "getOrders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrders();
	}

	@QueryMapping(name = "getOrder")
	public Order getOrder(@Argument int orderId) {
		return orderService.getorder(orderId);
	}
}
