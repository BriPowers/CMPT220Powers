import java.util.*;
/*
*File: Battle.java
*author: Brian Powers
*course: CMPT 220
*assignment: DM Kit
*version: "1.8.0_101"
*/
public class Battle {
  static HashMap<String, Integer> health = new HashMap<>();
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("NO SPACES!!!!!!");
    //players
    System.out.println("How many players are there:");
    int nop = input.nextInt();
    ArrayList<String> playername = new ArrayList<String>(nop);
    ArrayList<String> playerinit = new ArrayList<String>(nop);
    
    
    for(int i = 1; i <= nop; i++) {
      System.out.println("What is player" + i +"'s name: ");
      String name1 = input.next();
      String name = name1.substring(0,1).toUpperCase() + name1.substring(1).toLowerCase();
      playername.add(name);
    }
    
    for(int i = 0; i < nop; i++) {
      System.out.println("What is " + playername.get(i) + "'s Initiative: ");
      String pinit = input.next();
      playerinit.add(pinit);
    }
    //adds players to healh
    for(int i = 0; i < nop; i++) {
      System.out.println("What is " + playername.get(i) + "'s hp: ");
      int php = input.nextInt();
      health.put(playername.get(i),php);
    }
     //monsters
    System.out.println("What type of monster: ");
    String monname = input.next();
    String mn = monname.substring(0,1).toUpperCase() + monname.substring(1).toLowerCase();
    
    System.out.println("How many Monsters are there: ");
    int nom = input.nextInt();
    
    System.out.println("How much HP does each monster have: ");
    int mhp = input.nextInt();
    
    //adds monsters to health
    ArrayList<String> monstername = new ArrayList<String>(nom);
    for (int i = 0;i < nom;i++) {
      String name = mn + i;
      monstername.add(name);
    }
    for (int i = 0; i < monstername.size();i++){
      health.put(monstername.get(i),mhp);
    }
    System.out.println("What is their initiative modifier: ");
      int initmod = input.nextInt();
    
    Random ran = new Random();
    ArrayList<Integer> monsterinit = new ArrayList<Integer>();
    for (int i = 0;i < nom;i++) {
      int init = ran.nextInt(20) + 1 + initmod;
      monsterinit.add(init);
    }
    ArrayList<String> sortedinit = new ArrayList<String>(100);
    
    //adds players and monsters to sortedinit
    for (int i = 0;i < playername.size();i++) {
      sortedinit.add(playerinit.get(i) + " -" + playername.get(i));
    }
    for (int i = 0;i < monstername.size();i++) {
      sortedinit.add(Integer.toString(monsterinit.get(i)) + " -" + monstername.get(i));
    }
    	
    //sorts Array list of merged strings
    Comparator<String> comparator = new MyComparator();
    Collections.sort(sortedinit,comparator);
    
    //reverses array list to make it decending order
    Collections.reverse(sortedinit);
    for(int i = 0; i < sortedinit.size();i++) {
      System.out.println(sortedinit.get(i));
    }
    //split the arraylist values so i can later remove them during the battle
    List<String> parted = new ArrayList<>();
    for (int i = 0; i < sortedinit.size();i++) {
      String[] part = sortedinit.get(i).split("-");
      parted.add(part[1]);
    }
    
    
    
    System.out.println("--------------------------------------------------------");
    System.out.println();
    //where the magic happens
    while (true){
      for (int i = 0;i < sortedinit.size();i++) {
        System.out.println("-----------------------");
        System.out.println(sortedinit.get(i));
        System.out.println("Who are they attacking:");
        String look = input.next();
        String find = look.substring(0,1).toUpperCase() + look.substring(1).toLowerCase();
        
        
        if(health.containsKey(find)){
        System.out.println(find + " " + health.get(find));
        
        System.out.println("How much damage:");
        int hurt = input.nextInt();
        
        health.put(find, health.get(find) - hurt);
        System.out.println(find + " " + health.get(find));
        
          if (health.get(find) <= 0) {
            health.remove(find);
            System.out.println(find + " is dead!!!");
            for (int j = 0; j < parted.size();j++) {
                if (find.equals(parted.get(j))) {
                    sortedinit.remove(j);
    
    }
            }  
          }		  
          else {
            System.out.println(find + " is still alive");
          }
        }
        else{	
        }
      }
    }
  }
}

class MyComparator implements Comparator<String> {
  public int compare(String arg0, String arg1) {
    int indexOf = arg0.indexOf("-");
    String substring = arg0.substring(0, indexOf-1);
    int indexOf1 = arg1.indexOf("-");
    String substring1 = arg1.substring(0, indexOf1-1);
    return Integer.valueOf(substring) - Integer.valueOf(substring1);
  }
}
