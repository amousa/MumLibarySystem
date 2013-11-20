package MumLibarySystem;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
	private List<Resource> resources;
	private List<Member> members;
	
	public LibrarySystem() {
		members = new ArrayList<Member>();
		resources = new ArrayList<Resource>();
	}
	
	public Resource search(String title)
	{
		for(Resource res : resources)
		{
			if(res.getTitle().equals(title))
			{
				return res;
			}
		}
		return null;
	}
	public void addBook(String title,
			int maxLoanDuration, 
			int ISBN, 
			String author) {
		Book book = new Book(title, maxLoanDuration, ISBN, author);
		resources.add(book);
	}
	
	public void addMember(Member member)
	{
		members.add(member);
	}
	
	public void borrowResource(long memberID, long copyID) {
		
	}
	
}
