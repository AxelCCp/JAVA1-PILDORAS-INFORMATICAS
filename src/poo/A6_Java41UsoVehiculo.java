package poo;

public class A6_Java41UsoVehiculo {
	
	public static void main(String[] args) {
	
//------------------------------------------------------------------------------------------------------------------------------
		
		//Se llama al CONSTRUCTOR de Clase "A0_Java28Coche" 
		A0_Java28Coche micoche1 = new A0_Java28Coche();                     // Se crea una instancia perteneciente a la clase "A0_Java28Coche", llamando al Constructor de la clase "A0_Java28Coche".
		
		//Método Setter, estalece color
		micoche1.establece_color("Rojo");
		
		
		
		//Se llama al CONSTRUCTOR de la clase A5_Java40Furgoneta
		A5_Java40Furgoneta mifurgoneta1 = new A5_Java40Furgoneta(7, 580);   //Se crea un objeto, una instancia que pertenece a la clase Furgoneta
																			//...Y se le pasan los parámetros del constructor de Furgoneta
		//Métodos Setter
		mifurgoneta1.establece_color("Azul");
		mifurgoneta1.configura_asientos("Si");
		mifurgoneta1.configura_climatizador("Si");
		
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		
		System.out.println(mifurgoneta1.dime_datos_generales());
		System.out.println(mifurgoneta1.dimeDatosFurgoneta());
		
	}
}
