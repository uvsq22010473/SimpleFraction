
public class Main {

	public static void main(String[] args) {
	String test = "1/2";
        System.out.println("Welcome"); 
        Fraction frac = new Fraction (1,2);
        String s = Fraction.toString(1,2);
        System.out.println(s);
        assert test == Fraction.toString(1,2);
        
	}

}
