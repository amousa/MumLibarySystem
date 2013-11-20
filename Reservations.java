package MumLibarySystem;

class Reservation 
{
	private Resource resource;
	private Member member;
	public Reservation(Resource resource, Member member)
	{
		this.resource = resource;
		this.member = member;
	}
	public Resource getResource()
	{
		return this.resource;
	}
	public Member getMember()
	{
		return this.member;
	}
	public void addResource(Resource resource)
	{
		this.resource = resource;
	}
	public void addMember(Member member)
	{
		this.member = member;
	}
}
