package zoo;

public class TestTime {
	public static void main(String[] args) {
		Time[] teTimes = {
				new Days(20),
				new Days(14),
				new HoursMinutes(14, 25),
				new HoursMinutes(4, 13),
				new Days(5),
				new HoursMinutes(20, 49)
		};
		for(Time i:teTimes) {
			System.out.println(i.toString());
		}
	}
}
