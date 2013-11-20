package MumLibarySystem;

import java.util.*;

public class Resource {
	private long copyID;
	private boolean availability;
	private String title;
	private int maxLoanDuration;
	private Reservation reservation;
	private Loan loan;
	
	public Resource(String title, int maxLoanDuration) {
		copyID = Calendar.getInstance().getTimeInMillis();
		availability = true;
		this.title = title;
		this.maxLoanDuration = maxLoanDuration;
	}
	public void addLoan(Loan loan)
	{
		this.loan = loan;
	}
	public void addReservation(Reservation reservation)
	{
		this.reservation = reservation;
	}	
	public Reservation getReservation()
	{
		return this.reservation;
	}
	public int getMaxLoanDuration() {
		return maxLoanDuration;
	}
	
	public String getTitle() {
		return title;
	}
	
	public long getCopyID() {
		return copyID;
	}
	public boolean isAvailable() {
		return availability;
	}
	public void setAvailability (boolean availability) {
		this.availability = availability;
	}
}
