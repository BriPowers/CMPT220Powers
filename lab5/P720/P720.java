/**
*File: P720.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 5
*due days: October 6, 2016
*version: "1.8.0_101"

*This program sorts arrays using selection Sort by 
finding the largest number and switching it with the last number
*/
import java.util.Scanner;

public class P720{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	double[] B = new double[10];
	System.out.println("Enter 10 numbers: ");
	
	for (int i = 0; i < B.length; i++){
	  B[i] = input.nextDouble();
	}
	
	selectionSort(B);
	
	for (int i = 0; i < B.length; i++){
	  System.out.print(B[i] + " ");
	}
  }
  public static double[] selectionSort(double[] B){
	for (int i = B.length - 1; i > 1; i--) {
	  int currentIndex = i;
	  double currentHigh = B[i];
	  for (int k = i - 1; k > 0; k--){
	    if(currentHigh < B[k]) {
	      currentIndex = k;
		  currentHigh = B[k];
	  }
	}
	  if (currentIndex != i) {
	    double temp = B[currentIndex];
	    B[currentIndex] = B[i];
	    B[i] = temp;
	  }
	}
	return B;
  }
}
