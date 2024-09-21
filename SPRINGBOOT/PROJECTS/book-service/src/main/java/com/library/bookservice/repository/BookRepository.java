package com.library.bookservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.bookservice.model.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}

