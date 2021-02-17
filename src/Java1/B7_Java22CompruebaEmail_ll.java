package Java1;

import javax.swing.JOptionPane;
public class B7_Java22CompruebaEmail_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arroba = 0;
		boolean punto = false;
		
		String mail = JOptionPane.showInputDialog("Introduce mail");
		
																						// se genera un bucle for
		for(int i=0; i<mail.length(); i++) {
			
			if(mail.charAt(i) == '@') {
					arroba++;		
			}
			if(mail.charAt(i) == '.') {
				punto = true;
			}
		}
			
		if(arroba == 1 && punto == true) {
			System.out.println("Es correcto");
		}
		else {
			System.out.println("No es correcto");
		}
	}
}