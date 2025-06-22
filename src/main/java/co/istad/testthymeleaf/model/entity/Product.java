package co.istad.testthymeleaf.model.entity;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private Integer id;
    private String name;
    private String url;
    private String description;
    private Double price;
    private Boolean status;
}
