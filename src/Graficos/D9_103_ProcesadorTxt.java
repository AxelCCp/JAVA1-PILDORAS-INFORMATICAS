package Graficos;

/*
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextPane;

public class D9_103_ProcesadorTxt {
	public static void main(String[]args) {
		Marcotxt marco = new Marcotxt();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class Marcotxt extends JFrame{
	public Marcotxt() {
		setBounds(550,350,500,350);
		setVisible(true);
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
		
		configuraMenu("Arial","fuente","Arial",9,10); 
		configuraMenu("Courier","fuente","Courier",9,10);
		configuraMenu("Verdana","fuente","Verdana",9,10);
		
		configuraMenu("Negrita","estilo","",Font.BOLD,1);
		configuraMenu("Cursiva","estilo","",Font.ITALIC,1);
		
		configuraMenu("12","tamaño","",9,12);
		configuraMenu("16","tamaño","",9,16);
		configuraMenu("20","tamaño","",9,20);
		configuraMenu("24","tamaño","",9,24);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);

		laminaMenu.add(mibarra);
		add(laminaMenu,BorderLayout.NORTH);
		miarea = new JTextPane();
		add(miarea,BorderLayout.CENTER);		
	}
	
	public void configuraMenu(String rotulo, String menu, String tipoLetra, int estilos, int tam) {
		JMenuItem elemMenu = new JMenuItem(rotulo);
		if(menu=="fuente") {
			fuente.add(elemMenu);
		}else if(menu=="estilo") {
			estilo.add(elemMenu);
		}else if(menu=="tamaño") {
			tamano.add(elemMenu);
		}
		
		elemMenu.addActionListener(new GestionaEventos(rotulo,tipoLetra,estilos,tam));
	}
	
	private class GestionaEventos implements ActionListener{
		
		String tipoTexto;
		String menu;
		int estiloLetra;
		int tamanoLetra;
		
		public GestionaEventos(String elemento, String texto2, int estilo2, int tamLetra) {
			
			menu = elemento;
			tipoTexto = texto2;
			estiloLetra= estilo2;
			tamanoLetra = tamLetra;
			
		}
		
		public void actionPerformed(ActionEvent e) {
			
			letras = miarea.getFont();
			if(menu=="Arial" || menu=="Courier" || menu=="Verdana") {
				estiloLetra=letras.getStyle();
				tamanoLetra=letras.getSize();
				
			}else if(menu=="Cursiva" || menu=="Negrita") {
				if(letras.getStyle()==1 || letras.getStyle()==2) {
					estiloLetra=3;
				}
				tipoTexto=letras.getFontName();
				tamanoLetra=letras.getSize();
		
			}else if(menu=="12" || menu=="16" || menu=="20" || menu=="24") {
				estiloLetra=letras.getStyle();
				tipoTexto=letras.getFontName();
			}
			miarea.setFont(new Font(tipoTexto,estiloLetra,tamanoLetra));
			System.out.println("Tipo: " + tipoTexto + " Estilo: " + estiloLetra + " Tamaño: " + tamanoLetra);
		}
	}
	
	JTextPane miarea;
	JMenu fuente;
	JMenu estilo;
	JMenu tamano;
	Font letras;
}

*/