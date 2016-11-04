import java.math.BigDecimal;
/**
*File: P1017.java
*author: Brian Powers
*course: CMPT 220
*assigbment: Lab 7
*due days: October 27, 2016
*version: "1.8.0_101"

*This program 
*/

public class P1017{
  public static void main(String[] args) {

    BigDecimal longMaxValue = new BigDecimal(Long.MAX_VALUE);
    long start = (long) Math.sqrt(Long.MAX_VALUE);
    BigDecimal b = new BigDecimal(start);
    int count = 0;

    while (count < 10) {

      BigDecimal squared = b.multiply(b);
      if (squared.compareTo(longMaxValue) > 0) {
        count++;
        System.out.println(count + ": " + b + " squared = " + squared);
      }
      b = b.add(BigDecimal.ONE);
    }
  }
}