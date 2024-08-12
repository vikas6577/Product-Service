package com.utkarsh.Final.Project.controller;


import com.utkarsh.Final.Project.dto.ProductRequest;
import com.utkarsh.Final.Project.dto.ProductResponse;
import com.utkarsh.Final.Project.model.Product;
import com.utkarsh.Final.Project.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/product")
@RestController
public class ProductController {

    @Autowired
    public ProductService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createProduct(@RequestBody ProductRequest productRequest){
        service.createProduct(productRequest);
    }
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponse> getAllProduct(){
        return service.getAllProduct();
    }

}
