package MumLibarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
	private LoanHistory loanTracker;
	private List<Resource> resources;
	private List<Member> members;
	
	public LibrarySystem() {
		loanTracker = new LoanHistory();
		members = new ArrayList<Member>();
		resources = new ArrayList<Resource>();
	}
	
	public void addBook(String title,
			int maxLoanDuration, 
			int ISBN, 
			String author) {
		Book book = new Book(title, maxLoanDuration, ISBN, author);
		resources.add(book);
	}
	
	public void addMember(String name,
			String address,
			String phoneNumber) {
		Member member = new Member(name, address, phoneNumber, this);
		members.add(member);
	}
	
	public void borrowResource(long memberID, long copyID) {
		
	}
	
	public void addLoan(Loan loan){
		loanTracker.addLoan(loan);
	}
}
