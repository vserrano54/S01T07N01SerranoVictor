package Ejercicio1;

public abstract  class Trabajador {
	
	private String nombre;
	private String apellido;
	private float precioxhora;
	
	public Trabajador(String nombre, String apellido, float precioxhora) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.precioxhora = precioxhora;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public float getPrecioxhora() {
		return precioxhora;
	}

	public void setPrecioxhora(float precioxhora) {
		this.precioxhora = precioxhora;
	}

	public abstract float calcularSueldo(float horasTrabajadas);

	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", apellido=" + apellido + ", precioxhora=" + precioxhora
				+ ", calcularSueldo()]";
	}
	
	
	
	
	

}
