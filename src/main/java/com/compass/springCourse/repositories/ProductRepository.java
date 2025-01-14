package com.compass.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.springCourse.entities.Product;

public interface ProductRepository extends JpaRepository <Product, Long> {

}
