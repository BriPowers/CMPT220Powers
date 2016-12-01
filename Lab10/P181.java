/**
*File: P181.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 10
*due date: November 17, 2016
*version: "1.8.0_101"

*this program uses reecursion to find a big numbers factorial
*/
import java.util.Scanner;
import java.math.BigInteger;

public class P181 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a number:");
    int b = input.nextInt();
    BigInteger big = new BigInteger(b+"");
    
    System.out.println("Your number's factorial is: " + factorial(big));
  }
  public static BigInteger factorial(BigInteger b) {
    if (b.compareTo(BigInteger.ONE) == 0)
      return BigInteger.ONE;
    else
      return b.multiply(factorial(b.subtract(BigInteger.ONE)));
  }
}