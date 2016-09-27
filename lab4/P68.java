/**
*File: P68
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 4
*due days: September 28, 2016
*version: "1.8.0_101"

*This program coverts fahrenheit to celsius and vise versa
*/

import java.util.Scanner;


public class P68 {
  public static void main(String[] args) {
  
    Scanner input = new Scanner(System.in);
    
	System.out.println("Enter a 1 if you want to convert Celsius to Fahrenheit");
	System.out.println("Enter a 0 if you want to convert Fahrenheit to Celsius");
	
	double answer = input.nextDouble();
	double cel = 0;
	double fah = 0;
	
	if (answer ==1){
      System.out.println("Enter a Celsius degree");
	  double cel = input.nextDouble(); 
      System.out.println(celsiusToFahrenheit(double fah));	  
	}
	else if (answer ==0){
	  System.out.println("Enter a Fharenheit degree");
	  double fah = input.nextDouble(); 
      System.out.println(fahrenheitToCelsius(double cel));	  
	}
	else {
	  System.out.println("Dude are you serious you have one job");
	}
	
  public static double celsiusToFahrenheit(double fah){
    
	double fah = (9.0/5) * cel + 32;
    return fah;
  
  }
  
  public static double fahrenheitToCelsius(double cel){
  
    double cel = (5.0/9) * (fah - 32);
	return cel;
  
  }
  }
}