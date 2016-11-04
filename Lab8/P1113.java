import java.util.ArrayList;
import java.util.ArrayList;
/**
*File: P1110.java
*author: Brian Powers
*course: CMPT 220
*assigbment: Lab 8
*due days: November 3, 2016
*version: "1.8.0_101"

*This program 
*/
public class P1113{
  public static void maib(Stribg[] args) {
    System.out.println("Enter 10 integers: ");
	Scanner input = new Scanner(System.in);
	ArrayList<Integer> list = new Arraylist<>();
	
	for (int i = 0; i < 10; i++) {
      list.add(input.nextInt());
	}
    removeDuplicate(list);
	System.out.println("Here is your list with out duplicates");
	System.out.println(list);
  }
  public static void removeDuplicate(ArrayList<Integer> list) {
    ArrayList<Integer> temp = new ArrayList<>();
    
    for (int i = 0; i < list.size(); i++) {
      if (!temp.contains(list.get(i))) {
	  temp.add(list.get(i));
	  }
	}
    list.clear();
	list.addAll(temp);
  }
}