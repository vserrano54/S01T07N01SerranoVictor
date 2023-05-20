package Ejercicio1;

public class Principal {
	
	public static void main(String args[]) {
		
		System.out.println();
		
		TrabajadorPresencial trabajadorpresencial = new TrabajadorPresencial("David", "Serrano", 50, 300);
		
		System.out.println(trabajadorpresencial.toString());
		//Horas trabajadas 224
		System.out.println("Salario Total: " + trabajadorpresencial.calcularSueldo(224));
		
		System.out.println();
		
		TrabajadorOnline trabajadoronline = new TrabajadorOnline("Victor", "Serrano", 320);
		System.out.println(trabajadoronline.toString());
		//Horas trabajadas 250
		System.out.println("Salario Total: " + trabajadoronline.calcularSueldo(250));
		
		
	}

}
