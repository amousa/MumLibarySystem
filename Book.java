package MumLibarySystem;

public class Book extends Resource {
	private int ISBN;
	private String author;
	
	public Book (String title, int maxLoanDuration, int ISBN, String author) {
		super (title, maxLoanDuration);
		
		this.ISBN = ISBN;
		this.author = author;
	}
	
	public int getISBN() {
		return ISBN;
	}
	
	public String getAuthor() {
		return author;
	}
}
