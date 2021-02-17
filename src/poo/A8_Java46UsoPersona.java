package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class A8_Java46UsoPersona {
	public static void main(String[] args) {
	
	//se declara un Array de tipo Persona
	Persona [] lasPersonas = new Persona[2];
	
	lasPersonas[0] = new Empleado3("Luis Conde", 5000, 2009, 02, 25);
	lasPersonas[1] = new Alumno("Ana L�pez", "Biol�gicas");
	
	for (Persona p: lasPersonas){
		
		System.out.println(p.dameNombre() + ", " + p.dameDescripcion());
		
	}
	
	
	}
}

//CLASE PERSONA
abstract class Persona{
	
	//CONSTRUCTOR de la clase Persona.
	public Persona(String nom) {
		nombre=nom;
	}
	
	//Getter
	public String dameNombre() {
		return nombre;
	}
	
	
	//declaraci�nn de m�todo abstracto                 >>  el m�todo que deben de tener todas las clases que hereden de persona, pero que debe ser diferente para cada clase.
	public abstract String dameDescripcion();
	
	//declaraci�n de variable nombre
	private String nombre;
}




class Empleado3 extends Persona{	
	//--------------------------------------------------------------------------------------------------------
		//METODO CONSTRUCTOR 1
		public Empleado3(String nom, double sue, int agno, int mes, int dia){          			// m�todo constructor que recibe par�metros y argumentos.
			
			super(nom);                                                                         //super(nom) se invoca al constructor de la clase padre 'Persona'.
			
			sueldo = sue;   
			GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);  			// GregorianCalendar es una clase 																		  
			altaContrato = calendario.getTime();         										// En la variable altaContrato, almacenamos lo que nos devuelve el m�todo getTime().	
			++IdSiguiente;
			Id=IdSiguiente;
		}		
		
		//se sobreescribe m�todo dameDescripcion
		public String dameDescripcion() {
			return "Este empleado tiene un Id= " + Id + " con un sueldo=" + sueldo;
		}
		
										
	//------------------------------------------------------------------------------------------------------------------------------------	
		
		
		// m�todo GETTER
		public double dameSueldo() {
			return sueldo;
		}
		// m�todo GETTER
		public Date dameFechaContrato() {
			return altaContrato;
		}
		
		// m�todo SETTER  													  // se encargar� de "establecer" el valor de la variable sueldo. 
		public void subeSueldo(double porcentaje) {                           
			double aumento = sueldo*porcentaje/100;                           // aqu� se le dice al SETTER, que es lo que tiene que hacer.
			sueldo+=aumento;
		}
		
	//------------------------------------------------------------------------------------------------------------------------------ 
		
		// VARIABLES DECLARADAS "CAMPOS DE CLASE"
		private double sueldo;
		private Date altaContrato;
		private static int IdSiguiente;
		private int Id;

	//----------------------------------------------------------------------------------------------------------------------------
		
	}


class Alumno extends Persona{
	
	//CONSTRUCTOR de clase Alumno
	public Alumno (String nom, String car) {
		super(nom);
		
		carrera = car;
	}
	
	//se sobreescribe m�todo dameDescripci�n
	public String dameDescripcion() {
		return "Este alumno est� estudiando la carrera de " + carrera; 
	}
	
	//declaraci�n de variable
	private String carrera;
}
