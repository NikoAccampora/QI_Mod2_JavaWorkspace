package br.com.nikoaccampora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    @Column(length = 11,nullable=false)
    private String ISBN;
    @Column(length = 50,nullable=false)
    private String title;
    @Column(length = 70,nullable=false)
    private String author;
    @Column(length = 100,nullable=false, name="publishing")
    private String publishingCompany;
	
    
    public Book(int id, String iSBN, String title, String author, String publishingCompany) {
		this.id = id;
		ISBN = iSBN;
		this.title = title;
		this.author = author;
		this.publishingCompany = publishingCompany;
	}


	public Book() {
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getPublishingCompany() {
		return publishingCompany;
	}


	public void setPublishingCompany(String publishingCompany) {
		this.publishingCompany = publishingCompany;
	}
    
    
    
}
