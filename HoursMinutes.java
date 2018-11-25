package zoo;

public class HoursMinutes extends Time {
	private int hours;
	private int minutes;
	public HoursMinutes(int h, int m) {
		hours = h;
		minutes = m;
	}
	
	@Override
	public int getMinutes() {
		return hours * 60 + minutes;
	}
	
	public String toString() {
		return hours + " hours " + " and " + minutes + " minutes " + " = " + getSeconds()
		+ " seconds ";
	}

}
