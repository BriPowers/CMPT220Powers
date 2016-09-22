/**
*File: P57.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 22, 2016
*version: "1.8.0_101"

*This program tells you how much your college tution will go up over 10 years and how much it will be in total for the incoming freshmen of the 10th year
*/
public class P57{
  public static void main(String[] args){
    double tuition = 10000;
	int year = 0;
	double interest = 1.05;
	
	for (year = 0; year <= 10; year++){
	  tuition = tuition * interest;
	  //System.out.println(tuition);
	  //System.out.println(year);
	}
	tuition=tuition*4;
	System.out.println(tuition);

  }
}