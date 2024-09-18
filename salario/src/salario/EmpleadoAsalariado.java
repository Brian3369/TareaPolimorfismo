package salario;

public class EmpleadoAsalariado extends Empleado{
	private double salarioSemanal;

	public EmpleadoAsalariado(String nombre, String apellido, int numeroSeguroSocial, double salarioSemanal) {
		super(nombre, apellido, numeroSeguroSocial);
		this.salarioSemanal = salarioSemanal;
	}

	public double getSalarioSemanal() {
		return salarioSemanal;
	}
	
	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
	}
	
	@Override
	public double calcularSalario() {
		double salario = salarioSemanal;
		return salario;		
	}

}
