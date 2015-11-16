//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW30 -- Ye Olde Role Playing Game, Expanded
//11-14-2015

public class Character {

    protected int health;
    protected int strength;
    protected int defense;
    protected double atkRating;
    protected String name;


    public boolean isAlive() {
	return health > 0;
    }

    //returns name of character
    public String getName() {
	return name;
    }

    //return the defense stat
    public int getDefense() {
	return defense;
    }

    //lower the amount of health based on damage done by  warrior
    public void lowerHP( int damage ) {
	health -= damage;
    }
    //find how much damage can be done and lowers it from the warrior if the damage is higher than 0
    public int attack( Character enemy ) {
	int damage = (int) ( (strength * atkRating) - enemy.getDefense() );
	if (damage >= 0){
	    enemy.lowerHP( damage );
	    return damage;
	}
	return 0;
    }

    public void specialize() {
	defense -= 20;
	atkRating += .2;
    }
    //returns stats back to normal if you dont do a special attack
    public void normalize() {
	defense = 40;
	atkRating = 0.4;
    }

    //returns a String describing a Warrior, Monster, Mage, Rogue, etc
    public static String about(String s){
	if (s.equals("Warrior")){
	    return "high strength with moderate health";
	}
	else if (s.equals("Mage")){
	    return"high health with moderate strength";
	}
	else if (s.equals("Rouge")){
	    return "high strength with moderately-high health";
	}
	else if (s.equals("Brownbeard")){
	    return "one-hit k.o. with low defense";
	}
	else if (s.equals("Brownbun")){
	    return "tank with low strength";
	}
	else {
	    return "invalid";
	}
    }
}//end class character
