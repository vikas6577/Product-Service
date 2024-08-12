package com.utkarsh.Final.Project.mapper;

import com.utkarsh.Final.Project.dto.ProductRequest;
import com.utkarsh.Final.Project.dto.ProductResponse;
import com.utkarsh.Final.Project.model.Product;

public class ProductMapper {
    public static ProductResponse productToProductResponse(Product product, ProductResponse productResponse){
        return ProductResponse.builder().desc(product.getDesc()).price(product.getPrice()).prodName(product.getProdName()).Id(product.getId()).build();

    }
    public static Product productRequestToProduct(Product product, ProductRequest productRequest){
        return Product.builder().desc(productRequest.getDesc()).price(productRequest.getPrice()).prodName(productRequest.getProdName()).build();
    }
}
