package solutions;


public class PersonTest {

	public static void main(String[] args) {

		Object[] objects = new Object[4];
		objects[0] = new Person("Alice", "01/01/1970");
		objects[1] = new Tutor("Bob", "02/02/1980", "G28");
		objects[2] = new Student("Charles", "03/03/1990", "COM6516");
		objects[3] = new Object();
		
		for (Object object : objects) {
			// toString is called automatically here
			System.out.println(object);
		}

	}

}
