//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public class Warrior extends Character{
    //---------Constructors-------------------
    public Warrior( String name ) {
	this.name = name;
	health = 125;
        strength = 100;
	defense = 40;
	atkRating = 0.4;
    }
    public void specialize() {
	defense = 20;
	atkRating = 0.6;
    }
    public void normalize() {
	defense = 40;
	atkRating = 0.4;
    }
    public String about() {
    }

}
	
