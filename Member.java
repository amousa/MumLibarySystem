package MumLibarySystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Member {
	private long ID;
	private String name;
	private String address;
	private String phoneNumber;
	private LibrarySystem librarySystemHandler;
	private List<Loan> loansMade;
	
	public Member (String name,
			String address,
			String phoneNumber,
			LibrarySystem librarySystemHandler) {
		this.ID = Calendar.getInstance().getTimeInMillis();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.librarySystemHandler = librarySystemHandler;
		loansMade = new ArrayList<Loan>();
	}
	
	
	public boolean borrow (List<Resource> resourcesToBorrow) {
		// PRECONDITION 1: All the selected resources should be available
		for (Resource resource : resourcesToBorrow) {
			if (resource.isAvailable() == false) {
				System.out.print("Resource \"" + resource.getTitle() + "\" is not available.");
				return false;
			}
		}
		
		// PROCESS 1: Make the resource unavailable
		for (Resource resource : resourcesToBorrow) {
			resource.setAvailability(false);
		}
		
		// PROCESS 2: Create a record of the loan made
		for (Resource resource : resourcesToBorrow) {
	        Calendar returnDate = Calendar.getInstance();
	        returnDate.add(Calendar.DATE, resource.getMaxLoanDuration()); //minus number would decrement the days
	        
	        Loan currentLoan = new Loan(Calendar.getInstance().getTime(),
	        		returnDate.getTime(), 
	        		this.ID,
	        		resource.getCopyID());
	        
	        librarySystemHandler.addLoan(currentLoan);
	        loansMade.add(currentLoan);
		}
		
		// RETURN SUCCESS
		return true;
	}
}
