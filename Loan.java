package MumLibarySystem;

import java.util.Date;

public class Loan{
	private Date checkoutDate;
	private Date returnDate;
	private long borrowerID;
	private long borrowedItemID;
	
	public Loan( Date checkoutDate,
			Date returnDate,
			long borrowerID,
			long borrowedItemID) {
		this.checkoutDate = checkoutDate;
		this.returnDate = returnDate;
		this.borrowerID = borrowerID;
		this.borrowedItemID = borrowedItemID;
	}
	
	public long getBorrowerID() {
		return borrowerID;
	}

	public long getResourceCopyID() {
		return borrowedItemID;
	}
}
