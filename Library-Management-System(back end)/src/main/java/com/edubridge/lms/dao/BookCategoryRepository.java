package com.edubridge.lms.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edubridge.lms.entity.BookCategory;


@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
