package Java1;

import javax.swing.JOptionPane;
public class B1_Java18AccesoAplicacionWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "Axel";
		String pass = "";
		
		while (clave.equals(pass) == false) {
			pass = JOptionPane.showInputDialog("Introduce la contrase�a, por favor");
			
			if (clave.equals(pass) == false) {
				System.out.println("La contrase�a es incorrecta");
			}
		}		
		System.out.println("Contrase�a correcta. Acceso permitido");
	}
}
