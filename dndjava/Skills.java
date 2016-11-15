import java.util.*

public class Skills {
  public static void main(Strings[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("What kind of check are you trying to make:");
	String toc = input.next();
	System.out.println("What did you roll:");
	int roll = input.nextInt();
	
	String lis = "Listen";
	String see = "Spot";
	String ser = "Search";
	String cli = "Climb";
	String mov = "Move silently";
	
	if (toc.equals(lis))
	  getListen(roll);
    else if (toc.equals(see))
      getSpot(roll);
    else if (toc.equals(ser))
      getSearch(roll);
    else if (toc.equals(cli))
	  getClimb(roll);
    else if (toc.equals(mov))
	  getMove(roll);
  }
  

}