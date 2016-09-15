/**
*File: Lab1.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 1
*due date: September 14, 2016
*version: "1.8.0_101"

*This program calculates students final grades for Soft. Dev. 1
*/
import java.util.*;

public class Lab1{
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
  
  }
}