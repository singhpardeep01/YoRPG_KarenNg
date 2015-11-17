//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW31 -- Ye Olde Role Playing Game, Unchained
//11-16-2015

public class Monster extends Character{

    //---------Constructors-------------------
    public Monster() {
	health = 150;
	strength = (int) ( Math.random() * 45 + 20 );
	defense = 20;
	atkRating = 1;
    }
    public void specialize() {
    }
    public void normalize() {
    }
    public String about() {
	return "Slayer of the good.";
}
	
