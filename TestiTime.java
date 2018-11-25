package zoo;

public class TestiTime {
	public static void main(String[] args) {
		iTime[] teiTimes = {
				new iDays(50),
				new iDays(14),
				new iHoursMinutes(14, 25),
				new iHoursMinutes(4, 13),
				new iDays(5),
				new iHoursMinutes(20, 49)
		};
		for(iTime i:teiTimes) {
			System.out.println(i.toString());
		}
	}

}
