package com.store.books.mapper.impl;

import com.store.books.mapper.Mapper;
import com.store.books.model.dto.SalesDTO;
import com.store.books.model.entity.Genre;
import com.store.books.model.entity.PublishingHouse;
import com.store.books.model.entity.Sales;
import org.springframework.stereotype.Component;

@Component
public class SalesMapper implements Mapper<Sales, SalesDTO> {
    @Override
    public Sales toModel(SalesDTO salesDTO) {
        Sales sales = new Sales();
        Genre genre = new Genre();
        PublishingHouse pb = new PublishingHouse();

        genre.setId(salesDTO.getGenreId());
        pb.setId(salesDTO.getPublishingHouseId());

        sales.setId(salesDTO.getId());
        sales.setAuthor(salesDTO.getAuthor());
        sales.setNameBook(salesDTO.getNameBook());
        sales.setDate(salesDTO.getDate());
        sales.setYearOfPublisher(salesDTO.getYearOfPublisher());
        sales.setPrice(salesDTO.getPrice());
        sales.setGenreId(genre);
        sales.setPublishingHouseId(pb);
        return sales;
    }

    @Override
    public SalesDTO toDTO(Sales sales) {
        SalesDTO salesDTO = new SalesDTO();

        salesDTO.setId(sales.getId());
        salesDTO.setDate(sales.getDate());
        salesDTO.setAuthor(sales.getAuthor());
        salesDTO.setNameBook(sales.getNameBook());
        salesDTO.setYearOfPublisher(sales.getYearOfPublisher());
        salesDTO.setPrice(sales.getPrice());
        salesDTO.setGenreId(sales.getGenreId().getId());
        salesDTO.setPublishingHouseId(sales.getPublishingHouseId().getId());
        return salesDTO;
    }
}
