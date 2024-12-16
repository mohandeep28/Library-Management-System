package com.edubridge.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.lms.entity.Book;


@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
