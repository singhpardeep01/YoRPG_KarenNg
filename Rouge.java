//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public class Rouge extends Character{
    //---------Constructors-------------------
    public Rouge( String name ) {
	this.name = name;
	health = 140;
        strength = 90;
	defense = 40;
	atkRating = 0.4;
    }
    public void specialize() {
	strength = 100;
	defense = 50;
    }
    public void normalize() {
	strength = 90;
	defense = 40;
    }
    public String about() {
    }
   
}
	
