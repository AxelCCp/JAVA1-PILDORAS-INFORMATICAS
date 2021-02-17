package Java1;

import java.util.Scanner;    // Adivina el número aleatorio que genera el programa. 
public class B2_Java19AdivinaNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio = (int)(Math.random()*100);            // se declara variable de tipo entero, para hacer refundición, 
														     // ... o sea convertir a int, para quitar los decimales que entrega Math.random. 
		Scanner entrada	= new Scanner(System.in);
		
		int numero = 0;
		int intentos = 0;
		
		while(numero != aleatorio) {
			intentos++;
			System.out.println("Introduce un numero por favor");
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("El número del programa es más bajo que el numero introducido");
			}
			
			else if(aleatorio > numero) {
				System.out.println("El número del programa es más alto que el numero introducido");
			}		
		}
		System.out.println("Correcto. Lo has conseguido en " + intentos + " intentos");
	}
}
