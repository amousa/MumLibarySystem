package MumLibarySystem;

import java.util.*;

public class Loan{
	private Date checkoutDate;
	private Date returnDate;
	private Resource resource;
	private Member member;
	
	public Loan( Date checkoutDate, Date returnDate, Member member, Resource resource) 
	{
		this.checkoutDate = checkoutDate;
		this.returnDate = returnDate;
		this.member 	= member;
		this.resource 	= resource;
	}
	public Member getMember()
	{
		return this.member;
	}
	public Resource getResource()
	{
		return this.resource;
	}
	public Date getCheckOutDate()
	{
		return this.checkoutDate;
	}

}
