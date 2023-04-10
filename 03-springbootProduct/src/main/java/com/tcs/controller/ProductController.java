package com.tcs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.tcs.entity.ProductEntity;
import com.tcs.repo.ProductRepositary;

@Controller
public class ProductController {
@Autowired
private ProductRepositary repo;


	@GetMapping("/products")
	//toretrive all records from database to send to UI
	public String loadProducts(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
	}
	@GetMapping("/")
	//to load empty form
	public String loadForm(Model model) {
	model.addAttribute("p", new ProductEntity());
		return "index";
	}
	@PostMapping("/product")
	//@ModelAttribute used whatever date comes from form binding it send to UI
	public String handleSave(@ModelAttribute("p") ProductEntity p,Model model) {
		p=repo.save(p);
		if(p.getPid()!=null) {
			model.addAttribute("msg", "product is saved");
		}
		return "index";
	}

}//http://localhost:9098/h2-console=H@database url
//server url=http://localhost:9098
