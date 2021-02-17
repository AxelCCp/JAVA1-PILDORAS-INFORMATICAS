package Java1;
import java.util.Scanner;	
// ENUM admite getters, setters y constructores.
public class C5_Java48Enum_UsoTalla {
	
	                                               			            //en las ENUM,  no se pueden crear objetos. (instancias de una clase enum, no se puede usar "new").
	enum Talla{ 
		
		MINI("S"), MEDIANO("M"), GRANDE("L"),MUY_GRANDE("XL");
		
		
		                                            		            // constructor de ENUM.... este está haciendo la función de un método setter,
																		//por lo tanto solo se necesita hacer un getter.
		private Talla(String abreviatura) {
			this.abreviatura = abreviatura;
		}
		
														            	//Getter
		private String getAbreviatura() {
			return abreviatura;
		}
																		//declara variable 
		private String abreviatura;	
	}
	
	public static void main(String[]args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escribe una talla (MINI, MEDIANO, GRANDE, MUY GRANDE): ");
		String entrada_datos = entrada.next().toUpperCase();  							// con toUppercase, lo que introduzca el usuario, se pasa a mayusculas.
		
		
		Talla la_Talla = Enum.valueOf(Talla.class, entrada_datos);       							//valueOf() devuelve el valor de la constante enumerada y se almacena ne la variable "la_Talla"
	
		System.out.println("La talla es: " + la_Talla);
		System.out.println("La abreviatura es: " + la_Talla.getAbreviatura());
		
		

			
	}
}

