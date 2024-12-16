package com.edubridge.lms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edubridge.lms.dao.BookRepository;

@Service
public class BookService {
	@Autowired
	private BookRepository repo;

}