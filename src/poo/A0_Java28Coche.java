package poo;

public class A0_Java28Coche {
	
	//Características datos generales:
	private int ruedas;                //con el término private, se encapsulan las variables, para ser llamadas por el constructor
	private int largo;			       // en la otra clase.			
	private int ancho;
	private int motor;
	private int peso_plataforma;
	
	//Caracteristicas propias de cada coche:
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	//CONSTRUCTOR:
	public A0_Java28Coche() {          //Constructor que proporciona un estado inicial a los objetos de tipo coche.	
		ruedas = 4;					
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	//DATOS GENERALES
	public String dime_datos_generales() {                         // método <<  GETTER  >>  para conectar con la clase Uso coche.
		return "La plataforma del vehículo tiene " + ruedas + " ruedas" +     // No se realiza método Setter, pq en el constructor 
			". \nMide " + largo/1000 + " metros con un ancho de " + ancho +	  //...ya se asigna valor a las variables grles.
			" cm. \nUn peso de plataforma de " + peso_plataforma + " kilos."; 
	}
	
	//COLOR
	public void establece_color(String color_coche) {              // método <<  SETTER  >> Para modificar.
		color = color_coche;
	}
	
	public String dime_color() {
		return "\nEl color del coche es " + color + ".";                   // método <<  GETTER  >>.
	}
	
	//ASIENTOS
	public void configura_asientos(String asientos_cuero) {        // método Setter
		if(asientos_cuero.equalsIgnoreCase("si")) {				   //se usa EqualsIGnoreCase, pq se están comparando 2 cadenas de 
			this.asientos_cuero = true;							   //... de caracteres.
		}else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {                                // método Getter
		if(asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		}else {
			return "El coche tiene asientos de serie"; 
		}
	}
	
	//CLIMATIZADOR
	public void configura_climatizador(String climatizador) {      //método Setter
		if(climatizador.equalsIgnoreCase("si")) {                  //se usa EqualsIGnoreCase, pq se están comparando 2 cadenas de 
			this.climatizador = true;							   //... de caracteres.
		}else {
			this.climatizador = false;
		
		}
	}
	
	public String dime_climatizador() {                            // Getter
		if(climatizador == true) {
			return "El coche incorpora climatizador";
		}else {
			return "El coche lleva aire acondicionado"; 
		}
	}
	
	//PRECIO DEL AUTO
	public int precio_coche() {
		int precio_final = 10000;
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador == true) {
			precio_final+=1500;
		}
		return precio_final;
	}
}

	


