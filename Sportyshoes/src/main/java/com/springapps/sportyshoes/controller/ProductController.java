package com.springapps.sportyshoes.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springapps.sportyshoes.entity.Product;
import com.springapps.sportyshoes.entity.Purchase;
import com.springapps.sportyshoes.service.PurchaseService;
import com.springapps.sportyshoes.service.productService;

@Controller
public class ProductController {

	@Autowired
	productService productservice;
	
	@Autowired
	PurchaseService purchaseService;

	@RequestMapping("/addProduct")
	public String adminloggedin(@ModelAttribute("product") Product product, ModelMap model) {
		Product findProduct = productservice.getProduct(product.getProductid());
		System.out.println(findProduct);
		if(findProduct==null) {
			productservice.save(product);
			model.addAttribute("addedproduct", "Product added successfully");
			return "addProductListOne";
		}
		model.addAttribute("failProduct", "Product with this id already exists");
		return "addProductListOne";
	}
	
	@RequestMapping("/productdetails/{productid}")
	public String productdetails(@PathVariable("productid") int productid,ModelMap model) {
		Product product = productservice.getProduct(productid);
		model.addAttribute("product", product);
		return "productdetails";
		
	}
	@RequestMapping("/productdetails/buyProduct")
	public String buyProduct(@ModelAttribute("product") Product product,ModelMap model) {
		Purchase purchase=new Purchase(new SimpleDateFormat("dd/MM/yyyy").format(new Date()), product.getCategoryid(), product);
		purchaseService.save(purchase);
		model.addAttribute("purchaseSuccess", "Purchase Successfull!!...Thank you");
		return "productdetails";
		
	}
	
	@RequestMapping("/PurchaseReport")
	public String PurchaseReport(ModelMap model) {
		List<Purchase> purchaseDetails = purchaseService.getPurchaseDetails();
		System.out.println(purchaseDetails);
		  Set<String> dateSet = new HashSet<String>();
		  HashMap<String, Integer>  categoryMap= new HashMap<>();
		  
		  for(Purchase p:purchaseDetails) {
			  dateSet.add(p.getDate());
			  categoryMap.put(p.getProducts().getCategoryname(), p.getProducts().getCategoryid());
		  }
		  model.addAttribute("datePurchases", dateSet);
		  model.addAttribute("categoryPurchases", categoryMap);
		  
		return "PurchaseReport";
		
	}
	@RequestMapping("/FinalPurchaseReport")
	public String FinalPurchaseReport(@RequestParam("selectedDate") String date, @RequestParam("selectedCategory")  String category,ModelMap model) {
		String s1 = category.substring(category.indexOf("=") + 1);
		int categoryID=Integer.parseInt(s1.trim());
		System.out.println(categoryID);
		List<Purchase> purchaseByDateAndCategory = purchaseService.getPurchaseByDateAndCategory(date, categoryID);
		List<Object[]> summaryReport = purchaseService.getSummaryReport(date, categoryID);
		model.addAttribute("summaryReport", summaryReport);
		List<Purchase> purchaseDetails = purchaseService.getPurchaseDetails();
		System.out.println(purchaseDetails);
		  Set<String> dateSet = new HashSet<String>();
		  HashMap<String, Integer>  categoryMap= new HashMap<>();
		  
		  for(Purchase p:purchaseDetails) {
			  dateSet.add(p.getDate());
			  categoryMap.put(p.getProducts().getCategoryname(), p.getProducts().getCategoryid());
		  }
		  model.addAttribute("datePurchases", dateSet);
		  model.addAttribute("categoryPurchases", categoryMap);
		model.addAttribute("FinalReport", purchaseByDateAndCategory);
		return "PurchaseReport";
		
	}
	
	
}
