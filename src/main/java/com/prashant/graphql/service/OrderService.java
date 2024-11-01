package com.prashant.graphql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prashant.graphql.entity.Order;
import com.prashant.graphql.exception.ExceptionHandler;
import com.prashant.graphql.repository.OrderRepository;

@Service
public class OrderService implements IOrder {

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrder(Order order) {
		return orderRepository.save(order);
	}

	@Override
	public List<Order> getAllOrders() {
		return orderRepository.findAll();
	}

	@Override
	public Order getorder(int orderId) {
		return orderRepository.findById(orderId).orElseThrow(ExceptionHandler::throwResourceNotFoundException);
	}

	@Override
	public boolean deleteOrder(int orderId) {
		Order order = orderRepository.findById(orderId).orElseThrow(ExceptionHandler::throwResourceNotFoundException);
		orderRepository.delete(order);
		return true;
	}

}
