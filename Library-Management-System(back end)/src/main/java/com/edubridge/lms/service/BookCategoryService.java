package com.edubridge.lms.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.lms.dao.BookCategoryRepository;
import com.edubridge.lms.dao.BookRepository;
import com.edubridge.lms.entity.Book;
import com.edubridge.lms.entity.BookCategory;
@Service
public class BookCategoryService {
	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Autowired
	private BookRepository bookRepository;

	public Book addBookToCategory(Long categoryId, Book book) {

		Optional<BookCategory> optional = bookCategoryRepository.findById(categoryId);

		if (optional.isPresent()) {
			BookCategory category = optional.get();
			book.setBookCategory(category);
			return bookRepository.save(book);
		} else {
			throw new RuntimeException("Category not found");
		}
	}

}