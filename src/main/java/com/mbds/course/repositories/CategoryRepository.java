package com.mbds.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mbds.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
