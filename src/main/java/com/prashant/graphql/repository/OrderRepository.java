package com.prashant.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prashant.graphql.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
