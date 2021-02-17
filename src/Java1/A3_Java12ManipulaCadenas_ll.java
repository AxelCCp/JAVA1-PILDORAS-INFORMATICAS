package Java1;

public class A3_Java12ManipulaCadenas_ll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "hoy es un estupendo dia para aprender a programar en java";
		String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo...." + " y " + frase.substring(29, 57);  
		
		System.out.println(frase_resumen);
	}
}
