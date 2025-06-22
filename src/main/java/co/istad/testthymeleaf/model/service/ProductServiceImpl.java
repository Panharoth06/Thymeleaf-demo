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
                        .name(p.getName())
                        .description(p.getDescription())
                        .price(p.getPrice())
                        .status(p.getStatus())
                        .url(p.getUrl())
                        .build()
                )
                .toList());
    }
}
