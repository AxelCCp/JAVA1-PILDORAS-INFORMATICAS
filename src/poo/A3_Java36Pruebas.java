package poo;

public class A3_Java36Pruebas {
	
	public static void main(String[] args) {
	
	//SE LLAMA AL CONSTRUCTOR                           //con esto hay que empezar a instanciar nuestra clase empleados. O sea, crearnos objetos de la clase empleados.	
		Empleados trabajador1 = new Empleados("Paco");
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("María");
		
		trabajador1.cambiaSeccion("RRHH");
		
		System.out.println(trabajador1.devuelveDatos() + "\n" + trabajador2.devuelveDatos() + 
				   "\n" +  trabajador3.devuelveDatos() + "\n" + trabajador4.devuelveDatos());

		
		System.out.println(Empleados.dameIdSiguiete());     //Esta es la manera de usar un método Static... Clase.método();
	}
}

//-------------------------------------------------------------------------------------------------------------------------------------

class Empleados{
	
	// CONSTRUCTOR:
	public Empleados(String nom){
		
		nombre = nom;                                   //  este es el estado inicial que van a tener nuestras instancias de empleados. 
		seccion ="Administración";						//...ya que todos tendrán un nombre y pertenecerán a la sección de administración.
		id = 1;
		id = IdSiguiente;
		IdSiguiente++;
	}
//-----------------------------------------------------------------------------------------------------------------------------------
	
	// SETTER
	public void cambiaSeccion(String seccion) { 
		this.seccion = seccion;                         // seccion 1ro, es referente al campo de clase, el 2do se refiere al argumento.
	}
	
	// GETTER
	public String devuelveDatos() {
		return "El nombre es: " + nombre + ", la seccion es " + seccion + " y el id es igual a " + id;
	}
	
	// GETTER
	public static String dameIdSiguiete() {
		return "El Id siguiente es: " + IdSiguiente;
	}
//--------------------------------------------------------------------------------------------------------------------------------------
	
	// CAMPOS DE EJEMPLARES ...variables declaradas:
	private final String nombre;      
	private String seccion;
	private int id;
	private static int IdSiguiente=1;
}
