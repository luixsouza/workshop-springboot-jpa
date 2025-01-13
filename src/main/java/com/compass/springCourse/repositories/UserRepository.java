package com.compass.springCourse.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.compass.springCourse.entities.User;

public interface UserRepository extends JpaRepository <User, Long> {

}
