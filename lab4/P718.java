/**
*File: P718.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 4
*due days: September 29, 2016
*version: "1.8.0_101"

*This program is an example of bubble sort
*/

public class P718{
  public static void main(String[] args){
    
	double[] mylist = new double[10];
	  
	  for (int i = 0; i < mylist.length; i++) {
	    mylist[i] = Math.random() * 100;
	  }
	  bubbleSort(mylist);
      printArray(mylist, 10);	  
  }
  public static void printArray(double[] array, int npl) {
  
    for (int i = 0; i < array.length; i++) {
	  System.out.printf("%3.0f", array[i]);
	  if ((i + 1) % npl==0) System.out.println(""); 
	}
  
  }
  public static void bubbleSort(double[] numbers) {
    
	boolean swap;
    
	do {
	  swap = false;
	  
	  for (int i = 0; i < numbers.length - 1; i++){
	    if (numbers[i] > numbers[i + 1]){
	      double temp = numbers[i];
		  numbers[i] = numbers[i + 1];
		  numbers[i + 1] = temp;
		  swap = true;
	    }
	  }
	}while(swap);
  }
}