package foodstore;

import java.util.*;


public class TestBasket{
     public static void main(String[] args) {
		Item[] shopping = {
				 new Item("chicken", 5.0),
				 new Item("fish", 6.6),
				 new Item("beef", 4.5),
				 new Item("prawn", 8.3)
		};
		String str1 = new String();
		double price = 0;
		for(Item i:shopping) {
			str1 = i.getName();
			price = i.getPrice();
			System.out.println(str1 + " is " + price + " pounds");		
			}
		System.out.println(" Please select: ");
		Scanner scanner = new Scanner(System.in);
		String str2 = new String();
		str2 = scanner.nextLine();
		String str3 = new String();
		String str4 = new String();
		for(Item i:shopping) {
			str3 = i.getName();
			if (str2.equals(str3)) {
			   str4 = "You have selected " + str2 + ", the price is " + i.getPrice() + " pounds ";
			   break;
			   
			}
			else {
				str4 = "You operated incorrectly";
			}  
		}
		System.out.println(str4);
		Basket myBasket = new Basket(shopping);
		double total_money = myBasket.total();
		System.out.println("The total price is " + total_money + " pounds. ");
		
	}
   }

