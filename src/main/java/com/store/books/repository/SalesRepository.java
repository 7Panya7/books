package com.store.books.repository;

import com.store.books.model.entity.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface SalesRepository extends JpaRepository<Sales,Long> {
    List<Sales> findAllByAuthorAndYearOfPublisher(String name, LocalDate date);
    List<Sales> findAllByPriceIsGreaterThan(BigDecimal price);
    @Query(nativeQuery = true,value = "select * from sales where author=:author and name=:name")
    Optional<Sales> findByAuthorAndNameBook(@Param("author") String author, @Param("name") String name);
}
