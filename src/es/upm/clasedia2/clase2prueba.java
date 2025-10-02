package es.upm.clasedia2;
import java.util.Scanner;

public class clase2prueba {
	
	//Reciba un entero y lo transforme en el umbral restando de 1 en 1
	public static void main(String[] args) {
		int umbral = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor escriba un entero:");
		
		int x = sc.nextInt(); //con esto guardo en pantalla lo que ha escrito el usuario
		
		if (x > umbral) {
			System.out.println("Por encima del umbral");
			System.out.println("Has escrito el número" + x);
			while(x > umbral) {
				System.out.println("Se reduce en 1");
				x--;
			}
		}
		else if(x==umbral) {
			System.out.println("Exactamene el umbral");
		}
		else {
			System.out.println("Por debajo del umbral");
			//Sumarle 1 tantas veces como sea necesario para llegar al umbral
			for(int i = x; i < umbral; i++) {
				System.out.println("Se incrementa en 1");
				x++;
			}
		}
		
		
	}
}

//un breakpoint con el Debug vemos las cosas paso a paso