/**
*File: P913.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 6
*due days: October 20, 2016
*version: "1.8.0_101"

*This program finds the location of the max value in an array
*/
import java.util.Scanner;

public class P913{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Please enter the number of rows:");
    int r = input.nextInt();
	System.out.println("Please enter the number of Colums:");
    int c = input.nextInt();	
	System.out.println("Please enter the numbers for your array:");
    double[][] b = new double[r][c];
	for(int j=0; j<r; j++){
      for (int i = 0; i < c; i++){
	  b[j][i] = input.nextDouble();
	  }	
    }
   
	
   
	Location location = new Location(0,0,0);
	location = location.LocateLargest(b, r, c);
  	System.out.println("The largest value is " + location.maxv + " at "+ location.row + 
	", " + location.col);
  }
}