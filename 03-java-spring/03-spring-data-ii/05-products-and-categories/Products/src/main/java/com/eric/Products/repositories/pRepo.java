package com.eric.Products.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eric.Products.models.Category;
import com.eric.Products.models.Product;

@Repository
public interface pRepo extends CrudRepository<Product, Long> {
	List<Product> findAll();
	List<Product> findAllByCategories(Category category);
    List<Product> findByCategoriesNotContains(Category category);

}
