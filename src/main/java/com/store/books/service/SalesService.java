package com.store.books.service;

import com.store.books.model.dto.SalesDTO;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface SalesService extends BookCrud<SalesDTO,Long>{
    List<SalesDTO> findAllByAuthorAndYearOfPublisher(String name, LocalDate date);
    List<SalesDTO> findAllByPriceIsGreaterThan(BigDecimal price);
    SalesDTO findByAuthorAndNameBook(String author,String name);
}
