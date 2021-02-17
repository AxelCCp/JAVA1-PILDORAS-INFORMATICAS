package Graficos;

import java.awt.Dimension;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class D6_98_JSpinner {
	public static void main(String[]args) {
		MarcoJSpinner mimarco = new MarcoJSpinner();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class MarcoJSpinner extends JFrame{
	public MarcoJSpinner() {
		setBounds(500,350,550,350);
		setVisible(true);
		LaminaJSpinner xxx = new LaminaJSpinner();
		add(xxx);
	}
}


class LaminaJSpinner extends JPanel{
	public LaminaJSpinner() {
		//String [] lista = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"}; 
		//String [] lista = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames(); //con esto aalmacenamos en el array, todas las fuentes o tipos de letra que hay en el pc. 
		//JSpinner control = new JSpinner(new SpinnerListModel(lista));
		
		
		
		//JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1));                           //parte en 5,desde el 0 al 10, y de 1 en 1.
		JSpinner control = new JSpinner(new SpinnerNumberModel(5,0,10,1) {//clase interna anónima//
			
			public Object getNextValue() {
				return super.getPreviousValue();
			}
			public Object getPreviousValue() {
				return super.getNextValue();
			}
		});
		Dimension d = new Dimension(200,20);
		control.setPreferredSize(d);
		add(control);
	}
	
	
	
	
	/*//debe heredar de SpinnerNumberModel, para poder usar los métodos de esta clase. pq queremos crear un Spinner de tipo numero, pero que los botones funciones alrevés.
	private class ModeloJSpinner extends SpinnerNumberModel{
		public ModeloJSpinner() {
			super(5,0,10,1);																	//llamamos al constructor de la clase padre y le pasamos estos parámetros.
		}                													                   //con estos métodos hacemos que los botones funcionen alrevés
		public Object getNextValue() {
			return super.getPreviousValue();
		}
		public Object getPreviousValue() {
			return super.getNextValue();
		}
	}
	*/
}
