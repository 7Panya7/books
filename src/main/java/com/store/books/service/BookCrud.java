package com.store.books.service;

import java.util.List;

public interface BookCrud <T,ID>{
    List<T> findAll();
    void deleteById(ID id);
    T saveOrUpdate(T t);
}
