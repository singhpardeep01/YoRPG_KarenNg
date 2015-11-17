//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public class Brownbun extends Character{
    //---------Constructors-------------------
    public Brownbun( String name ) {
	this.name = name;
	health = 135;
        strength = 50;
	defense = 100;
	atkRating = 0.4;
    }
    public void specialize() {
	defense = 50;
	atkRating = 0.9;
    }
    public void normalize() {
	defense = 100;
	atkRating = 0.4;
    }
    public String about() {
	return "tank with low strength";
    }

}
	
