// == missing header
import java.util.Scanner;
public class P26{
  public static void main(String args[]){
    Scanner dig = new Scanner(System.in);
    // == tabs!!
	System.out.println("Enter a number from 0-1000");
	int in = dig.nextInt();
	int ind1,ind2,ind3,realind2;
	
	
	/*
		int 343
		int 
		343%100
	*/
	
	ind2=in%100;//23 out of 123
	realind2=ind2/10;
	ind3=ind2%10;//3 of 123
	ind1=in / 100;
	System.out.println(ind1 + realind2 + ind3);
  }
}
