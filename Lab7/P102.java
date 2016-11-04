/**
*File: P102.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 7
*due days: October 27, 2016
*version: "1.8.0_101"

*This program finds a persons body mass index
*/
import java.util.Scanner;

public class P102{
  public static void main(String[] args){
    BMI mybmi = new BMI("Brian", 19, 210.0, 6.0,1.0);
    System.out.println("Name: " + mybmi.getName());
    System.out.println("Age: " + mybmi.getAge());
    System.out.println("Weight: " + mybmi.getWeight());
    System.out.println("Height : " + mybmi.getHeight());
    System.out.println("BMI: " + mybmi.getBMI());
    System.out.println("Status: " + mybmi.getStatus());

 }
}