/**
*File: P68
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 4
*due days: September 29, 2016
*version: "1.8.0_101"

*This program coverts fahrenheit to celsius and vise versa
*/

import java.util.Scanner;


public class P68 {
  public static void main(String[] args) {
  String c = "Celsius";
  String f = "Fahrenheit";
  System.out.printf("%s%15s | %10s%10s\n", c, f, f, c);
  
  for (double celsius=40.0; fahrenheit= 120.0; celsius >= 31.0; celsius--; fahrenheit-=10;) {
  System.out.printf("%4.2f%17.2 | %10.2f%10.2f\n", celsius, celsiusToFahrenheit(celsius),
  fahrenheit, fahrenheitToCelsius(fahrenheit));
  }
  
  
  
  
  
  }
  public static double celsiusToFahrenheit(double cel){
    
    double fah = (9.0/5) * (cel + 32);
    return fah;
  
  }
  
  public static double fahrenheitToCelsius(double fah){
  
    double cel = (5.0/9) * (fah - 32);
	return cel;
  
  }
}
