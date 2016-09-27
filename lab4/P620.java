/**
*File: P68
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 4
*due days: September 28, 2016
*version: "1.8.0_101"

*This program counts the length of a string using methods
*/
import java.util.*;

public class P620 {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
	String B = input.nextString();
	System.out.println(countletters(B));
  }
  public static int countLetters(String B) {
    return String.length(String B);
  }
}