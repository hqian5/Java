package zoo;


public class Person {
	
	protected String name; // instance variable which refers to a person's name
	protected int date_of_birth; // instance variable which refers to a person's date of birth 
	
	public Person(String personname, int persondob) {
		name = personname; 
		date_of_birth = persondob;
	}
	// constructor Person which sets two instance fields: personname and persondob.
	
	public String getname() {return name;} // accessor method which return the value of personname
	public int getdob() {return date_of_birth;} // accessor method which return the value of persondob
	public String toString() {
		return "This person is called "+ name +", was born on "+ date_of_birth;
	}
	
}
