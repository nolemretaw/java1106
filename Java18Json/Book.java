package com.lanou.practice;

public class Book {
	private String name;
	private String author;
	private String price;
	private String date;
	private String languange;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getLanguange() {
		return languange;
	}
	public void setLanguange(String languange) {
		this.languange = languange;
	}
	public Book() {
		
	}
	
	@Override
	public String toString() {
		return "Book [name=" + name + ", author=" + author + ", price=" + price + ", date=" + date + ", languange="
				+ languange + "]";
	}
	
}
