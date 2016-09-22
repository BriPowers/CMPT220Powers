/**
*File: P34.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This program randomly generates a number and a corresponding month
*/




import java.util.*;
public class P34{
  public static void main(String args[]){
    Random num = new Random();
    int month;
  
    month = num.nextInt(12) + 1;
	
	System.out.println(month);
	
	if(month == 1){
	  System.out.println("January");
	}
      else if(month == 2){
	    System.out.println("febuary");
	}
        else if(month == 3){
	      System.out.println("march");
	}  
		  else if(month == 4){
	        System.out.println("april");
	}
			else if(month == 5){
	          System.out.println("May");
	}
			  else if(month == 6){
	            System.out.println("June");
	}
				else if(month == 7){
	              System.out.println("July");
	}
				  else if(month == 8){
				    System.out.println("August");
	}
					else if(month == 9){
					  System.out.println("September");
	}
					  else if(month == 10){
						System.out.println("october");
	}
						else if(month == 11){
						  System.out.println("November");
	}					 
						  else if(month == 12){
						   System.out.println("December");
	}
	
	
	
  }
}
