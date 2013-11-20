package MumLibarySystem; 

import java.util.*;

class Main 
{
    public static void main(String[] args) 
    {
	    List<Resource> resources ;
	    Member member = new Member("ali", "Amman Jordan", "+962777443333");
	    Member member2 = new Member("jozef", "Amman Jordan", "+962777443333");
	    LibrarySystem libarysystem = new LibrarySystem() ; 
	    libarysystem.addMember(member);
	    libarysystem.addBook(".Net", 30, 2233333, "Antone");
	    libarysystem.addBook("PHP", 30, 2233333, "Antone");
	    Resource res = libarysystem.search(".Net");
	    if(res != null)
	    {
		System.out.println("Member 1 trying to burrow .Net book");
	    	if(member.borrow(res))
		{
			System.out.println("Books has been burrowed");
		}

		System.out.println("Member 2 trying to burrow the same book");
	    	if(member2.borrow(res))
		{
			System.out.println("Books has been burrowed any more");
		}
		else
		{
			System.out.println("Book is not avaliable");
		}

	    }
	    resources = libarysystem.getResources();
	    for(Resource item : resources)
	    {
		    System.out.printf("Title of the resource %s, ", item.getTitle());
		    Loan loan = item.getLoan();
		    Member mem;
		    if(loan != null)
		    {
			    System.out.printf("check out Date : %s\n", loan.getCheckOutDate().getMonth());
			    mem = loan.getMember();
			    System.out.printf("get Member  name : %s\n", mem.getString());
		    }
		    else
		    {
			    System.out.printf("Book not burrowed YET\n");
		    }
	    }
    }
}
