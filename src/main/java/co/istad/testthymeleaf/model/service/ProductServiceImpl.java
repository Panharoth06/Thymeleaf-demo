package co.istad.testthymeleaf.model.service;

import co.istad.testthymeleaf.model.dto.response.ProductResponseDto;
import co.istad.testthymeleaf.model.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;
    @Override
    public List<ProductResponseDto>  getAllProducts() {
        return new ArrayList<>(productRepository.getAllProducts().stream()
                .map(p -> ProductResponseDto
                        .builder()
                        .id(p.getId())
                        .name(p.getName())
                        .description(p.getDescription())
                        .price(p.getPrice())
                        .status(p.getStatus())
                        .url(p.getUrl())
                        .build()
                )
                .toList());
    }

    @Override
    public ProductResponseDto getProductById(Integer productId) {
        return ProductResponseDto
                .builder()
                .id(productId)
                .name(productRepository.getProductById(productId).getName())
                .description(productRepository.getProductById(productId).getDescription())
                .price(productRepository.getProductById(productId).getPrice())
                .status(productRepository.getProductById(productId).getStatus())
                .url(productRepository.getProductById(productId).getUrl())
                .build();
    }
}
