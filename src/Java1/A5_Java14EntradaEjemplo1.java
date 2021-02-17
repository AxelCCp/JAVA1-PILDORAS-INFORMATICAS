package Java1;

import java.util.Scanner;
public class A5_Java14EntradaEjemplo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre_usuario;
		int edad;
		
		System.out.println("Introduce tu nombre por favor:");
		nombre_usuario = entrada.next();
		
		System.out.println("Introduce edad, por favor:");	
		edad = entrada.nextInt();
		
		System.out.println("Hola " + nombre_usuario + ", El año que viene tendras "+  (edad + 1) + " años.");	
	}
}

