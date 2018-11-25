package zoo;


public class testoverride {
	public static void main(String[] args) {
		Person[] tePersons = {
				 new Person("Tom", 19960302),
				 new Student("Mary", 19950306, "Computer Science"),
				 new Tutor("Linkin", 19801203, 305),
				 new Person("Jerry", 20000101)
		};
		
		String teString = new String();
		for(Person i:tePersons) {
			teString = i.toString();
			System.out.println(teString);
		}
	}
}
