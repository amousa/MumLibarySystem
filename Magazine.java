package MumLibarySystem;


public class Magazine extends Resource 
{
    public int issueNumber;
    public Magazine(String title, int maxLoanDuration, int issueNumber)
    {
	    super(title, maxLoanDuration);
	    this.issueNumber = issueNumber;
    }
}
