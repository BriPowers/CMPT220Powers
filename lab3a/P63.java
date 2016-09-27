/**
*File: P63.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 3
*due date: September 22, 2016
*version: "1.8.0_101"

*This program adds a numbers digits together using methods and loops
*/
import java.util.Scanner;


public class P63 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
	System.out.println("Enter a number 1-1000");
	int num = input.nextInt();
	
	if (isPalindrome(num)) 
	  System.out.println(num + "is a palindrome youre awesome");
	else 
	  System.out.println(num + "is not a palindrome, you let me down");
	
  }	
  
  public static int reverse(int num) {
    int reverse = 0;
	int dig;
	while (reverse > 0) {

      dig = num % 10;	
	  num = num / 10;
	  reverse = reverse * 10 + dig;
	}
    
    return reverse;
  
  }
  
  public static boolean isPalindrome(int number) {
    return (number == reverse(number));
  }
  
}