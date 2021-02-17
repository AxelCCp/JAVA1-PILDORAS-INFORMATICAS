package Java1;

public class B9_Java23UsoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz = new int [5];
		
		mi_matriz[0]= 5;         //
		mi_matriz[1]= 38;        //
		mi_matriz[2]= -15;       //
		mi_matriz[3]= 92;        //
		mi_matriz[4]= 71;        //
		
		// int[] mi_matriz = {5, 38, -15, 92, 71};   //  Esta es la otra manera de "declarar e iniciar" la matriz.
													 //  Esto se llama declaración simplificada o implícita de matriz.
		
	for(int i=0; i<5; i++) {
		System.out.println("Valor del indice " + i + " = " + mi_matriz[i]);  
	}
	
	
	System.out.println(":::::::::::::::::::::::::::::::::::::::::");
	
	
	String[]letras = new String[5];
	letras[0]="a";
	letras[1]="e";
	letras[2]="i";
	letras[3]="o";
	letras[4]="u";
	
	
	for(int i=0;i<=5;i++) {
		System.out.println("El indice " + i + " tiene el siguiente valor String: " + letras[i]);
	}
	
	
	
	
	
	}
}
