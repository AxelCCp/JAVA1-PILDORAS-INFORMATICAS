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
*/


/*
public class D8_101_ProcesadorTxt {
	public static void main(String[]args) {
		Marcotxt marco = new Marcotxt();
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
*/


/*
class Marcotxt extends JFrame{
	public Marcotxt() {
		setBounds(550,350,500,350);
		setVisible(true);
		Laminatxt lamina = new Laminatxt();
		add(lamina);
	}
}
*/

/*
class Laminatxt extends JPanel{
	public Laminatxt() {
		
		BorderLayout xxx = new BorderLayout();
		setLayout(xxx);
		JPanel laminaMenu = new JPanel();
		JMenuBar mibarra = new JMenuBar();
		
		JMenu fuente = new JMenu("Fuente");
		JMenu estilo = new JMenu("Estilo");
		JMenu tamano = new JMenu("Tamaño");
		
		
		JMenuItem arial = new JMenuItem("Arial");
		arial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miarea.setFont(new Font("Arial",Font.PLAIN,12));	
			}	
		});
		
		JMenuItem courier = new JMenuItem("Courier");
		courier.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miarea.setFont(new Font("Courier",Font.PLAIN,12));	
			}	
		});
		
		JMenuItem verdana = new JMenuItem("Verdana");
		verdana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				miarea.setFont(new Font("Verdana",Font.PLAIN,12));	
			}	
		});
		
		fuente.add(arial);
		fuente.add(courier);
		fuente.add(verdana);
		
		JMenuItem negrita = new JMenuItem("Negrita");
		JMenuItem cursiva = new JMenuItem("Cursiva");
		estilo.add(negrita);
		estilo.add(cursiva);
		
		JMenuItem tam12 = new JMenuItem("12");
		JMenuItem tam14 = new JMenuItem("14");
		JMenuItem tam16 = new JMenuItem("16");
		JMenuItem tam18 = new JMenuItem("18");
		tamano.add(tam12);
		tamano.add(tam14);
		tamano.add(tam16);
		tamano.add(tam18);
		
		mibarra.add(fuente);
		mibarra.add(estilo);
		mibarra.add(tamano);

		laminaMenu.add(mibarra);
		add(laminaMenu,BorderLayout.NORTH);
		
		miarea = new JTextPane();
		add(miarea,BorderLayout.CENTER);		
	}
	
	JTextPane miarea;
}


*/