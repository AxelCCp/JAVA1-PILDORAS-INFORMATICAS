// con sobrecarga de constructores
// Un único fichero con varias clases.
package poo;
import java.util.*;

public class A7_Java42UsoEmpleado_ll {
public static void main(String[] args) {
		
		
		Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);    				  // Se llama al constructor de la clase Jefatura y se le pasan los parámetros.
		jefe_RRHH.estableceIncentivo(2570);												  //jefe_RRHH: es obj de la sub clase que se construye y es instanciado. para luego ser almacenado directamente en el ARRAY. 
		
	
		//ARRAY DE LA CLASE EMPLEADO
		Empleado2[] misEmpleados = new Empleado2[6];   
		misEmpleados[0] = new Empleado2("Paco Gómez", 85000, 1990, 12, 17);      		  // Se guardan los datos de los empleados en el Array.
		misEmpleados[1] = new Empleado2("Ana lópez", 95000, 1995, 06, 02);
		misEmpleados[2] = new Empleado2("María Martín", 105000, 2002, 03, 15);
		misEmpleados[3] = new Empleado2("Antonio Fernandez", 47500, 2009, 11, 9);
		misEmpleados[4] = jefe_RRHH;                                                      // Polimorfismo en acción. principio de sustitución.      //cuando escribimos "misEmpleados[4]", el programa espera que almacenemos en el ARRAY, un obj de tipo "Empleado2". Sin embargo estamo almacenando un OBJ de tipo "Jefatura". Por lo tanto podemos usar un OBJ de la "subclase", cuando el programa espera un OBJ de la "SuperClase".
		misEmpleados[5] = new Jefatura("María", 95000, 1999, 11, 9);   
		// El ARRAY "misEmpleados" es de tipo "Empleado2" y acepta tanto "Empleado's" como OBJs de la subclase "Jefatura"  ejem.: "jefe_RRHH".                                                                             
		
		
		Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];  //Clase n°44_de esta manera se realiza un << casting >>, para convertir un objeto de un tipo, en otro. 
		jefa_Finanzas.estableceIncentivo(5000);   //con el casting, ahora se puede usar el método "estableceIncentivo".
		
		//Aquí se llama al método de la interface que fue implementado en la clase <<Jefatura>>  
		System.out.println(jefa_Finanzas.tomar_decisiones("Dar más días de vacasiones a los empleados"));
		
		
		//Aqui se llama al método establece_bonus de la interfaz trabajadores
		
		System.out.println("El jefe " + jefa_Finanzas.dameNombre() 
							+ " tiene un bonus de "+ jefa_Finanzas.establece_bonus(500));  // se le da un bonus de 500.
		
		System.out.println(misEmpleados[3].dameNombre() + " tiene un bonus de " + misEmpleados[3].establece_bonus(200));
		
		
		//aquí  se usa el principio de sustitución. esto se puede hacer gracias a q un jefe es un director comercial.   
		Empleado2 director_comercial = new Jefatura ("Sandra", 85000, 2012, 05, 05);
		
		//debido a que la clase empleado2 implementa a la interfaz comparable, podemos hacer lo siguiente, usando el mismo principio de sustitución anterior:
		//como la clase empleado implementa la interfaz comparable, podemos crear una instancia perteneciente a la interfaz, pero luego a la hora de instanciarla con el "NEW", le decimos que es de tipo Empleado2.
		Comparable ejemplo = new Empleado2("Elizabeth", 95000, 2011, 06, 07);
		
		//instansOf... con esto puedes comprobar si una instancia pertenece a una clase o no.
		
		if(director_comercial instanceof Empleado2) {
			System.out.println("Es de tipo jefatura.");  //la clase jefatura hereda de empleado.
		}
		
		//Aquí también se verifica si  ejemplo pertenece a comparable
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz comparable");		
		}
		
		
		
		// BUCLE FOR MEJORADO (FOR EACH).....   para subir el sueldo. 
		for(Empleado2 e: misEmpleados) {                               					  // "e": es una variable que se crea en el bucle for mejorado.
			e.subeSueldo(5);
		}
		
			Arrays.sort(misEmpleados);   //esto es para ordenar cómo aparecen los empleados en la consola. Este método sort() nos obliga a que el "tipo" a ordenar, implemente la Interfaz comparable.  
		// BUCLE FOR MEJORADO.....   para obtener nombre, sueldo y la fecha de contrato.
		for(Empleado2 e: misEmpleados) {
			System.out.println("Nombre: " + e.dameNombre() + "Sueldo: " + e.dameSueldo()
					+ "fecha de alta: " + e.dameFechaContrato());
		}
	}
}	

//SE CREA LA SUBCLASE JEFE***
//COMIENZO CLASE EMPLEADO              //para usar el método sort(), de Arrays, se implementa la interfaz "Comparable"
class Empleado2 implements Comparable, B0_Java51_Interface_Trabajadores{	

