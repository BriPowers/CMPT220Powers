import java.util.ArrayList;
/**
*File: MyStack.java
*author: Brian Powers
*course: CMPT 220
*assigbment: Lab 8
*due days: November 3, 2016
*version: "1.8.0_101"

*This program 
*/
public class MyStack extends ArrayList<Object> {
  public Object peek() {
    return get(size() - 1);  
  }

  public Object pop() {
    Object b = get(size() - 1);
    remove(size() - 1);
    return b;
  }
    
  public void push(Object b) {
    add(b);
  }
  public String toString() {
    return "stack: " + super.toString();
  }
}  