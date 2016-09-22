/**
*File: P41.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This program finds the area of a pentagon givin the distance between 
]the center and a vertex 
*/

import java.util.Scanner;
public class P41{
  public static void main(String agrs[]){
    Scanner imputs = new Scanner(System.in);
	System.out.println("Enter the distence from the center to a vertex of a pentagon and ill tell you its area");
	double radius = imputs.nextDouble();
	double area = ((5 * (radius * radius)) / (4 * .01097));
	System.out.println(area);

 
  }
}