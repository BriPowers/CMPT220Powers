/**
*File: Lab1.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due date: September 14, 2016
*version: "1.8.0_101"

*This program calculates students final grades for Soft. Dev. 1
*/
import java.util.*;
public class Lab2{
  public static void main(String[] args){
    Scanner grades = new Scanner(System.in);
    double homework,quiz,midtermexam,finalexam,finalgrade;
    System.out.println("imput your homework and labs grade:");
    homework = grades.nextDouble();
    System.out.println("imput your quiz grade: ");
    quiz = grades.nextDouble();
    System.out.println("imput your midterm exam grade: ");
    midtermexam = grades.nextDouble();
    System.out.println("imput your final exam grade: ");
    finalexam = grades.nextDouble();
    System.out.println("Your final grade is: ");
    finalgrade = (homework*.4) + (quiz*.2) + (midtermexam*.2) + (finalexam*.2);
    System.out.println(finalgrade);
               
      if (finalgrade>=95 && finalgrade <=100){
        System.out.println("You got an A");
      }
	      else if (90 <= finalgrade && finalgrade <= 94){
            System.out.println("You got an A-");
          }
		      else if (87 <= finalgrade && finalgrade <= 89){
                System.out.println("You got a B+");
              }
			      else if (83 <= finalgrade && finalgrade <= 86){
                    System.out.println("You got a B");
                  }
				      else if (80 <= finalgrade && finalgrade <= 82){
                        System.out.println("You got a B-");
                      }
		                  else if (77 <= finalgrade && finalgrade <= 79){
                            System.out.println("You got a C+");
                          }
			                  else if (73 <= finalgrade && finalgrade <= 76){
                                System.out.println("You got a C");
                              }
						          else if (70 <= finalgrade && finalgrade <= 72){
                                    System.out.println("You got a C-");
                                  }
						              else if (65 <= finalgrade && finalgrade <= 69){
                                        System.out.println("You got a D");
                                      }
									      else{
                                            System.out.println("You got an F");
                                          }                                                
}
}