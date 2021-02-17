package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class A8_Java46UsoPersona {
	public static void main(String[] args) {
	
	//se declara un Array de tipo Persona
	Persona [] lasPersonas = new Persona[2];
	
	lasPersonas[0] = new Empleado3("Luis Conde", 5000, 2009, 02, 25);
	lasPersonas[1] = new Alumno("Ana López", "Biológicas");
	
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
	
	
	//declaraciónn de método abstracto                 >>  el método que deben de tener todas las clases que hereden de persona, pero que debe ser diferente para cada clase.
	public abstract String dameDescripcion();
	
	//declaración de variable nombre
	private String nombre;
}




class Empleado3 extends Persona{	
	//--------------------------------------------------------------------------------------------------------
		//METODO CONSTRUCTOR 1
		public Empleado3(String nom, double sue, int agno, int mes, int dia){          			// método constructor que recibe parámetros y argumentos.
			
			super(nom);                                                                         //super(nom) se invoca al constructor de la clase padre 'Persona'.
			
			sueldo = sue;   
			GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);  			// GregorianCalendar es una clase 																		  
			altaContrato = calendario.getTime();         										// En la variable altaContrato, almacenamos lo que nos devuelve el método getTime().	
			++IdSiguiente;
			Id=IdSiguiente;
		}		
		
		//se sobreescribe método dameDescripcion
		public String dameDescripcion() {
			return "Este empleado tiene un Id= " + Id + " con un sueldo=" + sueldo;
		}
		
										
	//------------------------------------------------------------------------------------------------------------------------------------	
		
		
		// método GETTER
		public double dameSueldo() {
			return sueldo;
		}
		// método GETTER
		public Date dameFechaContrato() {
			return altaContrato;
		}
		
		// método SETTER  													  // se encargará de "establecer" el valor de la variable sueldo. 
		public void subeSueldo(double porcentaje) {                           
			double aumento = sueldo*porcentaje/100;                           // aquí se le dice al SETTER, que es lo que tiene que hacer.
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
	
	//se sobreescribe método dameDescripción
	public String dameDescripcion() {
		return "Este alumno está estudiando la carrera de " + carrera; 
	}
	
	//declaración de variable
	private String carrera;
}
