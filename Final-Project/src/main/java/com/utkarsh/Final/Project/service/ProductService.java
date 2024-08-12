package com.utkarsh.Final.Project.service;


import com.utkarsh.Final.Project.dto.ProductRequest;
import com.utkarsh.Final.Project.dto.ProductResponse;
import com.utkarsh.Final.Project.mapper.ProductMapper;
import com.utkarsh.Final.Project.model.Product;
import com.utkarsh.Final.Project.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;
    public void createProduct(ProductRequest productRequest){
        Product product= ProductMapper.productRequestToProduct(new Product(),productRequest);
        productRepository.save(product);
    }
    public List<ProductResponse> getAllProduct(){
        List<Product> products=productRepository.findAll();
        return products.stream().map(product->ProductMapper.productToProductResponse(product,new ProductResponse())).collect(Collectors.toList());
    }

    }

