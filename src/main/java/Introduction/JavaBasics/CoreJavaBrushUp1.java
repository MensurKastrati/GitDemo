package Introduction.JavaBasics;

public class CoreJavaBrushUp1 {
	
	public static void main(String[] args) {
		
	/////////////////////////////////////////////////////////
		//Arrays
		
		int[] emriVargut = new int[5];
		emriVargut[0] = 10;
		emriVargut[1] = 20;
		emriVargut[2] = 30;
		emriVargut[3] = 40;
		emriVargut[4] = 50;
		//ose
		int[] vargu = {234, 542, 353, 453, 445};
		
		System.out.println(vargu[3]);
		
		String[] emri = {"Mensur", "Mirjeta", "Anik"};
		
	////////////////////////////////////////////////////
		
		//for loop
		
		for (int i = 0; i < vargu.length; i++) {
			System.out.println(vargu[i]);
		}
		
		for (int i = 0; i <emriVargut.length; i++) {
			System.out.println(emriVargut[i]);
		}
		
		for(int i = 0; i<emri.length; i++) {
			System.out.println(emri[i]);
		}
		
		for (String e : emri) {
			System.out.println(e);
		}
		
		
	}

}
