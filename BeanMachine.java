package Bank;

import sheffield.EasyReader;

public class BeanMachine {
	public static void main(String[] args) {
		// tell the rules to users
		// read path, the number of balls and the number of buckets
		// from inputs of the user		
		EasyReader rd = new EasyReader();
		System.out.println("Please enter the number of balls([1,100]): ");
		int ballNum = rd.readInt();
		System.out.println("Please enter the number of buckets([1,20]): ");
		int bucketNum = rd.readInt();
		System.out.println();
		System.out.println("Path taken by each ball(L - left, R - right): " + "\n");
		char[] paths = new char[4 * ballNum];
		boolean rightWhether = false;
		int[] bucketID = new int[bucketNum];
		
		// if the user do not input properly, the system will reprot an error
		if(ballNum <= 0 || ballNum > 100) {
			System.out.println("Please input the correct number of balls.");
		}
		else if(bucketNum <= 0 || bucketNum > 20) {
			System.out.println("Please input the correct number of buckets.");
		}
		
		// put the paths to an array
		for(char a : paths) {
			a = rd.readChar();
			System.out.println(a);
		}
		
		// store the number of buckets into an array
		for(int i = 1; i < bucketID.length + 2; i++) {
			bucketID[i] = i;
			System.out.println(bucketID[i]);
		}
		// according to the question, a ball will move to buckets no.n if 
		// there are n "R"s in its path
		
		
	}
}
