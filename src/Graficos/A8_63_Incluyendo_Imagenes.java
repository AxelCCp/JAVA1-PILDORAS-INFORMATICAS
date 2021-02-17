package Graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;  //(2)importo el paquete imageIo para usar la clase ImageIo.
import java.io.*;  //(9) importamos este paquete para usar la clase File.


public class A8_63_Incluyendo_Imagenes {
	public static void main(String[]args) {
		
		MarcoImagen miMarco = new MarcoImagen();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoImagen extends JFrame{
	
	public MarcoImagen() {
		setTitle("Marco con Imagen");
		setBounds(750,300,300,200);
		
		LaminaConImagen miLamina = new LaminaConImagen();
		add(miLamina);
	}
}


class LaminaConImagen extends JPanel{
	
	public void paintComponent(Graphics g) {								
		super.paintComponent(g);
		
																		//(8)creamos un archivo de tipo File y le pasamos la dirección donde está la imajen.
		File miimagen = new File("C:\\Users/Fantasma/Pictures/IMAGENES/06892cc040cdff7c5b0f229a460a34bd.jpg");
		
		try {
																		//(10)aquí aparecerá un error, pq faltará manejar la exception, esto se hace con try catch
			imagen = ImageIO.read(miimagen);
		
		}catch(IOException e){
			System.out.println("la imagen no se encuentra");
		}
																		//(11) dibujamos la imagen en la coordenada XY 5,5 
		g.drawImage(imagen, 5, 5, null);
		
	}	
																		//(1) declaro variable privada de tipo Image
	private Image imagen;
	
	
	
}
