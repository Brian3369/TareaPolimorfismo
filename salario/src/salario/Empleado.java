package salario;

public abstract class Empleado {
	private String nombre;
	private String apellido;
	private  int numeroSeguroSocial;
	
	public Empleado(String nombre, String apellido, int numeroSeguroSocial) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellid() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getNumeroSeguroSocial() {
		return numeroSeguroSocial;
	}
	
	public void setNumeroSeguroSocial(int numeroSeguroSocial) {
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	
	public abstract double calcularSalario();	
}
