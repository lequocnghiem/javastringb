package com.example.demo.respone;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Entity.Product;

@Repository
public interface ResourceNotFoundException extends JpaRepository<Product, Long> {
	  Optional<Product> findByimageData(byte[] imageData);
}

