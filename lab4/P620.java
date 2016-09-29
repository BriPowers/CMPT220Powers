/**
*File: P620
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 4
*due days: September 29, 2016
*version: "1.8.0_101"

*This program counts the length of a string using methods
*/
import java.util.*;

public class P620 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
	System.out.println("Enter a string:");
	String B = input.nextLine();
	System.out.println(CountLetters(B));
  }
  public static int CountLetters(String B) {
    return B.length();
  }
}