package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.PopupMenu;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.StyledEditorKit.AlignmentAction;
import javax.swing.text.StyledEditorKit.FontSizeAction;
import javax.swing.text.StyledEditorKit.UnderlineAction;

public class E5_114_ProcesadorTxt {
	public static void main(String[]args) {
		MarcoTxt2 marco = new MarcoTxt2();
		marco.setVisible(true);
	}
}

class MarcoTxt2 extends JFrame{
	public MarcoTxt2() {
		setBounds(400,100,600,600);
		setVisible(true);
		setTitle("Word Pirata");
		LaminaTxt2 laminaTexto = new LaminaTxt2();
		add(laminaTexto);		
	}
}

class LaminaTxt2 extends JPanel{
	public LaminaTxt2() {
		setLayout(new BorderLayout());
		JPanel lamina2 = new JPanel();
		JMenuBar barra = new JMenuBar();
		
		fuente = new JMenu("Fuente");
		tamano = new JMenu("Tamaño");
		estilo = new JMenu("Estilo");
		
		//LLAMADA AL MÉTODO CONFIGURAMENÚ
		configuraMenu("Arial","fuente","Arial",9,10,""); 
		configuraMenu("Courier","fuente","Courier",9,10,"");
		configuraMenu("Verdana","fuente","Verdana",9,10,"");
		configuraMenu("Negrita","estilo","",Font.BOLD,1,"bin/Graficos/icon_wand.gif");
		configuraMenu("Cursiva","estilo","",Font.ITALIC,1,"bin/Graficos/file_font.gif");
		//
		
		//CONFIGURACIÓN DE BARRA EN LAMINA2
		barra.add(fuente);
		barra.add(tamano);
		barra.add(estilo);
		lamina2.add(barra);
		add(lamina2,BorderLayout.NORTH);
		
		//CONFIGURACIÓN DE CUADRO DE TEXTO
		cuadroTexto=new JTextPane();
		add(cuadroTexto,BorderLayout.CENTER);
		//
		
		//CONSTRUCCIÓN DE LA BARRA DEL MENÚ
		JMenuItem arial = new JMenuItem("Arial");
		JMenuItem courier = new JMenuItem("Courier");
		JMenuItem verdana = new JMenuItem("Verdana");
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12"); 
		JRadioButtonMenuItem catorce = new JRadioButtonMenuItem("14"); 
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16"); 
		JRadioButtonMenuItem dieciocho = new JRadioButtonMenuItem("18"); 
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veintidos = new JRadioButtonMenuItem("22"); 
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24"); 
		tamano.add(doce);
		tamano.add(catorce);
		tamano.add(dieciseis);
		tamano.add(dieciocho);
		tamano.add(veinte);
		tamano.add(veintidos);
		tamano.add(veinticuatro);
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",12));
		catorce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",14));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",16));
		dieciocho.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",18));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",20));
		veintidos.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",22));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",24));
		//
		
		//CONSTRUCCIÓN MENÚ EMERGENTE
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE = new JMenuItem("Cursiva");
		JMenuItem subrayadoE = new JMenuItem("Subrayar");
		emergente.add(negritaE);
		emergente.add(cursivaE);
		emergente.add(subrayadoE);
		cuadroTexto.setComponentPopupMenu(emergente);
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		subrayadoE.addActionListener(new StyledEditorKit.UnderlineAction());
		//
		
		//ATAJOS DE TECLADO MENÚ / TAMAÑO LETRA
		doce.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, InputEvent.CTRL_DOWN_MASK));
		catorce.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H,InputEvent.CTRL_DOWN_MASK));
		dieciseis.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_I, InputEvent.CTRL_DOWN_MASK));
		dieciocho.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_J, InputEvent.CTRL_DOWN_MASK));
		veinte.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		veintidos.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_L, InputEvent.CTRL_DOWN_MASK));
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));
		//	
		
		//BARRA DE HERRAMIENTAS
		barraTool=new JToolBar();
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/icon_wand.gif").addActionListener(new StyledEditorKit.BoldAction());    //cuando llamamos a este método, recibimos un obj de tipo JButton. esto nos permite poner el método AddActionListener inmediatamente. así ponemos al obj a la escucha.
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/edit.gif").addActionListener(new StyledEditorKit.ItalicAction());
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/icon_key.gif").addActionListener(new StyledEditorKit.UnderlineAction());
		barraTool.addSeparator();
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_white.gif").addActionListener(new StyledEditorKit.ForegroundAction("PoneAzul",Color.BLUE));
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_orange.gif").addActionListener(new StyledEditorKit.ForegroundAction("PoneAmarillo",Color.YELLOW));
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_red.gif").addActionListener(new StyledEditorKit.ForegroundAction("PoneAmarillo",Color.RED));
		barraTool.addSeparator();
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_left.gif").addActionListener(new StyledEditorKit.AlignmentAction("alianeaLeft",3));
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_right.gif").addActionListener(new StyledEditorKit.AlignmentAction("alianeaRight",2));
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_up.gif").addActionListener(new StyledEditorKit.AlignmentAction("alianeaCentrado",1));
		configuraBarra("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_down.gif").addActionListener(new StyledEditorKit.AlignmentAction("alianeaLeft",0));
		
		barraTool.setOrientation(1);                                                                                                       //le decimos que los botones deben estar en vertical
		add(barraTool,BorderLayout.WEST);
		
	}
	
	//METODO CONFIGURA MENU
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String icono) {
		
		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(icono));
		
		//FUENTE
		if(menu=="fuente") {
			fuente.add(elemMenu);
			if(tipoLetra=="Arial") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Arial"));
			}else if(tipoLetra=="Courier") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Courier"));
			}else if(tipoLetra=="Verdana") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Verdana"));
			}
		
		//ESTILO
		}else if(menu=="estilo") {
			estilo.add(elemMenu);
			if(estilos==Font.BOLD) {
				//atajo teclado
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.BoldAction());
			}else if(estilos==Font.ITALIC){
				//atajo teclado
				elemMenu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K,InputEvent.CTRL_DOWN_MASK));
				elemMenu.addActionListener(new StyledEditorKit.ItalicAction());
			}
		
		//TAMAÑO
		}else if(menu=="tamaño") {
			tamano.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",tam));
		}	
	}
	//MÉTODO PARA BARRA DE HERRAMIENTAS 
		public JButton configuraBarra(String ruta) {                                             //con JButton, le decimos al método que nos devuelva un obj de tipo JButton.
			JButton boton = new JButton(new ImageIcon(ruta));
			barraTool.add(boton);
			return boton;	
		}
	 	
	
	JMenu fuente;
	JMenu tamano;
	JMenu estilo;
	JTextPane cuadroTexto;
	JButton negritaBarra;
	JButton cursivaBarra;
	JButton czulBarra;
	JButton rojoBarra;
	JButton amarilloBarra;
	JButton alineaLeft;
	JButton alineaRight;
	JButton alineaCentrado;
	JButton alineaJustificado;
	JToolBar barraTool;
}














