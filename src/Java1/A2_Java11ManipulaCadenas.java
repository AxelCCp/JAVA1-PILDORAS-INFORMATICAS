package Java1;

public class A2_Java11ManipulaCadenas 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String nombre = "Felipe Juan Froilan de todos los Santos";
		
		System.out.println("Mi nombre tiene " + nombre.length() + " letras.");
		System.out.println("La primera letra de mi nombre es " + nombre.charAt(0));
		System.out.println("La primera letra de " + nombre + " es la " + nombre.charAt(0));
		
		
		int ultima_letra;
		ultima_letra = nombre.length();
		
		System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));	
	}
}
