package com.edubridge.lms.entity;

import java.util.Set;

import com.edubridge.lms.entity.BookCategory;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Entity
@Table(name="Book_Category")
public class BookCategory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String categoryName;	
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "bookCategory")
	private Set<Book> books;

}