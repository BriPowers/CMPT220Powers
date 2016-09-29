/**
*File: lab3.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 3
*due days: September 22, 2016
*version: "1.8.0_101"

*This program calculates the distance between two points on the cartiesion plane
*/
import java.util.Scanner;

public class lab3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
	
	double x1, y1, x2, y2, b;
	double res;
	
	while (input.hasNext())  {
	x1 = input.nextDouble();
	if (x1 == 0)
	  break;

    y1 = input.nextDouble();
   
	x2 = input.nextDouble();
	
    y2 = input.nextDouble();
   
	b = input.nextDouble();
	
	res = Math.pow(Math.pow(Math.abs(x1 - x2),b) + 
	               Math.pow(Math.abs(y1 - y2),b),1/b);
	
	
	
	
	System.out.printf("%.10f\n",res);
	
    }	
  }
}


