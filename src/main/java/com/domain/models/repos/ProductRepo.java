package com.domain.models.repos;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

import com.domain.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long> {

    List<Product> findByNameContains(String name);

}
