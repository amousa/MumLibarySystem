package MumLibarySystem; 

class Main 
{
    public static void main(String[] args) 
    {
	    Member member = new Member("ali", "Amman Jordan", "+962777443333");
	    Member member2 = new Member("jozef", "Amman Jordan", "+962777443333");
	    LibrarySystem libarysystem = new LibrarySystem() ; 
	    libarysystem.addMember(member);
	    libarysystem.addBook(".Net", 30, 2233333, "Ali");
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
    }
}
