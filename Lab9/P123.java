import java.util.*;
/**
*File: P123.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 9
*due days: Thursday, November 10, 2016
*version: "1.8.0_101"

*This program makes an array with 100 numbers and the user can ask for ]
a specific nuber by index and that number is shown
*/

public class P123{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int[] mynums = new int[100];
    
    for (int i = 0; i < 100; i++) {
      mynums[i] = (int) (Math.random() * 100);
    }
    System.out.println("Enter an index number: ");
    
    try {
        int innum = input.nextInt();
        System.out.println("The index number " + innum + "'s value is " + mynums[innum]);
    }  catch (ArrayIndexOutOfBoundsException ex) {
         System.out.println("The index number " + ex.getLocalizedMessage() +
        "is out of bounds");
    }  catch (Exception ex) {
         System.out.println("Seriously dude?");
    }
  }
}