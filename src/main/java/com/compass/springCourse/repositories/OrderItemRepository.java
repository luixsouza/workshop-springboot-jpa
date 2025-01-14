package com.compass.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.springCourse.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository <OrderItem, Long> {

}
