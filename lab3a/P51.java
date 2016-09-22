/**
*File: P51.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 22, 2016
*version: "1.8.0_101"

*This program calculates average and sum of user imputs
*/
import java.util.Scanner;

public class P51{
  public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	
	int positive = 0;
	int negative = 0;
	int sum = 0;
	int data;
	double average;
	
    do {
      
	  System.out.println("Enter an integer and the list ends when you imput zero:");
      data = input.nextInt(); 	
		
      if (data < 0){
        negative++;
	  }
      else if (data > 0){
        positive++;
	  }
      sum += data;
    } while (data != 0);
	 
	
    average = sum / ((double)(positive + negative));
    System.out.println("The amount of positive numbers is: " + positive);
    System.out.println("The amount of negative numbers is: " + negative);
    System.out.println("The sum of your numbers is: " + sum);
    System.out.println("The avereage of your numbers is: " + average);
 }
}