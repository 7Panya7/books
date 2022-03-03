package com.store.books.controller;

import com.store.books.model.dto.SalesDTO;
import com.store.books.model.entity.Sales;
import com.store.books.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/sales")
@RequiredArgsConstructor
public class SalesController {

    private final SalesService salesService;

    @GetMapping("/")
    public ResponseEntity<List<SalesDTO>> fundAll() {
        return ResponseEntity.ok(salesService.findAll());
    }

    @PostMapping("/save")
    public ResponseEntity<SalesDTO> save(@RequestBody SalesDTO salesDTO) {
        return ResponseEntity.ok(salesService.saveOrUpdate(salesDTO));
    }

    @PutMapping("/update")
    public ResponseEntity<SalesDTO> update(@RequestBody SalesDTO salesDTO) {
        return ResponseEntity.ok(salesService.saveOrUpdate(salesDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        salesService.deleteById(id);
    }

    @GetMapping("find-all-by-author-and-date")
    public ResponseEntity<List<SalesDTO>> findAllByAuthorAndYearOfPublisher(@RequestParam("name") String name, @DateTimeFormat(pattern = "dd.MM.yyyy")
    @RequestParam("date") LocalDate date) {
        return ResponseEntity.ok(salesService.findAllByAuthorAndYearOfPublisher(name, date));
    }

    @GetMapping("find-all-by-price/{price}")
    public ResponseEntity<List<SalesDTO>> findAllByPriceIsGreaterThan(@PathVariable BigDecimal price) {
        return ResponseEntity.ok(salesService.findAllByPriceIsGreaterThan(price));
    }

    @GetMapping("find-by-author-and-name-book")
    public ResponseEntity<SalesDTO> findByAuthorAndNameBook(@RequestParam("author") String author, @RequestParam("nameBook") String name) {
        return ResponseEntity.ok(salesService.findByAuthorAndNameBook(author, name));
    }
}
