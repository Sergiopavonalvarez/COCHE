package coche;

public class coche_prueba {

	Integer cilindrada;
	String color;
	double precio;
	Boolean isarrancado;
	
	
	public void arrancar_coche() {
		
		if (isarrancado!=true) {
			System.out.println("este coche no esta arrancado");
		}
		else {
			
			System.out.println("este coche esta arrancado");
		}
	}
	
	public static void main (String [] args) {
		
		coche_prueba a=new coche_prueba();
		
		a.color="verde";
		a.isarrancado=false;
		
		System.out.println("este coche es " + a.color);
		a.arrancar_coche();
		System.out.println("VAMOS A ARRANCARLO");
		a.isarrancado=true;
		a.arrancar_coche();
		
	}
	
}
