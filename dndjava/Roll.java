import java.util.*;

public class Roll{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random die = new Random();
		System.out.println("What do you want to roll:");
		int nod = input.nextInt();
		String d = input.next();
		int tod = input.nextInt();
		System.out.println("+ anything to each roll:");
		int plus = input.nextInt();
		System.out.println("------------------------------");
		
		int sum = 0;
		int result = 0;
		
		for (int i=0; i < nod; i++) {		
		  result = die.nextInt(tod) +1;
		  System.out.println(result);
		  sum += result;
		}
		sum += plus;
		System.out.println("The sum is: " + sum);
	}	
}