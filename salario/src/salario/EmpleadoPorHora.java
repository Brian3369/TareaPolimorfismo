package salario;

public class EmpleadoPorHora extends Empleado{
	public double sueldoPorHora;
	private int horasTrabajadas;
	
	public EmpleadoPorHora(String nombre, String apellido, int numeroSeguroSocial, double sueldoPorHora, int horasTrabajadas) {
		super(nombre, apellido, numeroSeguroSocial);
		this.sueldoPorHora = sueldoPorHora;
		this.horasTrabajadas = horasTrabajadas;
	}
	
	public double getSueldoPorHora () {
		return sueldoPorHora;
	}
	
	public void setSueldoPorHora (double sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}
	
	public double getHorasTrabajas () {
		return horasTrabajadas;
	}
	
	public void setHorasTrabajadas (int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	@Override
	public double calcularSalario() {
		double salario = 00;
		if (horasTrabajadas <= 40) {
			salario = sueldoPorHora * horasTrabajadas;
		}
		else if (horasTrabajadas > 40) {
			salario = 40 * sueldoPorHora + (horasTrabajadas - 40) * sueldoPorHora * 1.5;
		}
		else {
			System.out.println("Error");
		}
		return salario;
	}
}
