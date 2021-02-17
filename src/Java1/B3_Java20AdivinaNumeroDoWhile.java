package Java1;

import java.util.Scanner;  
public class B3_Java20AdivinaNumeroDoWhile {                   //Juego con Do...While

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100);
		
		Scanner entrada = new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		do {
			intentos++;
			System.out.println("introduce un numero");
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("El número del programa es más bajo que el numero introducido");
			}
			
			else if(aleatorio > numero) {
				System.out.println("El número del programa es más alto que el numero introducido");
			}
		} while (numero != aleatorio);
		System.out.println("Correcto. Lo has conseguido en \" + intentos + \" intentos");
	}
}
