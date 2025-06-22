package co.istad.testthymeleaf.model.service;

import co.istad.testthymeleaf.model.dto.response.ProductResponseDto;

import java.util.List;

public interface ProductService {
    List<ProductResponseDto> getAllProducts();
    ProductResponseDto getProductById(Integer productId);
}
