import java.util.*;
public class P25{

  static Scanner console = new Scanner(System.in); 
  public static void main(String[] args){
	double item,tax,total;

	System.out.println("Enter item price: ");
	item = console.nextDouble();
	
	System.out.println("Enter gratuity rate : ");
	tax = console.nextDouble();
	
	total = item + (tax / 10);
	
	System.out.println("Your total comes out to: " + total);
	
	
   }	
 }