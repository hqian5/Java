package foodstore;

import java.util.*;;

public class TestFoodStore {
     public static void main(String[] args) {
    	 FoodStore newfood = new FoodStore(0);
    	 int num_current = newfood.getAmountStored();
         System.out.print("The number of food in the store is " + newfood.getAmountStored() + 
        		 			" \nInput positive number to deposit food. " + 
        		 			" \nInput negative number to withdrawl food. " +
        		 			" \npress 0 to exit the trransaction. ");
    	 boolean exit = false;
         int num_deposit = 0;
    	 int num_withdrawl = 0;
    	 int num_refused = 0;
         Scanner sc = new Scanner(System.in);
         do {
			int num = sc.nextInt();
			if (num > 0 && ((num + newfood.getAmountStored())>=0)) {
				num_deposit += num;
				newfood.depositFood(num);
				System.out.println("The amount in the store is: " + newfood.getAmountStored());
			}
			else if(num < 0 &&((num + newfood.getAmountStored())>= 0)) {
				num_withdrawl -= num;
				newfood.withdrawFood(-num);
				System.out.println("The amount in the store is: " + newfood.getAmountStored());
			}
			else if (num == 0) {
				exit = true;
				System.out.println("The amount in the store is: " + newfood.getAmountStored());
				System.out.println("The amount of deposits is: " + newfood.getNumdeposits());
				System.out.println("The amount of withdrawls is: " + newfood.getNumwithdrawls());
				System.out.println("You have deposited " + num_deposit + " food. ");
				System.out.println("You have withdrawled " + num_withdrawl + " food. ");
				System.out.println("The number of refuesed transactions are " + num_refused);
			
			}
			else {
				num_refused++;
				System.out.println("Inproper operation. The number in the store can not be less than 0. ");
			}
		} while (!exit);
//         System.out.println( "Please input the number of food you want to deposit: " );
//         int number1 = sc.nextInt();
//         System.out.println( "Please input the number of food you want to withdrow: " );
//         int number2 = sc.nextInt();
         
//         FoodStore nowFoodStore = new FoodStore(0);
//         nowFoodStore.depositFood(number1);
//         	if (nowFoodStore.withdrawFood(number2) == true){
//         		System.out.println( "You have operated properly " );
//         	}
//         	else {
//         		System.out.println( "You have operated incorrectly " );
//         	}
//            
//         	System.out.println("The number of deposits is " + nowFoodStore.getNumdeposits());
//         	System.out.println("The number of withdrawls is " + nowFoodStore.getNumwithdrawls());
//         	System.out.println( "The number of food in the store is " + nowFoodStore.getAmountStored());
        	 
         
	}
}
