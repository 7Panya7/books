//package com.store.books.service.impl;
//
//import com.store.books.model.entity.Genre;
//import com.store.books.repository.GenreRepository;
//import com.store.books.service.GenreService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class GenreServiceImpl implements GenreService {
//
//    private final GenreRepository genreRepository;
//    @Transactional(readOnly = true)
//    @Override
//    public List<Genre> findAll() {
//        return genreRepository.findAll();
//    }
//    @Transactional
//    @Override
//    public void deleteById(Long aLong) {
//        genreRepository.deleteById(aLong);
//    }
//    @Transactional
//    @Override
//    public <S extends Genre> S saveOrUpdate(S entity) {
//        return genreRepository.save(entity);
//    }
//
//}
