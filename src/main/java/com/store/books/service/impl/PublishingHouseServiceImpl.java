//package com.store.books.service.impl;
//
//import com.store.books.model.entity.PublishingHouse;
//import com.store.books.repository.PublishingHouseRepository;
//import com.store.books.service.PublishingHouseService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@RequiredArgsConstructor
//public class PublishingHouseServiceImpl implements PublishingHouseService {
//
//    private final PublishingHouseRepository publishingHouseRepository;
//
//    @Transactional(readOnly = true)
//    @Override
//    public List<PublishingHouse> findAll() {
//        return publishingHouseRepository.findAll();
//    }
//    @Transactional
//    @Override
//    public void deleteById(Long aLong) {
//        publishingHouseRepository.deleteById(aLong);
//    }
//    @Transactional
//    @Override
//    public <S extends PublishingHouse> S saveOrUpdate(S entity) {
//        return publishingHouseRepository.save(entity);
//    }
//}
