// Un único fichero va a tener varias clases.
package poo;
import java.util.*;

//----------------------------------------------------------------------------------------------------------------------
//CLASE PRINCIPAL
public class A2_Java33UsoEmpleado {
	public static void main(String[] args) {
		
		/* FORMA 1
		--------------------------------------------------------------------------------------------------------------------------------------
		Empleado empleado1 = new Empleado("Paco Gómez", 85000, 1990, 12, 17);          // Empleado 1, 2 ó 3, son el nombre de la instancia, que pertenecen a la clase "Empleado".
		Empleado empleado2 = new Empleado("Ana López", 95000, 1995, 06, 02);		   // NEW
		Empleado empleado3 = new Empleado("María Martín", 105000, 2002, 03, 15); 	   // empleado(*).. *zona de argumentos, según los descritos en el método constructor. 
		
		
		empleado1.subeSueldo(5);  // uso del método "subeSueldo", para subir el sueldo de los empleados en un (5%).
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
	
		System.out.println("Nombre :" + empleado1.dameNombre() + " Sueldo: " + empleado1.dameSueldo() + "fecha de Alta: " + 
							empleado1.dameFechaContrato());
		
		System.out.println("Nombre :" + empleado2.dameNombre() + " Sueldo: " + empleado2.dameSueldo() + "fecha de Alta: " + 
				empleado2.dameFechaContrato()); 
		
		System.out.println("Nombre :" + empleado3.dameNombre() + " Sueldo: " + empleado3.dameSueldo() + "fecha de Alta: " + 
				empleado3.dameFechaContrato()); 
		------------------------------------------------------------------------------------------------------------------------------------
		*/
		
		
		// FORMA 2 CON ARRAY Y BUCLE FOR  
		
		
		//ARRAY DE LA CLASE EMPLEADO
		Empleado[] misEmpleados = new Empleado[3];   
		misEmpleados[0] = new Empleado("Paco Gómez", 85000, 1990, 12, 17);        // Se guardan los datos de los empleados en el Array.
		misEmpleados[1] = new Empleado("Ana lópez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado("María Martín", 105000, 2002, 03, 15);
		
		
		/*
		-----------------------------------------------------------------------------------------------------------------------------
		// BUCLE FOR
		for(int i=0; i<3; i++) {
			misEmpleados[i].subeSueldo(5); 
		}
		// BUCLE FOR
		for(int i=0; i<3;i++) {
			System.out.println("Nombre: " + misEmpleados[i].dameNombre() + "Sueldo: " + misEmpleados[i].dameSueldo()
								+ "fecha de alta: " + misEmpleados[i].dameFechaContrato());
		}
		----------------------------------------------------------------------------------------------------------------------------
		*/
		
		
		// BUCLE FOR MEJORADO (FOR EACH)
		for(Empleado e: misEmpleados) {                      // "e": es una variable que se crea en el bucle for mejorado.
			e.subeSueldo(5);
		}
		
		// BUCLE FOR MEJORADO 
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + "Sueldo: " + e.dameSueldo()
					+ "fecha de alta: " + e.dameFechaContrato());
		}
		
		
		
	}
}	





//COMIENZO CLASE EMPLEADO
class Empleado{	
//--------------------------------------------------------------------------------------------------------
	//METODO CONSTRUCTOR
	public Empleado(String nom, double sue, int agno, int mes, int dia){          // método constructor que recibe parámetros y argumentos.
			
		nombre = nom;
		sueldo = sue;   
		GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);  // GregorianCalendar es en clase 
																				  // Luego calendario, objeto creado de tipo GregorianCalendar. 
																				  // NEW : con el operador new, estamos llamando al CONSTRUCTOR de la clase.
																				  // El objetivo de esto es construir una fecha.
																				  // Se pone "mes-1", pq GregorianCalendar empieza a contar desde cero. 
		altaContrato = calendario.getTime();         	// En la variable altaContrato, almacenamos lo que nos devuelve el método getTime().	
	}																			  
//------------------------------------------------------------------------------------------------------------------------------------	
	
	// método GETTER
	public String dameNombre() {
		return nombre;
	}
	// método GETTER
	public double dameSueldo() {
		return sueldo;
	}
	// método GETTER
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	// método SETTER  													  // se encargará de "establecer" el valor de la variable sueldo. 
	public void subeSueldo(double porcentaje) {                           // este método es "void", por lo tanto no devuelve nada.
		double aumento = sueldo*porcentaje/100;                           // aquí se le dice al SETTER, que es lo que tiene que hacer.
		sueldo+=aumento;
	}
	
//------------------------------------------------------------------------------------------------------------------------------ 
	
	// VARIABLES DECLARADAS "CAMPOS DE CLASE"
	private String nombre;
	private double sueldo;
	private Date altaContrato;

//----------------------------------------------------------------------------------------------------------------------------
	
}