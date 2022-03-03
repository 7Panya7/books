package com.store.books;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.store.books.model.entity")
@EnableJpaRepositories("com.store.books.repository")
public class BooksApplication{
    public static void main(String[] args) {
        SpringApplication.run(BooksApplication.class, args);
    }
}
