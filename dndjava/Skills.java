import java.util.Scanner;
/*
*File: Skills.java
*author: Brian Powers
*course: CMPT 220
*assignment: DM Kit
*version: "1.8.0_101"
*/
public class Skills {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What kind of check are you trying to make:");
	String toc = input.next();
	//type of check
	System.out.println("What did you Roll:");
	int Roll = input.nextInt();
	toc = toc.toLowerCase();
	String lis = "listen";
	String see = "spot";
	String ser = "search";
	String cli = "climb";
	String mov = "move";
	
	if (toc.equals(lis))
	  System.out.println(Listen(Roll));
    else if (toc.equals(see))
      System.out.println(Spot(Roll));
    else if (toc.equals(ser))
      System.out.println(Search(Roll));
    else if (toc.equals(cli))
	  System.out.println(Climb(Roll));
    else if (toc.equals(mov))
	  System.out.println(Move(Roll));
    else
      System.out.println("Dude you messed up");
  
  }
  public static String Listen(int Roll){
 
    String Hear0 = "You can Hear loud noises such as yelling or a battle.";
    String Hear1 = "You can Hear a conversation form a close distance.";
    String Hear2 = "You can Hear an unarmered person walking around.";
    String Hear3 = "You can Hear someone with a lower move silently than your roll.";
    String Hear4 = "You can Hear a cat Stalking.";
    String Hear5 = "You can Hear a fly on the wall.";
	String Hear6 = "Dude youre lying";
    String returned = "";	
	
    if (Roll <= 1)
      returned = Hear0;
    else if (Roll > 1 && Roll <= 5)
      returned = Hear1;
    else if (Roll >= 6 && Roll <= 10)
      returned = Hear2;
    else if (Roll >= 11 && Roll <= 15)
      returned = Hear3;
    else if (Roll >= 16 && Roll < 20)
      returned = Hear4;
    else if (Roll == 20)
      returned = Hear5;
    else
      returned = Hear6;

    return returned;
  }
  public static String Spot(int Roll){
 
    String See0 = "You go temperarily blind.";
    String See1 = "You notice colors and can make out shapes.";
    String See2 = "You can see through disguise checks lower than your roll";
    String See3 = "You can read lips.";
    String See4 = "You have the eyes of an eagle.";
    String See5 = "You have perfect night vision.";
	String See6 = "Dude youre lying";
    String returned = "";
  	
    if (Roll <= 1)
      returned = See0;
    else if (Roll >= 1 && Roll <= 5)
      returned = See1;
    else if (Roll >= 6 && Roll <= 10)
      returned = See2;
    else if (Roll >= 11 && Roll <= 15)
      returned = See3;
    else if (Roll >= 16 && Roll < 20)
      returned = See4;
    else if (Roll == 20)
      returned = See5;
    else
      returned = See6;

    return returned;
  }
  public static String Search(int Roll){
 
    String Find0 = "You couldnt find something right infront of you.";
    String Find1 = "You can find something that is right infront of you.";
    String Find2 = "You can find very colorful or large objects.";
    String Find3 = "You can see through hide checks lowerthan your roll.";
    String Find4 = "You can Find trap doors and walls.";
    String Find5 = "You can Find anything if it is in a reasonable proximity.";
    String Find6 = "Dude youre lying";
    String returned = "";	
  
    if (Roll <= 1)
      returned = Find0;
    else if (Roll >  1 && Roll <= 5)
      returned = Find1;
    else if (Roll >= 6 && Roll <= 10)
      returned = Find2;
    else if (Roll >= 11 && Roll <= 15)
      returned = Find3;
    else if (Roll >= 16 && Roll < 20)
      returned = Find4;
    else if (Roll == 20)
      returned = Find5;
    else
      returned = Find6;

    return returned;
  }
  public static String Climb(int Roll){
 
    String Cli0 = "You fall.";
    String Cli1 = "You can climb easy trees and rock formations";
    String Cli2 = "You can climb a wall with a rope tied to it or assist you";
    String Cli3 = "You can climb brick walls";
    String Cli4 = "You can climb something with no foot holdings.";
    String Cli5 = "You can climb smooth surfaces.";
	String Cli6 = "Dude youre lying";
    String returned = "";	

    if (Roll <= 1)
      returned = Cli0;
    else if (Roll > 1 && Roll <= 5)
      returned = Cli1;
    else if (Roll >= 6 && Roll <= 10)
      returned = Cli2;
    else if (Roll >= 11 && Roll <= 15)
      returned = Cli3;
    else if (Roll >= 16 && Roll < 20)
      returned = Cli4;
    else if (Roll == 20)
      returned = Cli5;
    else
      returned = Cli6;

    return returned;
  }
  public static String Move(int Roll){
 
    String MS0 = "You are as loud as a battle.";
    String MS1 = "You can slip past someone sleeping";
    String MS2 = "You can slip past someone who is distracted.";
    String MS3 = "You can sneak up behind someone.";
    String MS4 = "You are as quiet as a cat.";
    String MS5 = "You make no noise.";
	String MS6 = "Dude youre lying";
    String returned = "";	
  
    if (Roll <= 1)
      returned = MS0;
    else if (Roll > 1 && Roll <= 5)
      returned = MS1;
    else if (Roll >= 6 && Roll <= 10)
      returned = MS2;
    else if (Roll >= 11 && Roll <= 15)
      returned = MS3;
    else if (Roll >= 16 && Roll < 20)
      returned = MS4;
    else if (Roll == 20)
      returned = MS5;
    else
      returned = MS6;

    return returned;
  }
} 
