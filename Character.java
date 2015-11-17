//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public abstract class Character {

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

    public abstract void specialize();
    
    //returns stats back to normal if you dont do a special attack
    public abstract void normalize();

    //returns a String describing a Warrior, Monster, Mage, Rogue, etc
    public abstract String about(String s);
}//end class character
