package poo;

import javax.swing.Timer;    //importa la clase Timer del paquete swing. (ojo...hay otras clases timer, que on de otros paquetes y que hacen otras cosas).

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;


public class B1_Java52_PruebaTemporizador {
	public static void main(String[]args) {
		
		
		DameLaHora oyente = new DameLaHora(); //se  usa el constructor por defecto, sin parámetros, ya que la clase dameLaHora, no tiene constructor.
		
		//crea temporizador
		                                 		//con () se invoca al constructor de la clase, el cual pide 2 parámetros
												//esto va a desencadenar un mensaje en consola con la hora cada cierto momento.
					//cada 5 segundos ...(5000,... se va a ejecutar la acción
					//"oyente"... tiene que ser un objeto de tipo interfaz y ActionListener
		Timer miTemporizador = new Timer(5000, oyente);
		
		//con esto hacemos que empiece todo.
		miTemporizador.start();
		
		//necesitamos una ventana para que se mantenga el programa dando la hora, pq sino, se dará una sola vez. 
		JOptionPane.showMessageDialog(null, "Pulsa aceptar para detener!");
		
		//instrucción
		System.exit(0);  //esta instrucción hace que se detenga la ejecución del programa.
		
	}
	
}

                 //para implementar la interfaz ActionListener, hay q importar el paquete java.awt.event.*;
class DameLaHora implements ActionListener{
	
	//Aquí tenemos que implementar el metodo obligatorio de la iterfaz 
	//actionPerformed(ActionEvent e) .....hay que pasarle un parámetro de tipo ActionEvent que se llama "e". A la "e" se le puede llamar de cualquier nombre en todo caso.
	
	public void actionPerformed(ActionEvent e) {
		
		//hay q decirle al método que salga la hora cada 5 segundos. para esto hay que usar la clase "Date".
		//tenemos que importar el paquete java.util.  ... pq la clase Date, no es del paquete por defecto.
		
		Date Ahora = new Date();  //dentro de la variable objeto se almacena la hora que tenemos actualmente, cuando se llama a esa función. o sea, cada 5 segundos corre el programa, grabando la hora en "Ahora".
		System.out.println("te pongo la hora cada 5 segundos: " + Ahora);
		
		
		//imprimir sonido con la clase abstracta Toolkit
		//con esto podemos acceder a los recursos de sonido del pc
		
		Toolkit.getDefaultToolkit().beep();
		
		
	}
	
}
