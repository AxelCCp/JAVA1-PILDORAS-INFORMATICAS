package poo;
import javax.swing.JOptionPane;
public class A1_Java28UsoCoche {
	public static void main(String[] args) {
		
		
		A0_Java28Coche micoche = new A0_Java28Coche();	      //Se llama al constructor de la clase Coche.java
		
		
		System.out.println(micoche.dime_datos_generales());
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		System.out.println(micoche.dime_color());
		
		
		micoche.configura_asientos(JOptionPane.showInputDialog("¿Los asientos son de cuero? responder Sí o No"));
		System.out.println(micoche.dime_asientos());
		
		micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		System.out.println(micoche.dime_climatizador());
		
		System.out.println("El precio final del coche es: " + micoche.precio_coche());
		
		
	}
}
