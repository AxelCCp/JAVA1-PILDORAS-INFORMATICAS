package Graficos;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Spring;
import javax.swing.SpringLayout;

public class E7_116_DisposicionDeMuelle {
	public static void main(String[]args) {
		MarcoMuelle marco = new MarcoMuelle();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
}

class MarcoMuelle extends JFrame{
	public MarcoMuelle() {
		setBounds(300,400,1000,350);
		setVisible(true);
		LaminaMuelle lamina = new LaminaMuelle();
		add(lamina);
	}
}


class LaminaMuelle extends JPanel{
	public LaminaMuelle() {
		JButton boton1 = new JButton("Boton 1");
		JButton boton2 = new JButton("Boton 2");	
		JButton boton3 = new JButton("Boton 3");
		
		SpringLayout miLayout = new SpringLayout();
		setLayout(miLayout);                          								          //con esto le decimos a la clase LaminaMuelle, que la disposicion sea de tipo SpringLayout.
		
		add(boton1);
		add(boton2);
		add(boton3);
		
		//Construcción de Muelle rígido:
		Spring muelleRigido = Spring.constant(10);
		
		//Construccion de Muelle flexible:
		Spring muelle = Spring.constant(0, 10, 100);   								          //los muelles son de la clase Spring. usamos el método static, que pide 3 parámetros de elasticidad (valor minimo eslasticidad,valor preferido, valor máximo).  
		                                                                                      //para colocar el muelle entre los botones, hay que usar el método putConstraint()
		miLayout.putConstraint(SpringLayout.WEST, boton1, muelle, SpringLayout.WEST, this);   //(donde comienza el muelle,,,hace referencia al primer componente,,,muelle,,, ,,,hace referencia al borde del contenedor)
		miLayout.putConstraint(SpringLayout.WEST, boton2, muelleRigido, SpringLayout.EAST, boton1);
		miLayout.putConstraint(SpringLayout.WEST, boton3, muelleRigido, SpringLayout.EAST, boton2);
		miLayout.putConstraint(SpringLayout.EAST, this, muelle, SpringLayout.EAST, boton3);
	
	}
}
