package zoo;

import java.sql.Date;

public class Tutor extends Person{
    private int office_no;
	public Tutor(String tutorname, int tutordob, int tutoroffice) {
		super(tutorname, tutordob);
		office_no = tutoroffice;
	}
    public int getint() {return office_no;}
    
    @Override
    public String toString() {
//    	return "This tutor is called "+ name + ", was born on " + date_of_birth
//    			+ " and is in the office " + office_no;
    	return super.toString() + " and is in the office " + office_no;
    }
}
