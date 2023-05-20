package Ejercicio2;

import java.util.Date;

public class Principal {
	
	@SuppressWarnings("deprecation")
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
		
		
		
		//LLamada a metodos obsoletos en java
		System.out.println();
		System.out.println("Uso del metodo replaceAll");
		System.out.println("Llamada a metodos obsolestos en Java");
		String Oracion = "Curso de Java, It Acadmy";
		
		
		String Oracion2 = trabajadoronline.reemplazarPalabra(Oracion, "Curso", "Especializacion");
		
		System.out.println(Oracion2);
		
		System.out.println();
		System.out.println("Uso de los metodos getDate(),getMonth() y getYear() de la clase Date");
		System.out.println("Fecha actual: " + trabajadoronline.fechaActual());
	
		
		
		
	}

}
