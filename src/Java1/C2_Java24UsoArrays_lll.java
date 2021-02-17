package Java1;

//Bucle  FOR EACH, con matriz de tipo String y uso de Clase JOptionPane.
import javax.swing.JOptionPane;
public class C2_Java24UsoArrays_lll {
	
	public static void main(String[] args) {
		
		String [] paises = new String[8];   //declaración de matriz
		
		for(int i=0; i<8; i++) {														//bucle for
			paises[i] = JOptionPane.showInputDialog("Introduce país" + (i+1));	  
		}
		
		for(String elemento : paises) {												    //bucle for each
			System.out.println("País" + elemento);
		}
	}	
}
