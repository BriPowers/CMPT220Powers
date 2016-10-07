/**
*File: P731.java
*author: Brian Powers
*course: CMPT 220
*assignment: Lab 5
*due days: October 6, 2016
*version: "1.8.0_101"

*This program sorts arrays using merge sort
*/
import java.util.Scanner;

public class P731{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
	System.out.println("enter the length of the arrays:");
	int size = input.nextInt();
	System.out.println("enter numbers in order:");
	int[] Mylist1 = new int[size];
	for (int i = 0; i < 11; i++){
	  Mylist1[i] = input.nextInt();
	}
	
	System.out.println("enter numbers in order:");
	int[] Mylist2 = new int[size];
	for (int i = 0; i < 11; i++){
	  Mylist2[i] = input.nextInt();
	}
	int[] mergedList = merge(Mylist1, Mylist2);
	for(int i = 0; i < mergedList.length; i++) {
	  System.out.println(mergedList[i]);
	}
  }
  public static int[] merge(int[] list1,int[] list2){
    int[] merged = new int[list1.length + list2.length];
	
	int m = 0;
	int l1 = 0;
	int l2 = 0;
	
	boolean isL1Done = false;
	boolean isL2Done = false;
	
	while(!isL1Done || !isL2Done) {
	
      if (l1 == list1.length) 
	    isL1Done = true;
	  if (l2 == list2.length) 
	    isL2Done = true;
	  if (isL1Done && isL2Done) 
	    break;
	  
	  if (!isL1Done && isL2Done)
        merged[m++] = list1[l1++];
	  else if(!isL2Done && isL1Done) 
	    merged[m++] = list2[l2++];
	  else if(list1[l1] <= list2[l2])
        merged[m++] = list1[l1++];
      else if(list2[l2] <= list1[l1])
        merged[m++] = list2[l2++];	  
	}
	return merged;
  }
}
	
	
	