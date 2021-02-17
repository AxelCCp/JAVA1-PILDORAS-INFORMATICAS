package Graficos;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBoxMenuItem;
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

public class E0_106_ProcesadorTxt {
	public static void main(String[]args) {
		Marcotxt marco = new Marcotxt();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marcotxt extends JFrame{
	public Marcotxt() {
		setBounds(400,100,600,600);
		setVisible(true);
		setTitle("Editor de texto");
		Laminatxt lamina = new Laminatxt();
		add(lamina);
	}
}

class Laminatxt extends JPanel{
	public Laminatxt() {
		
		BorderLayout xxx = new BorderLayout();
		setLayout(xxx);
		JPanel laminaMenu = new JPanel();
		JMenuBar mibarra = new JMenuBar();
		
		fuente = new JMenu("Fuente");
		estilo = new JMenu("Estilo");
		tamano = new JMenu("Tamaño");
		
		configuraMenu("Arial","fuente","Arial",9,10,""); 
		configuraMenu("Courier","fuente","Courier",9,10,"");
		configuraMenu("Verdana","fuente","Verdana",9,10,"");
		
		configuraMenu("Negrita","estilo","",Font.BOLD,1,"bin/Graficos/icon_wand.gif");
		configuraMenu("Cursiva","estilo","",Font.ITALIC,1,"bin/Graficos/file_font.gif");
		
		/*JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita",new ImageIcon("bin/Graficos/icon_wand.gif"));
		JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva",new ImageIcon("bin/Graficos/file_font.gif"));
		negrita.addActionListener(new StyledEditorKit.BoldAction());
		cursiva.addActionListener(new StyledEditorKit.ItalicAction());
		estilo.add(negrita);
		estilo.add(cursiva);*/
		/*
		configuraMenu("12","tamaño","",9,12,"");
		configuraMenu("16","tamaño","",9,16,"");
		configuraMenu("20","tamaño","",9,20,"");
		configuraMenu("24","tamaño","",9,24,"");
		*/
		
		ButtonGroup tamanoLetra = new ButtonGroup();
		
		JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");
		JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");
		JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");
		JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
		
		//atajo de teclado
		veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D,InputEvent.CTRL_DOWN_MASK));//setAccelerator() para establecer una combinación de teclas, como atajo de teclado.
		
		
		tamanoLetra.add(doce);
		tamanoLetra.add(dieciseis);
		tamanoLetra.add(veinte);
		tamanoLetra.add(veinticuatro);	
		
		doce.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",12));
		dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",16));
		veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",20));
		veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",24));
		
		tamano.add(doce);
		tamano.add(dieciseis);
		tamano.add(veinte);
		tamano.add(veinticuatro);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);

		laminaMenu.add(mibarra);
		add(laminaMenu,BorderLayout.NORTH);
		miarea = new JTextPane();
		add(miarea,BorderLayout.CENTER);
		
		
		JPopupMenu emergente = new JPopupMenu();
		JMenuItem negritaE = new JMenuItem("Negrita");
		JMenuItem cursivaE= new JMenuItem("Cursiva");
		negritaE.addActionListener(new StyledEditorKit.BoldAction());
		cursivaE.addActionListener(new StyledEditorKit.ItalicAction());
		emergente.add(negritaE);
		emergente.add(cursivaE);
		miarea.setComponentPopupMenu(emergente);
		
		//-----------------------------------------------------------------------------------------------
		
		JToolBar barraTool = new JToolBar();		
		JButton negritaBarra = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/icon_wand.gif"));
		JButton cursivaBarra = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/edit.gif"));
		JButton subrayaBarra = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/icon_key.gif"));
		JButton azulBarra = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_white.gif"));
		JButton amarilloBarra = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_orange.gif"));
		JButton rojoBarra = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/flag_red.gif"));
		
		JButton alineacionLeft = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_left.gif"));
		JButton alineacionRight= new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_right.gif"));
		JButton alineacionCenter = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_up.gif"));
		JButton alineacionJust = new JButton(new ImageIcon("C:/Users/Fantasma/Downloads/150-iconos-gif/arrow_down.gif"));
		
		negritaBarra.addActionListener(new StyledEditorKit.BoldAction());
		cursivaBarra.addActionListener(new StyledEditorKit.ItalicAction());
		subrayaBarra.addActionListener(new StyledEditorKit.UnderlineAction());
		azulBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_azul", Color.BLUE));             //(parámetro String, parametro Color) 
		amarilloBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_amarillo", Color.YELLOW));
		rojoBarra.addActionListener(new StyledEditorKit.ForegroundAction("Pone_rojo", Color.RED));
		alineacionLeft.addActionListener(new StyledEditorKit.AlignmentAction("alinea_left", 3));
		alineacionRight.addActionListener(new StyledEditorKit.AlignmentAction("alinea_right",2));
		alineacionCenter.addActionListener(new StyledEditorKit.AlignmentAction("alinea_centrado",1));
		alineacionJust.addActionListener(new StyledEditorKit.AlignmentAction("alinea_justificado",0));
		
		barraTool.add(negritaBarra);
		barraTool.add(cursivaBarra);
		barraTool.add(subrayaBarra);
		barraTool.add(azulBarra);
		barraTool.add(amarilloBarra);
		barraTool.add(rojoBarra);
		barraTool.add(alineacionLeft);
		barraTool.add(alineacionRight);
		barraTool.add(alineacionCenter);
		barraTool.add(alineacionJust);
		
		
		barraTool.setOrientation(1);                                                     //le decimos que los botones deben estar en vertical
		add(barraTool,BorderLayout.WEST);
		
		
		//--------------------------------------------------------------------------------------------
		
		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam, String icono) {
		
		JMenuItem elemMenu = new JMenuItem(rotulo, new ImageIcon(icono));
		
		if(menu=="fuente") {
			fuente.add(elemMenu);
			if(tipoLetra=="Arial") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Arial"));
			}else if(tipoLetra=="Courier") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Courier"));
			}else if(tipoLetra=="Verdana") {
				elemMenu.addActionListener(new StyledEditorKit.FontFamilyAction("cambiaLetra","Verdana"));
			}
		
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
		
		}else if(menu=="tamaño") {
			tamano.add(elemMenu);
			elemMenu.addActionListener(new StyledEditorKit.FontSizeAction("cambiaTamaño",tam));
		}
	}
	
	JTextPane miarea;
	JMenu fuente;
	JMenu estilo;
	JMenu tamano;
	Font letras;
}

