package Graficos;

import java.awt.*;
import javax.swing.*;
import javax.imageio.*;  //importo el paquete imageIo para usar la clase ImageIo.
import java.io.*;  // importamos este paquete para usar la clase File.


public class A9_64_Incluyendo_Imagenes2 {
	
public static void main(String[]args) {
		
		MarcoImagenX miMarco = new MarcoImagenX();
		miMarco.setVisible(true);
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}


class MarcoImagenX extends JFrame{
	
	public MarcoImagenX() {
		setTitle("Marco con Imagen");
		setBounds(0,0,1600,2400);
		
		LaminaConImagenX miLamina = new LaminaConImagenX();
		add(miLamina);
	}
}


class LaminaConImagenX extends JPanel{
	
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
		
		
		int anchuraImagen = imagen.getHeight(this);   //con estos métodos conseguimos los pixeles de la imagen
		int alturaImagen = imagen.getWidth(this);
		
				
		
		
		g.drawImage(imagen, 0, 0, null);                     //(11) dibujamos la imagen en la coordenada XY 5,5 
		
		for(int i=0;i<3;i++) {                            //con los for se hace un collage. uno es para horizontal y otro para vertical
			for(int j=0;j<4;i++) {
				
				g.copyArea(0, 0, anchuraImagen, alturaImagen,alturaImagen*i,anchuraImagen*j);           //metodo de la clase Graphics, para copiar imagen y volver a imprimirla
			}
			
		}
		      				 
		
	}	
																		//(1) declaro variable privada de tipo Image
	private Image imagen;
	
	
	
	

}
