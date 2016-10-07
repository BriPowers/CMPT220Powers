/**
*File: P732.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 5
*due days: October 6, 2016
*version: "1.8.0_101"

*This program sorts arrays using a pivot point
*/
import java.util.Scanner;

public class P732{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("Enter a length of the array you want to make: ");
	int size = input.nextInt();
	int[] Mylist = new int[size];
	System.out.println("Enter an array of numbers");
	
	for (int i = 0; i < size; i++) {
	 Mylist[i] = input.nextInt(); 
	}
	
	partition(Mylist);
  }
  
  public static int partition(int[] list) {
    
	int first = 0;
	int low = first + 1;
	int high = list.length - 1;
	int pivot = list[first];
	
	while (high > low) {
	  
	  while(low <= high && list[low] <= pivot) 
	    low++;
	  while (low <= high && list[high] > pivot)
	    high--;
		
	  if (high > low) {
        int temp = list[high];
		list[high] = list[low];
		list[low] = temp;
      }
	}
    
	while (high >= low && list[high] >= pivot) {
	  high--;
	}
	  
	  if (high > first){
	    int temp = list[high];
	    list[high] = list[first];
	    list[first] = temp;
	    return high;
	  }
	  else{
	    return first;
	  }
  }
}