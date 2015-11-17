//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public class Mage extends Character{
    //---------Constructors-------------------
    public Mage( String name ) {
	this.name = name;
	health = 175;
        strength = 60;
	defense = 40;
	atkRating = 0.4;
    }
    public void specialize() {
	defense = 10;
	atkRating = 0.8;
    }
    public void normalize() {
	defense = 40;
	atkRating = 0.4;
    }
    public String about() {
    }

}
	
