package Java1;

import javax.swing.JOptionPane;
public class B1_Java18AccesoAplicacionWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Axel";
		String pass = "";
		
		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce la contraseña, por favor");
			
			if (clave.equals(pass) == false) {
				System.out.println("La contraseña es incorrecta");
			}
		}		
		System.out.println("Contraseña correcta. Acceso permitido");
	}
}
