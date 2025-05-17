package com.mbds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbds.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
