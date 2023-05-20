package Ejercicio2;

import java.util.Date;

public class TrabajadorOnline extends Trabajador{
	
	final float TARIFA_INTERNET = 150f;
	public TrabajadorOnline(String nombre, String apellido, float precioxhora) {
		super(nombre, apellido, precioxhora);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public float calcularSueldo(float horasTrabajadas) {
		// TODO Auto-generated method stub
		float sueldoTotal = this.getPrecioxhora()*horasTrabajadas + TARIFA_INTERNET;
		
		return sueldoTotal;
	}



	@Override
	public String toString() {
		return "Trabajador Online [Nombre: " + getNombre()
				+ ", Apellido: " + getApellido() + ", Precio x hora:" + getPrecioxhora() + " ,Tarifa de Internet: " + TARIFA_INTERNET + "]";
	}
	
	@Deprecated
	public String reemplazarPalabra(String oracion, String palabra1, String palabra2) {
		
		String resultado = oracion.replaceAll(palabra1, palabra2);
		
		return resultado;
	}
	
	@Deprecated
	public String fechaActual() {
		Date date = new Date();
		int dia = date.getDate();
		int mes = date.getMonth();
		int anio = date.getYear();
		
		return dia +"/" + mes + "/" + anio;
	}
	

}
