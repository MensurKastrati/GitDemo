package Introduction.JavaBasics;
import java.util.ArrayList;

public class CoreJavaBrushUp2 {
	
	public static void main(String[] args) {
		
		int[] vargu = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 122};
		
		//2,4,6,8,10,122
		for(int i = 0; i < vargu.length; i++) {		
			if (vargu[i] % 2 == 0) {
				System.out.println(vargu[i]);
			}	
			else {
				System.out.println(vargu[i] + " nuk eshte numer qift");
			}
		}
		
		
		ArrayList<String> aL = new ArrayList();
		aL.add("Culiiiiiiiii");
		aL.add("Anikuuu");
		aL.add("Jeta");
		aL.remove(2);
		aL.add("Mirjetaa");
		
		System.out.println(aL);
		System.out.println(aL.get(0));
		
		
		
	}

}
