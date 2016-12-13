import java.util.*;
/*
*File: Race.java
*author: Brian Powers
*course: CMPT 220
*assignment: DM Kit
*version: "1.8.0_101"
*/

class Race{
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("If you are making a human enter 1");
    System.out.println("If you are making an elf enter 2");
    System.out.println("If you are making a half-elf enter 3");
    System.out.println("If you are making a gnome enter 4");
    System.out.println("If you are making a halfling enter 5");
    System.out.println("If you are making a half-orc enter 6");
    System.out.println("If you are making a Dwarf enter 7");
    int answer = input.nextInt();
    
    if (answer == 1){
    	System.out.println("You need to write all this down! or take a picture!");
    	System.out.println("Humans are medium sized");
    	System.out.println("Your base land speed is 30ft");
    	System.out.println("The best part about humans is they get...AN EXTRA FEAT!!!");
    	System.out.println("Then you get 4 extra skill points at level 1 and 1 extra each level");
    	System.out.println("You speak common");
    	System.out.println("Favored classes: Any");
    }
    else if (answer == 2){
    	System.out.println("You need to write all this down or take a picture!!");
    	System.out.println("Elfs are medium sized");
    	System.out.println("You get a +2 to Dexterity and -2 to Constitution");
    	System.out.println("You have immunity to magic sleep effects");
    	System.out.println("+2 for saving throws against against enchantment spells or effects");
    	System.out.println("Your base land speed is 30ft");
    	System.out.println("You have low-light vision(see twice as far as the light goes)");
    	System.out.println("Proficient in martial weapons");
    	System.out.println("You speak Common, Elven, Draconic, Gnoll, Gnome, Goblin, Orc and Sylvan");
    	System.out.println("You get a +2 to listen, search and spot checks");
    	System.out.println("Favored classes: Wizard, ranger, rogue");
    }
    else if (answer == 3){
    	System.out.println("You need to write all this down!");
    	System.out.println("Half-elfs are medium sized");
    	System.out.println("You have immunity to magic sleep effects");
    	System.out.println("+2 for saving throws against against enchantment spells or effects");
    	System.out.println("Your base land speed is 30ft");
    	System.out.println("You have low-light vision(see twice as far as the light goes)");
    	System.out.println("Proficient in martial weapons");
    	System.out.println("You speak Common and Elven");
    	System.out.println("You get a +1 to listen, search and spot checks");
    	System.out.println("You get a +2 to Diplomacy and gather information checks");
    	System.out.println("You have elven blood and are treated as an elf in terms of effects");
    	System.out.println("Favored classes: Any(maybe dragon shamon)");
    }
    else if (answer == 4){
    	System.out.println("You need to write all this down or take a picture!!");
    	System.out.println("Gnomes are small sized");
    	System.out.println("+1 to ac because youre small");
    	System.out.println("+1 to attack rolls because youre small");
    	System.out.println("You can carry 3/4 of what a human can carry");
    	System.out.println("+4 to hide because youre small");
    	System.out.println("+4 to ac against giant enimies");
    	System.out.println("+2 Constitiution and -2 Strength");
    	System.out.println("+2 for saving throws against illusions");
    	System.out.println("+1 to difficulty to saving throws against gnomes own illusions ");
    	System.out.println("Your base land speed is 20ft");
    	System.out.println("You have low-light vision(see twice as far as the light goes)");
    	System.out.println("You can treat a Gnome hooked hammer as a martial weapon instead of exotic");
    	System.out.println("+1 on attack rolls against kobolds and goblinods");
    	System.out.println("You speak Common, Gnome, Elven, Dwarven, Draconic, Giant, Goblin, Orc and burrowing mammal");
    	System.out.println("+2 for listen checks");
    	System.out.println("+2 for Craft (alchemy)");
    	System.out.println("You have dancing lights, ghost sound and prestidigitation once a day each");
    	System.out.println("Favored classes: Bard");
    }
    else if (answer == 5){
    	System.out.println("You need to write all this down or take a picture!!");
    	System.out.println("Halflings are small sized");
    	System.out.println("+1 to ac because youre small");
    	System.out.println("+1 to attack rolls because youre small");
    	System.out.println("You can carry 3/4 of what a human can carry");
    	System.out.println("+4 to hide because youre small");
    	System.out.println("+4 to ac against giant enimies");
    	System.out.println("+2 Dexterity and -2 Strength");
    	System.out.println("+1 for saving throws");
    	System.out.println("+2 for saving throws against fear (stacks with the +1)");
    	System.out.println("+2 to climb jump and move silently checks");
    	System.out.println("Your base land speed is 20ft");
    	System.out.println("You have low-light vision(see twice as far as the light goes)");
    	System.out.println("You can treat a Gnome hooked hammer as a martial weapon instead of exotic");
    	System.out.println("+1 on attack rolls against kobolds and goblinods");
    	System.out.println("You speak Common, Gnome, Elven, Dwarven, Draconic, Giant, Goblin, Orc and burrowing mammal");
    	System.out.println("+2 for listen checks");
    	System.out.println("Favored classes: rogue");
    }
    else if (answer == 6){
    	System.out.println("You need to write all this down or take a picture!");
    	System.out.println("Half-Orcs are Medium");
    	System.out.println("+2 Strength and -2 Intelligence and charisma");
    	System.out.println("You have dark vision: you can see 60 ft in the dark (black and white only)");
    	System.out.println("Your base land speed is 30ft");
    	System.out.println("You speak Common, Orc, Draconic, Gnoll, Giant, Goblin, and Abyssal");
    	System.out.println("You have Orc Blood where you are treated as an orc in terms of effects and gear");
    	System.out.println("Favored classes: fighter");
    }
    else if (answer == 7){
    	System.out.println("You need to write all this down or take a picture!");
    	System.out.println("Dwarfs are Medium");
    	System.out.println("+2 Constitution and -2 Charisma");
    	System.out.println("You have dark vision: you can see 60 ft in the dark(black and white only)");
    	System.out.println("Your base land speed is 20ft with no speed reductions");
    	System.out.println("+2 to search checks for stone work for secret doors and odd/unsafe stone formations");
    	System.out.println("You can tell exactly how deep under ground you are");
    	System.out.println("Dwarfs can use Dwarven axes and urgroshes as martial weapons");
    	System.out.println("+4 against bull rushes or trip attacks");
    	System.out.println("Dwarfs get a +2 to posion saving throws");
    	System.out.println("+2 to saving throws against spells and spell like abilities");
    	System.out.println("+1 to attack rolls against orcs and goblinoids");
    	System.out.println("+4 to ac against giant enimies");
    	System.out.println("+2 to appraisal checks for stone and gem items");
    	System.out.println("+2 to craft checks related to stone or metals");
    	System.out.println("You speak Common, Dwarf, Draconic, Gnome, Giant, Goblin, orc, terran and Undercommon");
    	System.out.println("Favored classes: fighter");
    }	
  }
}