/**
*File: P813.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 5
*due days: October 6, 2016
*version: "1.8.0_101"

*This program finds the smallest value in an array
*/
import java.util.Scanner;

public class P813{
  public static void main(String[] args){
    int[][] b = new int[20][10];
  
   // b{2}[4]  //third row fifth column
    for (int row = 0; row<20;row++){
	  for(int col = 0; col<10; col++){
	   b[row][col] = (int)(Math.random()*100);
	   System.out.println(b[row][col]);
	  }
	}
    int rr=cr=0;
	int maxVal = 0;
    for (int row = 0; row<20;row++){
	  for(int col = 0; col<10; col++){
	    if(b[row][col] >= maxVal){
		  rr = row;
		  cr = col;
		  maxVal=b[row][col];
		}
	   
	  }
	}
    System.out.println("The max value is: " + maxVal);
    System.out.println("the row location is row: " + rr + "The column location is column: " + cr);	
  }
}