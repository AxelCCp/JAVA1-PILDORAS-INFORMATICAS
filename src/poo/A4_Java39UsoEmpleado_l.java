
//  <<< SOBRECARGA DE CONSTRUCTORES >>>
// Un �nico fichero va a tener varias clases.
package poo;
import java.util.*;

public class A4_Java39UsoEmpleado_l {
public static void main(String[] args) {
		
		
		
		//ARRAY DE LA CLASE EMPLEADO
		Empleado1[] misEmpleados = new Empleado1[4];   
		misEmpleados[0] = new Empleado1("Paco G�mez", 85000, 1990, 12, 17);        // Se guardan los datos de los empleados en el Array.
		misEmpleados[1] = new Empleado1("Ana l�pez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado1("Mar�a Mart�n", 105000, 2002, 03, 15);
		
		misEmpleados[3] = new Empleado1("Antonio Fernandez");
		
		
		
		// BUCLE FOR MEJORADO (FOR EACH)
		for(Empleado1 e: misEmpleados) {                      // "e": es una variable que se crea en el bucle for mejorado.
			e.subeSueldo(5);
		}
		
		// BUCLE FOR MEJORADO 
		for(Empleado1 e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + "Sueldo: " + e.dameSueldo()
					+ "fecha de alta: " + e.dameFechaContrato());
		}
	}
}	




//COMIENZO CLASE EMPLEADO
class Empleado1{	
//--------------------------------------------------------------------------------------------------------
	//METODO CONSTRUCTOR 1
	public Empleado1(String nom, double sue, int agno, int mes, int dia){          // m�todo constructor que recibe par�metros y argumentos.
			
		nombre = nom;
		sueldo = sue;   
		GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);  // GregorianCalendar es en clase 
																				  // Luego calendario, objeto creado de tipo GregorianCalendar. 
																				  // NEW : con el operador new, estamos llamando al CONSTRUCTOR de la clase.
																				  // El objetivo de esto es construir una fecha.
																				  // Se pone "mes-1", pq GregorianCalendar empieza a contar desde cero. 
		altaContrato = calendario.getTime();         	// En la variable altaContrato, almacenamos lo que nos devuelve el m�todo getTime().	
	}		
	
	//M�TODO CONSTRUCTOR 2    //El 2do constructor no puede tener los mismos parametros del 1ro, ya que el compilador no sabr�a a q constructor llamar.
	public Empleado1(String nom) {
		this(nom, 30000, 2000, 01, 01);  //lo que hace el THIS, es darle valores por defecto a los empleados, de los cuales desconocemos la informaci�n.
	}			                         //This le env�a al 1er constructor, los par�metros por defecto, al 1er constructor.
										// par�metros:   nom, sue=30000, a�o, mes, d�a.
//------------------------------------------------------------------------------------------------------------------------------------	
	
	// m�todo GETTER
	public String dameNombre() {
		return nombre;
	}
	// m�todo GETTER
	public double dameSueldo() {
		return sueldo;
	}
	// m�todo GETTER
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	// m�todo SETTER  													  // se encargar� de "establecer" el valor de la variable sueldo. 
	public void subeSueldo(double porcentaje) {                           // este m�todo es "void", por lo tanto no devuelve nada.
		double aumento = sueldo*porcentaje/100;                           // aqu� se le dice al SETTER, que es lo que tiene que hacer.
		sueldo+=aumento;
	}
	
//------------------------------------------------------------------------------------------------------------------------------ 
	
	// VARIABLES DECLARADAS "CAMPOS DE CLASE"
	private String nombre;
	private double sueldo;
	private Date altaContrato;

//----------------------------------------------------------------------------------------------------------------------------
	
}


