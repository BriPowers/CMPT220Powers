import java.util.*;
/*
*File: Rolls.java
*author: Brian Powers
*course: CMPT 220
*assignment: DM Kit
*version: "1.8.0_101"
*/

public class Rolls{
  public static void main(String[] args) {
		
    Scanner input = new Scanner(System.in);
    Random die = new Random();
    System.out.println("What do you want to roll:");
    int nod = input.nextInt();
    String d = input.next();
    int tod = input.nextInt();
    System.out.println("+ anything:");
    int plus = input.nextInt();
    System.out.println("------------------------------");
    
    int sum = 0;
    int result = 0;
    
    for (int i=0; i < nod; i++) {		
      result = die.nextInt(tod) +1;
      System.out.println(result);
      sum += result;
    }
    sum += plus;
    System.out.println("The sum is: " + sum);
  }	
}