/**
*File: P1010.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 7
*due days: October 27, 2016
*version: "1.8.0_101"

*This program is a class fo queue for storing ints
*/

public class P1010{
  public static void main(String[] args){
    Queue queue = new Queue();
    
    for (int i = 0; i < 20; i++) {
      queue.Enqueue(i);
    }

    for (int i = 0; i < 20;i++) {
      System.out.printf("%2d", queue.Dequeue());
      if((i + 1) % 5 == 0) 
        System.out.printf("\n");
    }
  }
}