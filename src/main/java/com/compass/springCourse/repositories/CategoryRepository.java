package com.compass.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.springCourse.entities.Category;

public interface CategoryRepository extends JpaRepository <Category, Long> {

}
