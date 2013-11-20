package MumLibarySystem;

import java.util.ArrayList;
import java.util.List;

public class LoanHistory {
	List<Loan> loans;
	
	public LoanHistory() {
		loans = new ArrayList<Loan>();
	}
	
	public void addLoan (Loan loan) {
		loans.add(loan);
	}
	
	public List<Loan> getLoanHistoryOfAMember (long memberID) {
		
		List<Loan> currentLoans = new ArrayList<Loan> ();
		for(Loan loan : loans){
			if (loan.getBorrowerID() == memberID) {
				currentLoans.add(loan);
			}
		}
		
		return currentLoans;
	}
	
	public List<Loan> getLoanHistoryOfAResource (long resourceCopyID) {
		
		List<Loan> currentLoans = new ArrayList<Loan> ();
		for(Loan loan : loans){
			if (loan.getResourceCopyID() == resourceCopyID) {
				currentLoans.add(loan);
			}
		}
		
		return currentLoans;
	}
}
