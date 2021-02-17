package Practicas;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;	
import javax.swing.ButtonModel;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class A2_123_LaminaBotones extends JPanel {
	
	//CONSTRUCTOR DE LAMINA
	public A2_123_LaminaBotones(String titulo, String[]opciones) {
		
		//CREAMOS LOS BORDES PARA LAS CAJAS:
		setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),titulo));						 //setBorder(lo hereda JPanel) // createTitledBorder(es un método Static de la clase BorderFactory) // Create EtchedBorder(establecemos un borde)
		setLayout(new BoxLayout(this,BoxLayout.Y_AXIS)); 															 //indicamos a la lámina, que es de tipo BoxLayout. // el constructor de BoxLayout, nos pide el contenedor padre,en este caso la clase,por lo tanto "this". // el segundo argumento es sobre la distribución de los elementos. Y-AXIS le da una distribución vertical y de arriba a abajo. 
		
		
		//CREAMOS UN GRUPO DE BOTONES
		grupo = new ButtonGroup();  
		
		//BUBLE FOR PARA RECORRER EL ARRAY "opciones"
		for(int i=0;i<opciones.length;i++) {
			
			//creamos los RadioButton
			JRadioButton bot = new JRadioButton(opciones[i]);                                                         //ponemos (opciones[i]) para que lea las opciones disponibles en el array. 
			
			//DOTAMOS A CADA UNO DE LOS BOTONES, CON UNA ACCIÓN QUE VA A DESENCADENAR
			bot.setActionCommand(opciones[i]);  																	  //setAccionCommand() : metodo de la clase JRadioButton, que lo hereda de la clase AbstractButton  // Este método establece la acción de comando para este botón. pide un String
			
			//agregamos los radioButtons y los radioButtons al grupo
			add(bot);
			grupo.add(bot);
			
			//para que aparezca la 1ra de las opciones seleccionadas, se pone: 
			bot.setSelected(i==0);	
		}   
	}
	
	
	//CONSTRUIMOS UN MÉTODO QUE DOTE DE FUNCIONALIDAD A LOS BOTONES, QUE SEA CAPAZ DE DEVOLVER UN STRING
	public String dameSeleccion() {
		ButtonModel miBoton = grupo.getSelection();																	 //almacenamos el JRadioButton que tenemos seleccionado. // getSelection(): es un método de la clase ButtonGroup y es de tipo ButtonModel. nos devuelve la opción que tenemos seleccionada en el "grupo".
		String s = miBoton.getActionCommand();																		 // este método nos devuelve el String del botón correspondiente a una acción. Pertenece a la interfaz ButtonModel.
		return s;
	}
	
	//DECLARAMOS "GRUPO" FUERA DE LOS MÉTODOS 
	private ButtonGroup grupo;
}
