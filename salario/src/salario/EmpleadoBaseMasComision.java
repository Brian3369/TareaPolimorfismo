package salario;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
	private double salarioBase;
	
	public EmpleadoBaseMasComision(String nombre, String apellido, int numeroSeguroSocial, double ventasBrutas, double salarioBase){
		super(nombre, apellido, numeroSeguroSocial, ventasBrutas);
		this.ventasBrutas = ventasBrutas;
		this.tarifaPorComicion = 0.10;
		this.salarioBase = salarioBase;
	}
	
	@Override
	public double calcularSalario() {
		double salario = (ventasBrutas * tarifaPorComicion) + salarioBase;
		return salario;		
	}
}
