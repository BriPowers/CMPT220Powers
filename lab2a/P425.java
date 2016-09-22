/**
*File: P425.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 2
*due days: September 14, 2016
*version: "1.8.0_101"

*This program generates a licence plate
*/


public class P425 {
  public static void main(String[] args) {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 3; i++) {
    char ch = (char)(Math.random() * 26 + 'A');
    s.append(ch);
}
	  for (int i = 0; i < 4; i++) {
        char digit1 = (char)(Math.random() * 10 + '0');
        s.append(digit1);
}
        System.out.println("Vehicle plate number: " + s);
    }
}