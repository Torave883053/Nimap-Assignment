package com.ecommerce.app.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.app.pojos.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}