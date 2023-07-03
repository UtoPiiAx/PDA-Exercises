
public class Book {
	//Attribute
	private int pages = 0;
	private String title = "";
	private String author = "";
	private String isbn = "";
	private String publisher = "";
	private double price = 0.0;
	
	//Getter-Methoden
	public int getPages () {
		return pages;
	}
	public String getTitle () {
		return title;
	}
	public String getAuthor () {
		return author;
	}
	public String getIsbn () {
		return isbn;
	}
	public String getPublisher () {
		return publisher;
	}
	public double getPrice () {
		return price;
	}
	
	//Setter-Methoden
	public void setPages (int pages2) {
		pages = pages2;
	}
	public void setTitle (String title2) {
		title = title2;
	}
	public void setAuthor (String author2) {
		author = author2;
	}
	public void setIsbn (String isbn2) {
		isbn = isbn2;
	}
	public void setPublisher (String publisher2) {
		publisher = publisher2;
	}
	public void setPrice (double price2) {
		price = price2;
	}
	
}
