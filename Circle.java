package Bank;

/*
 * Circle.java
 *
 * Copyright (c) University of Sheffield 2014
 */


public class Circle {

    // constructor
    public Circle( double r ) {
	radius = r;
    }

    // class method
    public static double radToDeg( double angleRad ) {	
	return angleRad * 180.0 / PI;
    }
    
    public String toString() {
    	return ("The area of the circle is " + area());
    }
    
    public boolean equals(Object object) {
    	if (object instanceof Circle) {
    		if(this.toString() == object.toString()){
    			return true;
    		}
		}
				return false;   	
    }


    // instance methods
    public double area() {
	// returns area of the circle
	return PI * radius * radius;
    }


    public double circumference() {
	// returns circumference of the circle
	return 2.0 * PI * radius;
    }
		
    // class field
    public static final double PI = 3.1415927;
		
    // instance field
    private double radius;
    
    

}
