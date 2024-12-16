
package com.edubridge.lms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edubridge.lms.entity.Book;
import com.edubridge.lms.service.BookCategoryService;
import com.edubridge.lms.service.BookService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class BooksContoller {

	@Autowired
	private BookCategoryService bookCategoryService;
 
	@PostMapping("/book/{categoryId}/categories")
	public ResponseEntity<Book> addBookToCategory(@PathVariable Long categoryId, @RequestBody Book book) {

		bookCategoryService.addBookToCategory(categoryId, book);

		return new ResponseEntity<>(HttpStatus.OK);
	}
}

