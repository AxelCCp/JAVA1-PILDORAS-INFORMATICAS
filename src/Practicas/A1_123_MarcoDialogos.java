package Practicas;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Rectangle2D;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class A1_123_MarcoDialogos extends JFrame  {
	
	//CONSTRUCTOR DE MARCODIALOGOS
	public A1_123_MarcoDialogos() {
		
		//Construcci�n del marco 
		setTitle("Prueba de dialogos");
		setBounds(500,300,600,450);
		setVisible(true);
		//
		
		
		//Construcci�n de l�mina de tipo GridLayout
		JPanel laminaCuadricula = new JPanel();
		laminaCuadricula.setLayout(new GridLayout(2,3)); 									//establecemos un GridLaout de 2 filas 3 columnas.
		//
		
		//CONSTRUCCI�N DE LOS ARRAYS y CREAMOS LAS L�MINAS
		String[]primero= {"Mensaje","Confirmar","Opci�n","Entrada"};
		laminaTipo = new A2_123_LaminaBotones("Tipo",primero);
		laminaCuadricula.add(laminaTipo);
		
																							//Aqu� se abrevia un paso, con la creaci�n de array.
		laminaTipoMensajes = new A2_123_LaminaBotones("Tipo de Mensaje", new String[] {"ERROR_MESSAGE","INFORMATION MESSAGE","WARNING MESSAGE","QUESTION MESSAGE","PLAIN MESSAGE"});
		laminaCuadricula.add(laminaTipoMensajes);
		
		laminaMensaje = new A2_123_LaminaBotones("Mensaje",new String[] {"Cadena","�cono","Componente","Otros","Object[]"});
		laminaCuadricula.add(laminaMensaje);
		
		laminaConfirmar = new A2_123_LaminaBotones("Confirmar",new String[] {"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"});
		laminaCuadricula.add(laminaConfirmar);
		
		laminaOpcion = new A2_123_LaminaBotones("Opci�n", new String[] {"String[]","Icon[]","Object[]"});
		laminaCuadricula.add(laminaOpcion);
		
		laminaEntrada = new A2_123_LaminaBotones("Entrada", new String[] {"Componente Texto", "Combo"});
		laminaCuadricula.add(laminaEntrada);
		
		
		//LE DECIMOS AL MARCO QUE TENGA UNA DISPOSICI�N DE TIPO BORDERLAYOUT Y QUE EST� EN EL CENTRO CENTRO 
		setLayout(new BorderLayout());
		add(laminaCuadricula,BorderLayout.CENTER);
		
		//CONSTRUIMOS LA L�MINA INFERIOR DONDE VA EL BOT�N Y LO PONEMOS A LA ESCUCHA. AGREGAMOS LA L�MINA MOSTRAR EN EL SUR.
		JPanel laminaMostrar = new JPanel();
		JButton botonMostrar = new JButton("Mostrar");
		
		//DOTAMOS DE FUNCIONALIDAD AL BOT�NMOSTRAR, E INSTANCIAMOS LA CLASE ACCI�NMOSTRAR 
		botonMostrar.addActionListener(new AccionMostrar());
		
		laminaMostrar.add(botonMostrar);
		add(laminaMostrar,BorderLayout.SOUTH);
	}
	
	
	//PROPORCIONA EL MENSAJE --- CREAMOS UN M�TODO QUE NOS DEVUELVA EL MENSAJE  
	public Object dameMensaje() {
		//ALMACENAMOS EN UNA VARIBLE, LA VARIABLE SELECCIONADA EN EL TERCER BOX (LA LAMINAMENSAJE -- ""MENSAJE")
		String  s = laminaMensaje.dameSeleccion();
		if(s.equals("Cadena")) {
			return cadenaMensaje;    																			//cadenaMensaje es la variable String declarada m�s abajo, que contiene la cadena "Mensaje",
		}else if(s.equals("Icono")) {
			return iconoMensaje;
		}else if(s.equals("Componente")) {
			return componenteMensaje;
		}else if(s.equals("Otros")) {
			return objetoMensaje;
		}else if(s.contentEquals("Object[]")) {
			return new Object[]{cadenaMensaje,iconoMensaje,componenteMensaje,objetoMensaje};
		}else {
			return null; 																					  //se pone else null, para quitar el error que da el m�todo.
		}
	}
	
	
	
	//DEVUELVE TIPO �CONO Y TAMBN N� DE BOTONES EN "CONFIRMAR" --- CREAMOS M�TODO   //le damos un argumento de tipo LaminaBotones
	public int dameTipo(A2_123_LaminaBotones lamina) {
		String s = lamina.dameSeleccion();    //almacenamos en "s", la opci�n elegida por el usuario en cualquier l�mina.
		if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")) {
			return 0;
		}else if(s.equals("INFORMATION MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")) {
			return 1;
		}else if(s.equals("WARNING MESSAGE") || s.equals("OK_CANCEL_OPTION")) {
			return 2;
		}else if(s.equals("QUESTION MESSAGE")) {
			return 3;
		}else if(s.equals("PLAIN MESSAGE") || s.equals("DEFAULT_OPTION")) {
			return -1;
		}else {
			return 0;  									//agregamos esta para que el m�todo no d� error.
		}
	}
	
	
	
	//DA OPCIONES A LA L�MINA OPCI�N
	public Object[] dameOpciones(A2_123_LaminaBotones lamina) {
		
		String s = lamina.dameSeleccion();
		
		if(s.equals("String[]")) {
			return new String[]{"Amarillo","Azul","Rojo"};
		
		}else if(s.equals("Icon[]")){
			return new Object[] {new ImageIcon("C:/Users/Fanta/OneDrive/1.-DOCUMENTOS/eclipse-workspace/JavaPildorasInformaticas/src/Graficos/application_firefox.gif")};
			
		}else if(s.equals("Object[]")){
			return new Object[]{cadenaMensaje,iconoMensaje,componenteMensaje,objetoMensaje};
		
		}else { 
			return null;
		}
	}
	
	
	//CLASE INTERNA ACCIONMOSTRAR
	private class AccionMostrar implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			//System.out.println(laminaTipo.dameSeleccion());	
			
			if(laminaTipo.dameSeleccion().equals("Mensaje")) {
				JOptionPane.showMessageDialog(A1_123_MarcoDialogos.this,dameMensaje(),"T�tulo",dameTipo(laminaTipoMensajes));
				
			}else if(laminaTipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(A1_123_MarcoDialogos.this,dameMensaje(),"T�tulo",dameTipo(laminaConfirmar),dameTipo(laminaTipoMensajes));
			
			}else if(laminaTipo.dameSeleccion().equals("Entrada")){
				
				if(laminaEntrada.dameSeleccion().equals("Campo de Texto")){
					JOptionPane.showInputDialog(A1_123_MarcoDialogos.this,dameMensaje(),"T�tulo",dameTipo(laminaTipoMensajes));
				}else {
					JOptionPane.showInputDialog(A1_123_MarcoDialogos.this,dameMensaje(),"T�tulo",dameTipo(laminaTipoMensajes),null,new String[] {"Amarillo","Azul","Rojo"},"Azul");
				}
			
			}else if(laminaTipo.dameSeleccion().equals("Opci�n")){
				JOptionPane.showOptionDialog(A1_123_MarcoDialogos.this,dameMensaje(),"T�tulo",0,dameTipo(laminaTipoMensajes),null,dameOpciones(laminaOpcion),null);
			}
		}		
	}
	
	
	
	//DECLARAMOS LAS LAMINAS
	private A2_123_LaminaBotones laminaTipo;
	private A2_123_LaminaBotones laminaTipoMensajes;
	private A2_123_LaminaBotones laminaMensaje;
	private A2_123_LaminaBotones laminaConfirmar;
	private A2_123_LaminaBotones laminaOpcion;
	private A2_123_LaminaBotones laminaEntrada;
	
	//	
	private String cadenaMensaje = "Mensaje";
	private Icon iconoMensaje = new ImageIcon("C:/Users/Fanta/OneDrive/1.-DOCUMENTOS/eclipse-workspace/JavaPildorasInformaticas/src/Graficos/application_firefox.gif");
	private Object objetoMensaje = new Date(); 														//variable fecha de tipo objeto.
	private Component componenteMensaje = new LaminaEjemplo();  									//hace referencia a la lamina que nos devuelve el JOptionPane.
}


//CONSTRUIMOS UNA CLASE QUE SEA CAPAZ DE CONSTRUIR UN L�MINA DE COLOR AMARILLO
class LaminaEjemplo extends JPanel{
	
	//SOBREESCRIBIMOS EL M�TODO PAINTCOMPONENT(LLEVA POR PARAMETRO UN OBJ DE TIPO GRAPHICS 'G')
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   																   //llamamos al constructor de la clase padre.
		Graphics2D g2 = (Graphics2D)g;															   //hacemos un casting
		Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(), getHeight());  			   //creamos el rect�ngulo. (X,Y,alto,ancho) 
		g2.setPaint(Color.YELLOW);																   //elegimos el color del rect�ngulo.
		g2.fill(rectangulo);																	   //rellenamos el rect�ngulo con amarillo.
	}
}


