package Java1;

import javax.swing.JOptionPane; 
public class B6_Java21CompruebaEmail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean arroba =false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
		//Se genera un bucle for para buscar el arroba dentro de la dirección de correo ingresada.  
		
		for(int i = 0; i < mail.length(); i++) {                 // i < mail.length() =  mientras la (i) sea menor a la longitud del mail.
			                                                     // método length devuelve lalongitud de una cadena de caracteres.
			
			if(mail.charAt(i) == '@') {
					arroba = true;
			}
		}

		if(arroba == true) {
			System.out.println("Es correcto");
		} 
		else 
			System.out.println("No es correcto");
	}
}
