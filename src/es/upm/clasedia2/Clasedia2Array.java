package es.upm.clasedia2;

public class Clasedia2Array {
	public static void main(String[]  args) {
		int[] a1 = {1,2,3,4}; //mochila del elefante
		int a2 [] = {1,2,3,4}; //mochila del leon
		int a3[] = new int[4];
		
		// Comentario
		
		int x = 3 ;
		int y = 3;
		
		System.out.println("x == y: " + (x==y));
		System.out.println("a1 == a2: " + (a1==a2));
		
		System.out.println("Longitud a1: " + a1.length);
		System.out.println("a1[1] == a2[1]:" + (a1[1]==a2[1]));
		
		a2[1] = 5;
		System.out.println("a2[1]: " + (a2[1]));
	}

}
