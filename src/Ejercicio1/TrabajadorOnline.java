package Ejercicio1;

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
	

}
