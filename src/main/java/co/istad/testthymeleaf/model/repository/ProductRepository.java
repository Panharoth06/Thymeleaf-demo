package co.istad.testthymeleaf.model.repository;

import co.istad.testthymeleaf.inMemoryDatabase.ProductDatabase;
import co.istad.testthymeleaf.model.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductRepository {
    private final ProductDatabase productDatabase;

    public List<Product> getAllProducts() {
        return productDatabase.getAllProducts();
    }

    public Product getProductById(Integer productId) {
        return productDatabase.getAllProducts()
                .stream()
                .filter(product -> product.getId().equals(productId)).findFirst().orElse(null);
    }
}
