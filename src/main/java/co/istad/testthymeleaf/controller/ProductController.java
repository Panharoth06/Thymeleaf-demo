package co.istad.testthymeleaf.controller;

import co.istad.testthymeleaf.model.dto.response.ProductResponseDto;
import co.istad.testthymeleaf.model.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequiredArgsConstructor
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public String product(Model model) {
        model.addAttribute("products", productService.getAllProducts());
        return  "product";
    }

}
