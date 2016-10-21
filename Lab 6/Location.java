
import java.util.Scanner;

public class Location{
  static int row;
  static int col;
  static double maxv;
  public Location (int row, int col, double maxv){
    this.row=row;
	this.col=col;
	this.maxv=maxv;
  }
  public static Location LocateLargest(double[][] b, int rl, int cl){
   Location loc = new Location(row, col, maxv);
   for (int r = 0; r < rl;r++){
     for(int c = 0; c < cl; c++){
	   if(b[r][c] >= maxv){
		  loc.row = r;
		  loc.col = c;
		  loc.maxv = b[r][c];
		}
	   
	  }
  
  }
return loc;
  	
  }
}