package Java1;

// Matriz con valores String                                        //BUCLE <<  FOR EACH  >> CON MATRIZ
																	//también está el bucle <<  for  >> comentado.
public class C1_Java24UsoArrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String [8];   // sintáxis de declaración de matriz. 
		
		paises [0] = "España";
		paises [1] = "México";
		paises [2] = "Colombia";
		paises [3] = "Perú";
		paises [4] = "Chile";
		paises [5] = "Argentina";
		paises [6] = "Ecuador";
		paises [7] = "Venezuela";
		
		/*for (int i=0; i<paises.length; i++) {
			
			System.out.println("País " + (i+1) + " " + paises [i]);
		}*/
		
		for(String elemento:paises) {                         // SINTAXIS DEL "BUCLE FOR EACH" o "BUBLE FOR MEJORADO" 
			System.out.println(elemento);
		}
	}
}
