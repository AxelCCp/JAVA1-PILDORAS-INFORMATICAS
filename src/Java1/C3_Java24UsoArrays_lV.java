package Java1;

public class C3_Java24UsoArrays_lV {
	public static void main(String[] args) {
	
		int[] matriz_aleatorios = new int[150];						  //declaraciónde matriz de tipo int.
		
		for(int i=0; i<matriz_aleatorios.length; i++) {				  // bucle for, para relenar la matriz con números aleatorios.
		
			matriz_aleatorios[i] = (int)Math.round(Math.random()*100);// (int) refundición, pq el metodo random devuelve n° decimal.
		}															  // metodo round,  redondea numeros.
			
		for(int numeros: matriz_aleatorios) {                     //con este bucle for each, se recorre la matriz para leerla.
				
			System.out.print(numeros + " ");		
		}
	}
}
	