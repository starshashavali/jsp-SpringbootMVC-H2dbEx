package com.tcs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tcs.entity.ProductEntity;
@Repository
public interface ProductRepositary extends JpaRepository<ProductEntity, Integer> {

}
