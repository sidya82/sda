import java.util.*;

public class Ex4 {

	public static void main(String[] args) {
		String lol = "(2*x) + (6*y) - (y/2)";
		Map<Character,Integer> temp = new TreeMap<Character,Integer>();
		try {
			temp.put('x', 1);
			temp.put('y', 2);
			System.out.println(temp);
			
			Expression test = Builder.fromString(lol);
			
			System.out.println(test);
			System.out.println("resultat : " + test.evaluate(temp));
		} catch (Exception e) { e.printStackTrace(); }
	}
}

