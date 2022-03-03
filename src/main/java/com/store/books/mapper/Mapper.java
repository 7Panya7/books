package com.store.books.mapper;

public interface Mapper<T,DTO> {
    T toModel(DTO dto);
    DTO toDTO(T t);
}
