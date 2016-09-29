/**
*File: P79.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 4
*due days: September 29, 2016
*version: "1.8.0_101"

*This program finds the smallest value in an array
*/
import java.util.Scanner;

public class P79{
  public static void main(String[] args){
  
    final int size = 10;
    double[] val = new double[size];	
    Scanner input = new Scanner(System.in);
	System.out.println("Enter " + size + "numbers:");
	
	for (int i=0; i < val.length; i++)
	  val[i] = input.nextDouble();
	 
	System.out.println("The smallest number is:" + min(val));
  }  
  
  public static double min(double[] array) {
  
    double min = array[0];
    
	for(int i=0; i < array.length; i++) 
	  if (min > array[i]) min = array[i];
	  
	  return min;
  }
}