/**
*File: P34.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This program puts 3 numbers in order
*/


import java.util.*;
public class P38{
  public static void main(String args[]){
   Scanner nums = new Scanner(System.in);
   
   int num1,num2,num3;
   System.out.println("Input a number:");
   num1 = nums.nextInt();
   System.out.println("Input a different number:");
   num2 = nums.nextInt();
   System.out.println("Input a new number:");
   num3 = nums.nextInt();

   if (num1 > num2 && num1 > num3 && num2 > num3){
     System.out.println(num1 +""+ num2 +""+ num3);
   }
     else if (num1 > num2 && num1 > num3 && num3 > num2){
       System.out.println(num1 + "" + num3 + "" + num2);
   }
       else if (num2 > num1 && num2 > num3 && num1 > num3){
         System.out.println(num2 +""+ num1 +""+ num3);
   }
		 else if (num2 > num1 && num2 > num3 && num3 > num1){
		  System.out.println(num2 +""+ num3 +""+ num1);
   }
		  else if (num3 > num1 && num3 > num2 && num2 > num1){
		    System.out.println(num3 +""+ num2 +""+ num1);
   } 
		    else if (num3 > num1 && num3 > num2 && num1 > num2){
		      System.out.println(num3 +""+ num2 +""+ num1);
   } 
   
   
   
  }
}