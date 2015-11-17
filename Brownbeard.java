//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public class Brownbeard extends Character{
    //---------Constructors-------------------
    public Brownbeard( String name ) {
	this.name = name;
	health = 115;
        strength = 175;
	defense = 20;
	atkRating = 0.4;
    }
    public void specialize() {
	defense = 40;
	atkRating = 0.5;
    }
    public void normalize() {
	defense = 20;
	atkRating = 0.4;
    }
    public String about() {
    }
}
	
