package Bank;

import java.util.*;;

public class GenerateWalkingPlan {
	public static void main(String[] args) {
		// ask the user's name and age
		System.out.println("What is your name? ");
		Scanner sc = new Scanner(System.in);
		String uName = sc.next();
		System.out.print("Hello " + uName + "; how old are you? ");
		int uAge = sc.nextInt();
		System.out.print("\n" + uName + "(age = " + uAge + ") - this is your walking plan: ");
	}
}
