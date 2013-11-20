package MumLibarySystem;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Member {
	private int ID;
	private String name;
	private String address;
	private String phoneNumber;
	private LibrarySystem librarySystemHandler;
	private List<Reservation> reservation;
	private List<Loan> loans;
	
	public Member (String name, String address, String phoneNumber) {
		this.ID = (int) Calendar.getInstance().getTimeInMillis();
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.librarySystemHandler = librarySystemHandler;
		this.loans 	= new ArrayList<Loan>(); 
		this.reservation = new ArrayList<Reservation>();
	}
	
	public boolean reserve(Resource resource)
	{
		if(resource.isAvailable())
		{
			Reservation itemToReservation = new Reservation(resource, this);
			this.reservation.add(itemToReservation);
			resource.addReservation(itemToReservation);
			resource.setAvailability(false);
			return true;
		}
		return false;
	}	
	public boolean borrow (Resource resource) {
		Reservation reservation = resource.getReservation();
		boolean isAvailable = false;
		if(reservation != null)
		{
			if(reservation.getMember().getID() == this.ID)
			{
				isAvailable = true;
			}	
		}
		isAvailable |= resource.isAvailable();
		if (isAvailable) 
		{
			Calendar returnDate = Calendar.getInstance();
		        returnDate.add(Calendar.DATE, resource.getMaxLoanDuration()); //minus number would decrement the days
	        	Loan currentLoan = new Loan(Calendar.getInstance().getTime(),
		        		returnDate.getTime(), 
					this,
					resource);
			this.loans.add(currentLoan);
			resource.addLoan(currentLoan);
			resource.setAvailability(false);
			return true;
		}
		return false;
	}
	public int getID()
	{
		return this.ID;
	}
}
