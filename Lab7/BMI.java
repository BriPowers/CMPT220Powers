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

public class BMI{
  String name;
  int age;
  double weight; //in pounds
  double height; // in inches
  double feet;
  double inches;
  public final double kiloperpound = 0.4535937;
  public final double MPI = .0254;
  
  public BMI(String name, int age, double weight, double feet, double inches) {
    this.name = name;
    this.age = age;
    this.weight = weight;
    this.feet = feet;
    this.inches = inches;
    this.height = (feet * 12) +inches;
  }
  public double getBMI() {
    double bmi = weight * kiloperpound / 
               ((height * MPI) * (height * MPI));
    return Math.round(bmi * 100) / 100.0;
  }
  public String getStatus() {
    double bmi = getBMI();
    if (bmi < 18.5)
      return "Underweight";
    else if (bmi < 25)
      return "Average";
    else if (bmi < 30)
      return "Overweight";
    else 
      return "Obese";  
  }
  public String getName() {
    return name;
  }
  public int getAge() {
    return age;
  }
  public double getWeight() {
    return weight;
  }
  public double getHeight() {
    return height;
  }
  public double getInches() {
    return inches;
  }
  public void setInches(double inches){
    this.inches = inches;
  }
  public double getFeet() {
    return feet;
  }
  public double setFeet(double feet) {
    this.feet = feet;
    return feet;
  }
 }