package zoo;

public class iDays implements iTime {
	private int days;
	public iDays (int d) {
		days = d;
	}

	public int getMinutes() {
		return days * 24 * 60;
	}
	
	public String toString() {
		return days + " days " + " = " + getMinutes() + " minutes ";
	}
	
}
