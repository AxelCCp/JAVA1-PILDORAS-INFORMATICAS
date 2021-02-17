package poo;
               //la interfaz jefes tambien hereda de la interfaz trabajadores, ahora, por lo tanto esto obliga a la clase Jefatura, que está en UsoEmpleado, a implementar el método de la interface trabajadores. 
public interface A9_Java50_Interface_Jefes extends B0_Java51_Interface_Trabajadores {
	
	//los métodos de una interfaz son public o abstract, si no los declaras, java los considera por defecto
	
	// es un método vacío, no se implementa.
	// una interfaz, al ser implementada por una clase, obliga a esa clase a usar sus métodos.
	
	//esto conecta con la clase jefatura que estpa en    <<A7_java42...>>
	String tomar_decisiones(String decision);
	
	

}
