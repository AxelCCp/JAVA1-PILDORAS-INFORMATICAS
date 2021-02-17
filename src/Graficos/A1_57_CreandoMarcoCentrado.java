package Graficos;
import javax.swing.*;
import java.awt.Toolkit;
import java.awt.*;




public class A1_57_CreandoMarcoCentrado {
	public static void main(String[]args) {
		
		MarcoCentrado miMarco = new MarcoCentrado();                       //creamos finalmente, un obj, una instancia de la clase MarcoCentrado
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);                                          //hacemos que el marco sea visible.
		
	}
}


class MarcoCentrado extends JFrame{
	
	public MarcoCentrado() {
		
		Toolkit miPantalla = Toolkit.getDefaultToolkit();                         //creamos una variable objeto miPantalla. getDefaultToolkit(): metodo static, por lo tanto hay que poner el nombre de la clase por delante, para acceder al método. devuelve un obj de tipo toolkit. devuelve el sistema nativo donde se estáejecutando el sistema de ventanas, donde se está ejecutando el programa.
		Dimension tamanoPantalla  = miPantalla.getScreenSize();                   //getScreenSize(): devuelve un obj abstract de tipo dimensión. de la clase Dimension.proporciona el tamaño de la ventana.
																		    	  //creamos un obj de tipo Dimension, al cual llamamos tamanoPantalla. despues del = ,le ponemos miPanalla, pq ahí es donde hemos almacenado nuestro sistema nativo de ventanas. osea el obj de tipo toolkit. y luego el método. Con esto, lo que hacemos es almacenar dentro de tamañoPantalla, la resolución de miPantalla.  
		
		int alturaPantalla = tamanoPantalla.height;                               //height: es un campo de clase de la clase dimensión, que sirve para obtener la altura de la pantalla. 
		int anchoPantalla = tamanoPantalla.width;                                 //width: para el ancho de la pantalla.
		
		setSize(anchoPantalla/2,alturaPantalla/2);                                //para crear un marco que sea la mitad de la pantalla
	 
		setLocation(anchoPantalla/4,alturaPantalla/4);							  //para colocar el marco en el centro.
	
		setTitle("Marco Centrado");
		
		
		Image miIcono = miPantalla.getImage("src/Graficos/icono.gif");            //cambiamos el ícono del marco. getImage() es de la clase Toolkit. 
		setIconImage(miIcono);                                                    //establecemos el ícono.
	
		
	}
	
}
