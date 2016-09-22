/**
*File: P45.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This program finds the area of a pentagon givin the distance between 
]the center and a vertex 
*/

import java.util.Scanner;
public class P45{
  public static void main(String agrs[]){
    Scanner imputs = new Scanner(System.in);
	System.out.println("Enter number of sides");
	double nos = imputs.nextDouble();
	System.out.println("Enter length of side");
	double side = imputs.nextDouble();
	double nostan = Math.tan(nos);
	
	
	
	
	double area = ((nos * (side * side)) / (4 * nostan));
	System.out.println(area);

 
  }
}