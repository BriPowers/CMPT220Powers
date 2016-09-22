/**
*File: P426.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due days: September 14, 2016
*version: "1.8.0_101"

*This program accuretly tells you how much of each type of currency you have
*/
import java.util.*;

public class P426 {
  public static void main(String[] args) { 
    Scanner input = new Scanner(System.in);
    
	System.out.print("Enter an amount as double, for example 11.56: ");
    String amounts = input.nextLine();
    int amount;
    int nums = amounts.indexOf('.');

	if (nums == -1) {
      amount = Integer.parseInt(amounts);
    } 
      else {
      String dollars = amounts.substring(0, nums);
      String cents = amounts.substring(nums + 1);
      System.out.println(dollars);
      System.out.println(cents);
      switch (cents.length()) {
      case 1: cents += "0"; break;
      case 2: cents = cents.substring(0,2); break;
      default:  cents += "00";
    }   
      amount = Integer.parseInt(dollars +cents);
      System.out.println(Integer.parseInt(dollars + cents));
    }
      
	  int remainingAmount = amount;   
        int singles = remainingAmount / 100;
        remainingAmount = remainingAmount % 100;       
        int quarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;        
        int dimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int nickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;
        int pennies = remainingAmount;

        System.out.println("Your amount " + amount + " consists of");
          System.out.println("    " + singles + " dollars");
          System.out.println("    " + quarters + " quarters ");
          System.out.println("    " + dimes + " dimes");
          System.out.println("    " + nickels + " nickels");
          System.out.println("    " + pennies + " pennies");
    }
}