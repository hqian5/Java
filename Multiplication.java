
public class Multiplication {
	
	public static void main(String[] args) {
		
		System.out.print("   ");
		for (int j = 1 ; j < 10 ; j++) {
			System.out.format("%2d  ", j);
		}
		System.out.println();

		System.out.print("---");
		for (int j = 1 ; j < 10 ; j++) {
			System.out.print("----");
		}
	
		System.out.println();
		
		for (int i = 1 ; i < 10 ; i++) {
			System.out.format("%1d |", i);
			for (int j = 1 ; j < 10 ; j++) {
				System.out.format("%2d  ", i * j);
			}
			System.out.println();
		}
	}

}
