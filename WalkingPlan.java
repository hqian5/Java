package AessedLab;

import java.util.Random;

public class WalkingPlan {
	
	// constructor 
	public WalkingPlan(int p) {
		period = p;
	}
	
	// methods
	// generate walking length every day
	public void dayLength() {
		Random rand = new Random();
		int randLength = 0;
		for(int i = 0; i < dayLengths.length; i++) {
			randLength = rand.nextInt(25) + 1;
			dayLength = randLength * 100;
		}
		// make hard days
				for(int j = 0; j < dayLengths.length; j++) {
					if (dayLengths[j] > 1500) {
						dayLengths[j+1] = 1000;
					}
				// calculate total and average length	
				totLength += dayLengths[j];
				meanLength = (int) Math.round((double) totLength /(double) dayLengths.length);
				System.out.println(dayLengths[j]);
				}
				System.out.println();
				System.out.println("Total number of meters walked = " + totLength);
				System.out.println("Average number of meters walked = " + meanLength);
			
		
		}
		
	
	
	// toString() method to print out the plan
	
	
	// instance fields: length of days, number of meters each day, number of total meters 
	// and number of average meters in 14 days
	private int period;
	private int dayLength;
	private int[] dayLengths = new int[period];
	private int totLength;
	private int meanLength;
	
}
