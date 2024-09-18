package salario;

public class EmpleadoPorComision extends Empleado{
	protected double ventasBrutas;
	protected double tarifaPorComicion;
	
	public EmpleadoPorComision(String nombre, String apellido, int numeroSeguroSocial, double ventasBrutas) {
		super(nombre, apellido, numeroSeguroSocial);
		this.ventasBrutas = ventasBrutas;
		this.tarifaPorComicion = 0.10;
	}

	@Override
	public double calcularSalario() {
		double salario = ventasBrutas * tarifaPorComicion;
		return salario;		
	}
}
