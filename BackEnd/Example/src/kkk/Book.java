package kkk;

public class Book {
	private int bookNo;
	private String title; 
	private String author; 
	private float price ;
	
	public Book() {
	    this.bookNo=0;
	    this.title="learn";
	    this.author="kk";
	    this.price=(float)0.0;
	    
	}
	public Book(int bookNo,String title,String author,float price) {
		
        
		boolean valid=false;
		if(title.length()<4) {
			valid=true;
		}
		if(price<1||price>5000) {
			valid=true;
		}
		if(valid) {
			System.out.println("Invalid Input");
		}
		else {
			return;
		}
		this.bookNo = bookNo;
        this.title = title;
        this.author = author;
        this.price = price;
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
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	public void setBookNo(int bookNo) {
		this.bookNo =bookNo;
	}
	public int getBookNo() {
		return bookNo;
	}
}
