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
		
		//Construcción del marco 
		setTitle("Prueba de dialogos");
		setBounds(500,300,600,450);
		setVisible(true);
		//
		
		
		//Construcción de lámina de tipo GridLayout
		JPanel laminaCuadricula = new JPanel();
		laminaCuadricula.setLayout(new GridLayout(2,3)); 									//establecemos un GridLaout de 2 filas 3 columnas.
		//
		
		//CONSTRUCCIÓN DE LOS ARRAYS y CREAMOS LAS LÁMINAS
		String[]primero= {"Mensaje","Confirmar","Opción","Entrada"};
		laminaTipo = new A2_123_LaminaBotones("Tipo",primero);
		laminaCuadricula.add(laminaTipo);
		
																							//Aquí se abrevia un paso, con la creación de array.
		laminaTipoMensajes = new A2_123_LaminaBotones("Tipo de Mensaje", new String[] {"ERROR_MESSAGE","INFORMATION MESSAGE","WARNING MESSAGE","QUESTION MESSAGE","PLAIN MESSAGE"});
		laminaCuadricula.add(laminaTipoMensajes);
		
		laminaMensaje = new A2_123_LaminaBotones("Mensaje",new String[] {"Cadena","Ícono","Componente","Otros","Object[]"});
		laminaCuadricula.add(laminaMensaje);
		
		laminaConfirmar = new A2_123_LaminaBotones("Confirmar",new String[] {"DEFAULT_OPTION","YES_NO_OPTION","YES_NO_CANCEL_OPTION","OK_CANCEL_OPTION"});
		laminaCuadricula.add(laminaConfirmar);
		
		laminaOpcion = new A2_123_LaminaBotones("Opción", new String[] {"String[]","Icon[]","Object[]"});
		laminaCuadricula.add(laminaOpcion);
		
		laminaEntrada = new A2_123_LaminaBotones("Entrada", new String[] {"Componente Texto", "Combo"});
		laminaCuadricula.add(laminaEntrada);
		
		
		//LE DECIMOS AL MARCO QUE TENGA UNA DISPOSICIÓN DE TIPO BORDERLAYOUT Y QUE ESTÉ EN EL CENTRO CENTRO 
		setLayout(new BorderLayout());
		add(laminaCuadricula,BorderLayout.CENTER);
		
		//CONSTRUIMOS LA LÁMINA INFERIOR DONDE VA EL BOTÓN Y LO PONEMOS A LA ESCUCHA. AGREGAMOS LA LÁMINA MOSTRAR EN EL SUR.
		JPanel laminaMostrar = new JPanel();
		JButton botonMostrar = new JButton("Mostrar");
		
		//DOTAMOS DE FUNCIONALIDAD AL BOTÓNMOSTRAR, E INSTANCIAMOS LA CLASE ACCIÓNMOSTRAR 
		botonMostrar.addActionListener(new AccionMostrar());
		
		laminaMostrar.add(botonMostrar);
		add(laminaMostrar,BorderLayout.SOUTH);
	}
	
	
	//PROPORCIONA EL MENSAJE --- CREAMOS UN MÉTODO QUE NOS DEVUELVA EL MENSAJE  
	public Object dameMensaje() {
		//ALMACENAMOS EN UNA VARIBLE, LA VARIABLE SELECCIONADA EN EL TERCER BOX (LA LAMINAMENSAJE -- ""MENSAJE")
		String  s = laminaMensaje.dameSeleccion();
		if(s.equals("Cadena")) {
			return cadenaMensaje;    																			//cadenaMensaje es la variable String declarada más abajo, que contiene la cadena "Mensaje",
		}else if(s.equals("Icono")) {
			return iconoMensaje;
		}else if(s.equals("Componente")) {
			return componenteMensaje;
		}else if(s.equals("Otros")) {
			return objetoMensaje;
		}else if(s.contentEquals("Object[]")) {
			return new Object[]{cadenaMensaje,iconoMensaje,componenteMensaje,objetoMensaje};
		}else {
			return null; 																					  //se pone else null, para quitar el error que da el método.
		}
	}
	
	
	
	//DEVUELVE TIPO ÍCONO Y TAMBN N° DE BOTONES EN "CONFIRMAR" --- CREAMOS MÉTODO   //le damos un argumento de tipo LaminaBotones
	public int dameTipo(A2_123_LaminaBotones lamina) {
		String s = lamina.dameSeleccion();    //almacenamos en "s", la opción elegida por el usuario en cualquier lámina.
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
			return 0;  									//agregamos esta para que el método no dé error.
		}
	}
	
	
	
	//DA OPCIONES A LA LÁMINA OPCIÓN
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
				JOptionPane.showMessageDialog(A1_123_MarcoDialogos.this,dameMensaje(),"Título",dameTipo(laminaTipoMensajes));
				
			}else if(laminaTipo.dameSeleccion().equals("Confirmar")) {
				JOptionPane.showConfirmDialog(A1_123_MarcoDialogos.this,dameMensaje(),"Título",dameTipo(laminaConfirmar),dameTipo(laminaTipoMensajes));
			
			}else if(laminaTipo.dameSeleccion().equals("Entrada")){
				
				if(laminaEntrada.dameSeleccion().equals("Campo de Texto")){
					JOptionPane.showInputDialog(A1_123_MarcoDialogos.this,dameMensaje(),"Título",dameTipo(laminaTipoMensajes));
				}else {
					JOptionPane.showInputDialog(A1_123_MarcoDialogos.this,dameMensaje(),"Título",dameTipo(laminaTipoMensajes),null,new String[] {"Amarillo","Azul","Rojo"},"Azul");
				}
			
			}else if(laminaTipo.dameSeleccion().equals("Opción")){
				JOptionPane.showOptionDialog(A1_123_MarcoDialogos.this,dameMensaje(),"Título",0,dameTipo(laminaTipoMensajes),null,dameOpciones(laminaOpcion),null);
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


//CONSTRUIMOS UNA CLASE QUE SEA CAPAZ DE CONSTRUIR UN LÁMINA DE COLOR AMARILLO
class LaminaEjemplo extends JPanel{
	
	//SOBREESCRIBIMOS EL MÉTODO PAINTCOMPONENT(LLEVA POR PARAMETRO UN OBJ DE TIPO GRAPHICS 'G')
	public void paintComponent(Graphics g) {
		super.paintComponent(g);   																   //llamamos al constructor de la clase padre.
		Graphics2D g2 = (Graphics2D)g;															   //hacemos un casting
		Rectangle2D rectangulo = new Rectangle2D.Double(0,0,getWidth(), getHeight());  			   //creamos el rectángulo. (X,Y,alto,ancho) 
		g2.setPaint(Color.YELLOW);																   //elegimos el color del rectángulo.
		g2.fill(rectangulo);																	   //rellenamos el rectángulo con amarillo.
	}
}


