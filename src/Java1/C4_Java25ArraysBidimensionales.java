package Java1;

// Matriz de dos dimensiones (Arrays): 
public class C4_Java25ArraysBidimensionales {
	public static void main(String[] args) {
		
		// declaración de matriz.
		
		int [] [] matrix = new int [4][5];
		
		matrix [0][0] =15;
		matrix [0][1] =32;
		matrix [0][2] =45;
		matrix [0][3] =65;
		matrix [0][4] =76;
		
		matrix [1][0] =43;
		matrix [1][1] =65;
		matrix [1][2] =78;
		matrix [1][3] =98;
		matrix [1][4] =53;
		
		matrix [2][0] =64;
		matrix [2][1] =57;
		matrix [2][2] =86;
		matrix [2][3] =75;
		matrix [2][4] =42;
		
		matrix [3][0] =34;
		matrix [3][1] =54;
		matrix [3][2] =65;
		matrix [3][3] =76;
		matrix [3][4] =99;
		
		// *** Maneras de imprimir un valor de ma matriz en específico:
		
		//System.out.println(matrix[2][4]);
		//System.out.println("El valor almacenado en la posición (2, 4) es: " + (matrix[2][4]));  
		
		// *** Ahora si queremos recorrer toda la matriz, hay que  usar 2 bucles << For >> anidados . Uno para cada dimensión.
		//for(int i=0; i<4; i++) {
			//for(int j=0; j<5; j++) {
				
				//System.out.println(matrix[i][j]);
				
		// *** Para ver matriz en forma de << TABLA >>, con los 2 bucles << For >> anidados:
		for(int i=0; i<4; i++) {
			System.out.println();
			
			for(int j=0; j<5; j++) {
				System.out.print(matrix[i][j]);
						
			}
		}
	}
}
