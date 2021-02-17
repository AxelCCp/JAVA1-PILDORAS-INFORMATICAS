package Java1;

// Array bidimensional con numeros de matriz puestos entre llaves. 
// Al final, para imprimir, están los dos métodos << for >> y << for each >>,  para imprimir los números de la matriz.

public class C5_Java26ArraysBidimensionales_ll {
	
	public static void main(String[] args) {
		
		int [][] matrix = {
				{21,32,34,45,56},
				{65,67,87,89,90},
				{46,86,97,80,12},
				{34,45,65,76,87}
		};
		
		//for(int i=0; i<4; i++) {                           // BUCLE FOR
			//System.out.println();
			
			//for(int j=0; j<5; j++) {
				//System.out.print(matrix[i][j]);
			//}
		//}
	//}
//}
		for(int[] fila:matrix) {                             // BUCLE FOR EACH
			System.out.println();
			
			for(int [] z:matrix) {
				System.out.print(z);
			}
		}
	}
}
		
		
