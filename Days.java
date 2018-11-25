package zoo;

public class Days extends Time {
	private int days;
	public Days(int d) {
		days = d;
	}
	@Override
	public int getMinutes() {
		return days * 24 * 60;
	}
	
	public String toString() {
		return days + " days " + " = " + getSeconds() + " seconds ";
	}

}
