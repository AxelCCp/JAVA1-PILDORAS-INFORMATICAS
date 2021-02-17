package Graficos;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.Document;

public class C5_88_CuadroDeTexto {
	public static void main(String[]args) {
		MarcoPrueba mimarco = new MarcoPrueba();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}

class MarcoPrueba extends JFrame{
	public MarcoPrueba(){
		setBounds(500,300,500,350);
		LaminaPrueba milamina = new LaminaPrueba();
		add(milamina);
		setVisible(true);
	}
}

class LaminaPrueba extends JPanel{
	public LaminaPrueba() {
		JTextField micampo = new JTextField(20);
		Escuchatexto el_evento = new Escuchatexto(); 
		Document miDoc = micampo.getDocument();                                             //el método getDocument(), devuelve un obj de tipo Document. por lo tanto creamos un obj instancia de tipo Document. 
		miDoc.addDocumentListener(el_evento);												    //ponemos el documento a la escucha.
		add(micampo);		
	}																					//clase receptora que gestiona los eventos
	
	private class Escuchatexto implements DocumentListener{ 
		public void changedUpdate(DocumentEvent e) {
		}
		public void insertUpdate(DocumentEvent e) {
			System.out.println("Haz insertado texto");
		}
		public void removeUpdate(DocumentEvent e) {
			System.out.println("Haz borrado texto");
		}
	}
}
