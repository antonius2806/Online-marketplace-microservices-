package com.marketplace.product.controller;

import com.marketplace.product.entity.Product;
import com.marketplace.product.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/products")
@RefreshScope
public class ProductController {
    @Autowired
    private ProductService productService;

    @Value("${product.message}")
    String message;

    @PostMapping("/addProducts")
    public List<Product> addProducts(@RequestBody List<Product> productList){
        return productService.addProducts(productList);
    }

    @GetMapping("/getProducts")
    public List<Product> getProducts(){
        System.out.println("Message from repo -> "+message);
        return productService.getProducts();
    }

    @GetMapping("/getProducts/{productIdsList}")
    public List<Product> getProductsByIds(@PathVariable List<Long> productIdsList){
        return productService.getProductsByIds(productIdsList);
    }
}
