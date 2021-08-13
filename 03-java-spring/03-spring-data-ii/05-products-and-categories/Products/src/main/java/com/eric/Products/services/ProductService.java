package com.eric.Products.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.eric.Products.models.Category;
import com.eric.Products.models.Product;
import com.eric.Products.repositories.cRepo;
import com.eric.Products.repositories.pRepo;


@Service
public class ProductService {
	private final pRepo pRepo;
	private final cRepo cRepo;

	public ProductService(pRepo pRepo, cRepo cRepo) {
		this.pRepo = pRepo;
		this.cRepo = cRepo;
	}
	public List<Category> allCategories(){
		return cRepo.findAll();
	}
	public List<Product> allProducts(){
		return pRepo.findAll();
	}
	
	public List<Category> productNotIn(Product product){
		return cRepo.findByProductsNotContains(product);
	}
	public List<Product> categoryNotIn(Category category){
		return pRepo.findByCategoriesNotContains(category);
	}
	
	public Category createCategory(Category category) {
		return cRepo.save(category);
	}
	public Category getCategory(Long id) {
		return cRepo.findById(id).orElse(null);
	}
	
	public Product createProduct(Product product) {
		return pRepo.save(product);
	}
	public Product getProduct(Long id) {
		return pRepo.findById(id).orElse(null);
	}
	public void addCatToPro(Product product, Category category) {
		product.getCategories().add(category);
		pRepo.save(product);
	}
	public void addProbToCat(Product product, Category category) {
		category.getProducts().add(product);
		cRepo.save(category);
	}
	
}


// retrieve an instance of a category using another method in the service.
// Category thisCategory = findCategoryById(categoryId);

// retrieve an instance of a product using another method in the service.
// Product thisProduct = findProductById(productId);

// add the product to this category's list of products
// thisCategory.products.add(thisProduct);

// Save thisCategory, since you made changes to its product list.
// categoryRepository.save(thisCategory);

// This has the same affect as above:
// thisProduct.getCategories().add(thisCategory);	// add the category to this products's list of categories
// productRepository.save(product);	// Save thisProduct, since you made changes to its category list.




