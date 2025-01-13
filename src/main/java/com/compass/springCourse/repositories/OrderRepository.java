package com.compass.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.springCourse.entities.Order;

public interface OrderRepository extends JpaRepository <Order, Long> {

}
