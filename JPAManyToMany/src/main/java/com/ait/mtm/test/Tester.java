package com.ait.mtm.test;

import java.util.Arrays;
import java.util.List;

import com.ait.mtm.dao.BookDAO;
import com.ait.mtm.dao.impl.BookDAOImpl;
import com.ait.mtm.entities.Author;
import com.ait.mtm.entities.Book;

public class Tester 
{
	public static void main(String[] args) 
	{
		BookDAO dao = new BookDAOImpl();
		/*
		//Book instances
		Book book1 = new Book();
		book1.setBookId(10101);
		book1.setBookName("Learn Java");
		
		Book book2 = new Book();
		book2.setBookId(10102);
		book2.setBookName("Boot essentials");
		
		//Author instances 
		Author a1 = new Author();
		a1.setAuthorId(90101);
		a1.setAuthorName("Garden");
		
		Author a2 = new Author();
		a2.setAuthorId(90102);
		a2.setAuthorName("Blake");
		
		Author a3 = new Author();
		a3.setAuthorId(90103);
		a3.setAuthorName("John");
		
		List<Author> lst_of_authors_of_book1 = Arrays.asList(a1, a3);
		book1.setAuthors(lst_of_authors_of_book1);
		
		List<Author> lst_of_authors_of_book2 = Arrays.asList(a1, a2, a3);
		book2.setAuthors(lst_of_authors_of_book2);
		
		dao.saveBook(book1);
		dao.saveBook(book2);		
		*/
		
	/*	//findBook()
		Book book_frm_db = dao.findBook(10101);
		System.out.println(book_frm_db.getBookId());
		System.out.println(book_frm_db.getBookName());
		
		List<Author> authors = book_frm_db.getAuthors();
		authors.forEach(System.out::println);
		*/
		
//		call removeBook()
		dao.removeBook(10101);
		
		
	}
}
