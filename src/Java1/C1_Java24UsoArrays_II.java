package Java1;

// Matriz con valores String                                        //BUCLE <<  FOR EACH  >> CON MATRIZ
																	//tambi�n est� el bucle <<  for  >> comentado.
public class C1_Java24UsoArrays_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String [8];   // sint�xis de declaraci�n de matriz. 
		
		paises [0] = "Espa�a";
		paises [1] = "M�xico";
		paises [2] = "Colombia";
		paises [3] = "Per�";
		paises [4] = "Chile";
		paises [5] = "Argentina";
		paises [6] = "Ecuador";
		paises [7] = "Venezuela";
		
		/*for (int i=0; i<paises.length; i++) {
			
			System.out.println("Pa�s " + (i+1) + " " + paises [i]);
		}*/
		
		for(String elemento:paises) {                         // SINTAXIS DEL "BUCLE FOR EACH" o "BUBLE FOR MEJORADO" 
			System.out.println(elemento);
		}
	}
}
