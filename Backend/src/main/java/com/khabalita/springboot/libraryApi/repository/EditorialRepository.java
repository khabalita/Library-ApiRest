package com.khabalita.springboot.libraryApi.repository;

import com.khabalita.springboot.libraryApi.entities.Editorial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EditorialRepository extends JpaRepository<Editorial, Long> {

}
