import java.util.Scanner;
/**
*File: P1110.java
*author: Brian Powers
*course: CMPT 220
*assigbment: Lab 8
*due days: November 3, 2016
*version: "1.8.0_101"

*This program 
*/
public class P1110{
  public static void main(String[] args) {
    MyStack stack = new MyStack();
    Scanner input = new Scanner(System.in);
    System.out.println("Enter 5 Strings");
	
	for (int i = 0; i < 5; i++) {
      stack.push(input.next());      
    }
    System.out.println("Here is your strings in reverse order: ");
    
    while (stack.size() > 0) {
	  System.out.print(stack.pop() + " ");
    }
  }
}