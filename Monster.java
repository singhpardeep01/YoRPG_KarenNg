//Team Karen Ng -- Pardeep Singh, Jack Schluger, Jessica Yang
//APCS1 pd09
//HW30 -- Ye Olde Role Playing Game, Expanded
//11-14-2015

public class Monster extends Character{

    //---------Constructors-------------------
    public Monster() {
	health = 150;
	strength = (int) ( Math.random() * 45 + 20 );
	defense = 20;
	atkRating = 1;
    }

}
	
