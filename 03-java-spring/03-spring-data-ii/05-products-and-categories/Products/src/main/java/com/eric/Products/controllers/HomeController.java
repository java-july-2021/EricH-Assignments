package com.eric.Products.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.eric.Products.models.Category;
import com.eric.Products.models.Product;
import com.eric.Products.services.ProductService;

@Controller
public class HomeController {
private final ProductService pService;

	public HomeController(ProductService pService) {
		this.pService = pService;	
	}
	
	@GetMapping("/product/new")
	public String newProduct(@ModelAttribute("product") Product product, Model model) {
		model.addAttribute("allProducts", this.pService.allProducts());
		return "products/newproduct.jsp";
	}
	@GetMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category, Model model) {
		model.addAttribute("allCategories", this.pService.allCategories());
		return "category/newcategory.jsp";
	}
	
	
	@GetMapping("/product/{id}")
	public String findProduct(@PathVariable("id") Long id, Model model) {
		Product productToShow = this.pService.getProduct(id);
		model.addAttribute("notProducts", this.pService.productNotIn(productToShow));
		model.addAttribute("product", productToShow);
		return "products/showproduct.jsp";
	}
	@GetMapping("/category/{id}")
	public String findCategory(@PathVariable("id") Long id, Model model) {
		Category categoryToShow = this.pService.getCategory(id);
		model.addAttribute("notCategories", this.pService.categoryNotIn(categoryToShow));
		model.addAttribute("category", categoryToShow);
		return "category/showcategory.jsp";
	}
	
	
	@PostMapping("/product/new")
	public String newProduct(@ModelAttribute("product") Product product, Model model, BindingResult result) {
		this.pService.createProduct(product);
		return "redirect:/product/new";
	}
	@PostMapping("/category/new")
	public String newCategory(@ModelAttribute("category") Category category, Model model, BindingResult result) {
		this.pService.createCategory(category);
		return "redirect:/category/new";
	}
	
	
	@PostMapping("/product/{id}")
	public String addProductToCategory(@PathVariable("id")Long id, @RequestParam("category") Long catId) {
		Product product = this.pService.getProduct(id);
		Category category = this.pService.getCategory(catId);
		this.pService.addProbToCat(product, category);
		return "redirect:/product/{id}";
	}
	@PostMapping("/category/{id}")
	public String addCategoryToProduct(@PathVariable("id")Long id, @RequestParam("product") Long prodId) {
		Product product = this.pService.getProduct(id);
		Category category = this.pService.getCategory(prodId);
		this.pService.addCatToPro(product, category);
		return "redirect:/category/{id}";
	}

}
