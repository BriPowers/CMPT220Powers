/**
*File: Queue.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 7
*due days: October 27, 2016
*version: "1.8.0_101"

*This program is a class fo queue for storing ints
*/

public class Queue{
  
  private int[] elements;
  private int size;
  private int capacity;
  
  public Queue(int capacity) {
    this.capacity = capacity;
    elements = new int[capacity];
  }
  
  public Queue() {
    this(0);
  }
  public void Enqueue(int b) {
    if (size >= elements.length) {
      int[] temp = new int[size * 2];
      System.arraycopy(elements, 0, temp, 0, size);
      elements = temp;
    }
    elements[size++] = b;
  }
  public int Dequeue() {
    int b = elements[0];
    size--;
    for (int i = 0; i < size; i++){
      elements[i] = elements[i + 1];
    }
    return b;	
  }
  public boolean isEmpty() {
	  return size == 0;
  }
  public int getSize() {
	  return size;
  }
  public int getCapacity() {
	  return capacity; 
  }
}
