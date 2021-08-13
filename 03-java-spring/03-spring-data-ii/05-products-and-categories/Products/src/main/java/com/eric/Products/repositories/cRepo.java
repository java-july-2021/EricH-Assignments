package com.eric.Products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.Products.models.Category;
import com.eric.Products.models.Product;

@Repository
public interface cRepo  extends CrudRepository<Category, Long>{
	List<Category> findAll();
	List<Category> findAllByProducts(Product product);
    List<Category> findByProductsNotContains(Product product);
}
