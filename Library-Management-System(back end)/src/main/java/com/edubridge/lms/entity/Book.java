package com.edubridge.lms.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name="Books")
public class Book {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long bookId;
	private Integer bookPrice;
	private String bookTitle;
	private String bookAuthor; 
	  
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private BookCategory bookCategory;    
    
   
    
    
}