package com.khabalita.springboot.libraryApi.repository;

import com.khabalita.springboot.libraryApi.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {

}
