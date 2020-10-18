public class Fraction {

    int Numerateur; 
	int Denumirateur;
	//Constructeur
	Fraction (int Numerateur, int Denumirateur){
		this.Numerateur = Numerateur;
		this.Denumirateur = Denumirateur;
	}
	
	static String toString (int Numerateur, int Denumirateur) {
    	String s = Integer.toString(Numerateur) +"/"+Integer.toString(Denumirateur);
     	return (s);
	}
}
