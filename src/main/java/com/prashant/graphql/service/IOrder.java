package com.prashant.graphql.service;

import java.util.List;

import com.prashant.graphql.entity.Order;

public interface IOrder {

	public Order createOrder(Order order);

	public List<Order> getAllOrders();

	public Order getorder(int orderId);

	public boolean deleteOrder(int orderId);

}
