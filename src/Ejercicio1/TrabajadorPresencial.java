package Ejercicio1;

public class TrabajadorPresencial extends Trabajador{

	private static float gasolina;
	
	public TrabajadorPresencial(String nombre, String apellido, float precioxhora, float gasolina) {
		super(nombre, apellido, precioxhora);
		this.gasolina=gasolina;
		
	}
	

	public static float getGasolina() {
		return gasolina;
	}


	public static void setGasolina(float gasolina) {
		TrabajadorPresencial.gasolina = gasolina;
	}


	@Override
	public float calcularSueldo(float horasTrabajadas) {
		float sueldoTotal = this.getPrecioxhora()*horasTrabajadas + gasolina;
		
		return sueldoTotal;
	}


	@Override
	public String toString() {
		return "Trabajador Presencial [Nombre: " + getNombre() + ", Apellido: " + getApellido()
				+ ", Precio x hora: " + getPrecioxhora() + ", Gasolina: " + getGasolina() + "]";
	}
	
	

}
