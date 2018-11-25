

public class TestCircle {

	public static void main(String[] args) {
		System.out.println(Circle.PI);
		System.out.println(Circle.radToDeg(3.141));
		
		Circle circle0 = new Circle(3);
		Circle circle1 = new Circle(3.5);
		Circle circle2 = new Circle(3.5);
		
		System.out.println(circle0);
		System.out.println(circle1);
		System.out.println(circle2);

		System.out.println("circle2 == circle1 " + (circle2 == circle1));
		System.out.println("circle2 equals circle1 " + circle2.equals(circle1));
		
		
	}
	
}
