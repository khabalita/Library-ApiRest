package com.khabalita.springboot.libraryApi.repository;

import com.khabalita.springboot.libraryApi.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
