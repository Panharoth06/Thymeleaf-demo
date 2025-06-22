package co.istad.testthymeleaf.model.dto.response;

import lombok.Builder;

@Builder
public record ProductResponseDto
        (
                Integer id,
                String name,
                String url,
                String description,
                Double price,
                Boolean status
        ) { }
