package poo;
                                                               // A5_Java40Furgoneta, hereda de la clase A0_Java28Coche. ***Extends convierte a la clase coche en SuperClase y a Furgoneta en subclase.                
public class A5_Java40Furgoneta extends A0_Java28Coche {       //con esto, FURGONETA,  va a tener los metodos y caracter�sticas de la CLASE COCHE, m�s sus propios m�todos y carater�sticas.
	

//---------------------------------------------------------------------------------------------------------------------------
	
    //Furgoneta tiene caracter�sticas propias tambi�n. Capacidad de carga y plazas extras. Por lo tanto hay que programar estas caracter�sticas extra.
	private int capacidad_carga;  //variables de clase.
	private int plazas_extra;     

//---------------------------------------------------------------------------------------------------------------------------
	
	//CONSTRUCTOR para el objeto furgoneta:
	public A5_Java40Furgoneta(int plazas_extra, int capacidad_carga) {
	
		super();                                                      //esta instrucci�n llama al constructor de la clase padre. O sea la clase COCHE. Esto con el objetivo de darle un estado inicial al obj. furgoneta. ya que la furgoneta necesita heredar las ruedas, el largo, ancho, motor, y peso_plataforma.
		this.capacidad_carga = capacidad_carga;
		this.plazas_extra = plazas_extra;
	}
	
//---------------------------------------------------------------------------------------------------------------------------
	
	//M�todo Getter
	public String dimeDatosFurgoneta() {
		return "La capacidad de carga es: " + capacidad_carga + " Y las plazas son: " + plazas_extra;
		
		
	}
}
