package MumLibarySystem;

import java.util.Calendar;

public class Resource {
	private long copyID;
	private boolean availability;
	private String title;
	private int maxLoanDuration;
	
	public Resource(String title, int maxLoanDuration) {
		copyID = Calendar.getInstance().getTimeInMillis();
		availability = true;
		this.title = title;
		this.maxLoanDuration = maxLoanDuration;
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