			//hay que aplicarle el bonus a los empleados. implementando la interface Trabajadores. Esto se hace igual a como se implementó en la clase jefatura. 
	
	//--------------------------------------------------------------------------------------------------------
	//METODO CONSTRUCTOR 1
	public Empleado2(String nom, double sue, int agno, int mes, int dia){          			// método constructor que recibe parámetros y argumentos.
			
		nombre = nom;
		sueldo = sue;   
		GregorianCalendar calendario = new  GregorianCalendar(agno, mes-1, dia);  			// GregorianCalendar es una clase 																		  
		altaContrato = calendario.getTime();         										// En la variable altaContrato, almacenamos lo que nos devuelve el método getTime().	
	}		
	
	
	//MÉTODO CONSTRUCTOR 2    
	public Empleado2(String nom) {
		this(nom, 30000, 2000, 01, 01);  													//lo que hace el THIS, es darle valores por defecto a los empleados, de los cuales desconocemos la información.
	}			                         													//This le envía al 1er constructor, los parámetros por defecto, al 1er constructor.
			
	
	//metodo de la interface trabajadores
	public double establece_bonus(double gratificacion) {
		return B0_Java51_Interface_Trabajadores.bonus_base + gratificacion;
		
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
	public void subeSueldo(double porcentaje) {                           
		double aumento = sueldo*porcentaje/100;                           // aquí se le dice al SETTER, que es lo que tiene que hacer.
		sueldo+=aumento;
	}
	
//------------------------------------------------------------------------------------------------------------------------------ 
	
	//implementamos el método compareTo(), que debe ser implementado obligariamente, tras implementar la interfaz "Comparable" en empleado2
	//compareTo() recive cm parametro un argumeto de tipo Object.
	
	public int compareTo(Object miObjeto) {
		
		//Aquí dentro del método, hay que hacer un casting
		Empleado2 otroEmpleado = (Empleado2) miObjeto;   // con esto se va a poder comprar el sueldo de los empleados, para así dspués ordenarlos por sueldo en la consola.
		
		// con -1,1 y 0, se van ordenando a los empleados por el <<sueldo>>. se puede cambiar sueldo en el código, para ordenar con otro campo de clase(las variables declaradas).
		if(this.sueldo<otroEmpleado.sueldo){
			return -1;  //-1 es lo que tiene que devolver el método compareTo()
		}
		
		if(this.sueldo>otroEmpleado.sueldo) {
			return 1;
		}
		
		return 0;  //se pone 0, por si es que hay dos trabajadores con el mismo sueldo.
	}
	
//------------------------------------------------------------
	// VARIABLES DECLARADAS "CAMPOS DE CLASE"
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;

//----------------------------------------------------------------------------------------------------------------------------
	

	

}

//SE CREA OTRA SUBCLASE
//COMIENZO DE LA CLASE JEFATURA
      // Jefatura hereda de empleado2 e implementa la interfaz Jefes
class Jefatura extends Empleado2 implements A9_Java50_Interface_Jefes {                                                           //clase jefatura hereda de clase Empleado2.
	
	//CONSTRUCTOR 1 de clase Jefatura
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);  												    //con super(), se llama al constructor de clase Empleado2, y se le pasan los parámetros.
	}
	
	// Este es el método que obliga usar la interfaz A9_Java50_Interface_Jefes ...... (jefes)
	public String tomar_decisiones(String decision) {
		return "Un miembro de la dirección, ha tomado la decisión "  + decision; 
	}
	
	public double estrablece_bonus(double gratificacion) {
		
		double prima = 2000;
		return B0_Java51_Interface_Trabajadores.bonus_base + gratificacion + prima;
	}
	
	//Método SETTER, 																		//que se capaz de establecer un incentivo para los objetos de tipo jefe.
	public void estableceIncentivo(double b) {  											//a la "b", después se le asigna un valor para el incentivo.
		incentivo=b;
	}
	
	//Método GETTER,
	public double dameSueldo() {                                             //queremos q se almacene en << sueldoJefe >> , lo que devuelve el método << dameSueldo >> de la clase Padre Empleado2. y para esto se pone la instrucción "SUPER".  
		double sueldoJefe = super.dameSueldo();              			                    // se declara una variable dentro del método.
		return sueldoJefe + incentivo;	  												    //con return se devuelve el sueldo del jefemás el incentivo.	
	}
	
	
	//variable de tipo double 
	private double incentivo;
}


//-------------------------------------------------------------------------------------------------------------------------------

/*
final class Director extends Jefatura{           //clase director hereda de la clase jefatura. Y con la "final" se detiene la cadena de la herencia.
	
	//CONSTRUCTOR 1 de clase Director
	public Director(String nom, double sue, int agno, int mes, int dia) {
		
		super(nom, sue, agno, mes, dia);
	}
}
*/


