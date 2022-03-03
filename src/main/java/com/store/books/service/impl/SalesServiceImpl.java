package com.store.books.service.impl;

import com.store.books.exception.SalesNotFoundException;
import com.store.books.mapper.Mapper;
import com.store.books.model.dto.SalesDTO;
import com.store.books.model.entity.Sales;
import com.store.books.repository.SalesRepository;
import com.store.books.service.SalesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SalesServiceImpl implements SalesService {

    private final SalesRepository salesRepository;
    private final Mapper<Sales, SalesDTO> mapper;

    @Transactional(readOnly = true)
    @Override
    public List<SalesDTO> findAll() {
        return salesRepository.findAll().stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public void deleteById(Long aLong) {
        salesRepository.deleteById(aLong);
    }

    @Transactional
    @Override
    public SalesDTO saveOrUpdate(SalesDTO entity) {
        var sales = mapper.toModel(entity);
        var newSales = salesRepository.save(sales);
        return mapper.toDTO(newSales);
    }

    @Transactional
    @Override
    public List<SalesDTO> findAllByAuthorAndYearOfPublisher(String name, LocalDate date) {
        return salesRepository.findAllByAuthorAndYearOfPublisher(name, date).stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional
    @Override
    public List<SalesDTO> findAllByPriceIsGreaterThan(BigDecimal price) {
        return salesRepository.findAllByPriceIsGreaterThan(price).stream()
                .map(mapper::toDTO)
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    @Override
    public SalesDTO findByAuthorAndNameBook(String author, String name) {
        var salesOptional = salesRepository.findByAuthorAndNameBook(author, name);
        if (salesOptional.isPresent()) {
            var sales = salesOptional.get();
            var salesDTO = mapper.toDTO(sales);
            return salesDTO;
        } else {
            throw new SalesNotFoundException();
        }
    }
}
