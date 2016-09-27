/**
*File: P62.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 3
*due date: September 22, 2016
*version: "1.8.0_101"

*This program adds a numbers digits together using methods and loops
*/
import java.util.Scanner;


public class P62 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
	System.out.println("Enter a number 1-1000");
	int num = input.nextInt();
  
    
    System.out.println("The sum of your numbers digits is: " + sumDigits(num));
	
  }	
  
  public static int sumDigits(int num) {
    int sum = 0;
	
	while (num > 0) {
	  sum += num % 10;
	  num /=10;
	}
    
    return sum;
  
  }
  
}