package com.store.books.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SalesDTO {
    private Long id;
    private LocalDate date;
    private String nameBook;
    private String author;
    private LocalDate yearOfPublisher;
    private BigDecimal price;
    private Long genreId;
    private Long publishingHouseId;
}