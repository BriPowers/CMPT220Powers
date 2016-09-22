/**
*File: P513.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 22, 2016
*version: "1.8.0_101"
*This program uses a while loop to find the smallest number 
*that is greater than 12,000 when cubed
*/
public class P513 {
  public static void main(String[] args) {
    
    int num = 0;
	
	while (Math.pow(num,3) < 12000) {
	num++;
	}

	    System.out.println(num +
		"Is the smallest number that when cubed is greater than 12,000");


 }
}