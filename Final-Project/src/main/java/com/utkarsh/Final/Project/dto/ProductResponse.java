package com.utkarsh.Final.Project.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductResponse {
    public String Id;
    public String desc;
    public String prodName;
    public BigDecimal price;
}
