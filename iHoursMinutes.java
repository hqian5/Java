package zoo;

public class iHoursMinutes implements iTime{
	private int hours;
	private int minutes;
	public iHoursMinutes(int h,int m) {
		hours = h;
		minutes = m;
	}
	public int getMinutes() {
		return hours * 60 + minutes;
	}
	
	public String toString() {
		return hours + " hours " + " and " + minutes +" minutes " + " = " + getMinutes() + " minutes ";
	}
}
