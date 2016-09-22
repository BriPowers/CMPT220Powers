/**
*File: P415.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due days: September 14, 2016
*version: "1.8.0_101"

*This program outputs the number on a phone given a letter
*/


import java.util.*;


public class P415{
  private static final int INVALID_KEY = -1;
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter: ");
      char ch = input.next().charAt(0);
      int num = correspondingNumber(ch);

      if (num != INVALID_KEY) {
        System.out.println("The corresponding number is " + num);
      } 
		else {
        System.out.println(ch + " is an invalid input");
      }

  }

   
  public static int correspondingNumber(char ch) {

    ch = Character.toUpperCase(ch);

      if (ch >= 'A' && ch <= 'O') {
        int number = 2; 
        int n = ch - 'A';
        number += (n / 3);
        return number;
      }

        if (ch >= 'P' && ch <= 'S') return 7;
        if (ch >= 'T' && ch <= 'V') return 8;
        if (ch >= 'W' && ch <= 'Z') return 9;

        return INVALID_KEY;

    }

}