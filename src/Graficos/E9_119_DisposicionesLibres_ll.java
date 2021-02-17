package Graficos;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class E9_119_DisposicionesLibres_ll {
	public static void main(String[]args) {
		MarcoLibre2 marco = new MarcoLibre2();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
	}
}

class MarcoLibre2 extends JFrame{
	public MarcoLibre2() {
		setBounds(200,100,500,500);
		setVisible(true);
		LaminaLibre lamina = new LaminaLibre();
		add(lamina);
	}
}

class LaminaLibre2 extends JPanel{
	public LaminaLibre2() {
		setLayout(new EnColumnas());
		
		JLabel nombre = new JLabel("Nombre");
		JLabel apellido = new JLabel("Apellido");
		JLabel edad = new JLabel("Edad");
		
		JTextField cuadroNombre = new JTextField();
		JTextField cuadroApellido = new JTextField();
		JTextField cuadroEdad = new JTextField();
	
		add(nombre);
		add(cuadroNombre);
		
		add(apellido);
		add(cuadroApellido);
		
		add(edad);
		add(cuadroEdad);
	}
}

//Clase para que ponga los componentes a la izuierda y por parejas
class EnColumnas implements LayoutManager{

	@Override
	public void addLayoutComponent(String arg0, Component arg1) {
		// TODO Auto-generated method stub
		
	}

	//nos permite especificar un contenedor donde vayamos agregando los elementos
	public void layoutContainer(Container miContenedor) {
		int contador=0;
		int n = miContenedor.getComponentCount();						     //esto nos sirve para saber cuantos componentes hemos agregado a nuestro contenedor.
		for (int i=0;i<n;i++) {
			contador++;														 //con contador sabremos que elemento estamos evaluando.
			Component c = miContenedor.getComponent(i);  				     //los componentes los almacenamos en c
			c.setBounds(x, y, 100, 20);
			x+=100;
			
			if(contador%2==0) {
				x=20;
				y+=40;
			}
		}
	}

	@Override
	public Dimension minimumLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension preferredLayoutSize(Container parent) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeLayoutComponent(Component comp) {
		// TODO Auto-generated method stub
		
	}
	//se inician en 20, ya que queremos que el 1er componente que agreguemoe, aparezca en (20,20).
	int x=20;
	int y=20;
			
}










