/**
*File: P34.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This program is a lottery 
*/

import java.util.*;
public class P315{
  public static void main(String agrs[]){
  int lottery = (int)(Math.random() * 100);
  
  Scanner userimput = new Scanner(System.in);
  System.out.println("Imput a two digit guess:"); 
  int guess = userimput.nextInt();
  
  int lotterydig1 = lottery / 10;
  int lotterydig2 = lottery % 10;
  
  int guessdig1 = guess / 10;
  int guessdig2 = guess % 10;
  
  System.out.println("The lottey number is: " + lottery);
  

  if (guess==lottery){
    System.out.println("EXACT MATCH!!!! You win $10,000");
  }
      else if (lotterydig1==guessdig2 && lotterydig2==guessdig1){
	     System.out.println("Matched all digits: You win $3,000");
  }
	       else if (lotterydig1==guessdig2 || lotterydig2==guessdig1 
			   || lotterydig2==guessdig2 || lotterydig1==guessdig1 ){
	         System.out.println("Single digit match you win $1,000");
  }
		       else{
		         System.out.println("Haha no match");
  }  
  }
}