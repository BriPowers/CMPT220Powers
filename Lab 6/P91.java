/**
*File: P91.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 6
*due days: October 20, 2016
*version: "1.8.0_101"

*This program finds a rectangles area and perimiter with methods and classes
*/
import java.util.Scanner;

public class P91{
  public static void main(String[] args){
    MyRec[] rectangles = new MyRec[2];
    rectangles[0] = new MyRec(4,40);
	rectangles[1] = new MyRec(3.5, 35.9);
	
	for (int i = 0; i < 2; i++){
	  System.out.println("MyRec" + (i + 1));
	  System.out.println("Area =  " + rectangles[i].getArea());
	  System.out.println("Perimeter = " + rectangles[i].getPerimeter());
	}  
  }
}