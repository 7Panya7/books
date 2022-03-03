package com.store.books.model.dto;

import com.store.books.model.entity.Sales;

import java.util.Set;

public class GenreDTO {
    private Long id;
    private String genreName;
    private Set<Sales> salesSet;
}
