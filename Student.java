package zoo;


public class Student extends Person{
	private String course;
	public Student(String studentname, int studentdob, String studentcourse) {
		super(studentname, studentdob);
		course = studentcourse;
		
	}
	public String getcourse() { return course;}
	
	@Override
	public String toString() { 
//		return "This student is called "+ name + ", was born on " 
//				+ date_of_birth + " and is studying " + course;
		return super.toString() + " and is studying " + course;
		}
	}
	
 
