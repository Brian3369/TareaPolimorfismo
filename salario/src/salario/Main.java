package salario;

public class Main {

	public static void main(String[] args) {
		EmpleadoPorHora empHora = new EmpleadoPorHora("Brian", "Tavarez", 142, 800, 40);
		EmpleadoAsalariado empAsalariado = new EmpleadoAsalariado("Brian", "Tavarez", 142, 10000);
		EmpleadoPorComision empComicion = new EmpleadoPorComision("Brian", "Tavarez", 142, 50000);
		EmpleadoBaseMasComision empBaseComicion = new EmpleadoBaseMasComision("Brian", "Tavarez", 142, 50000, 40000);
		
		System.out.println("Empleado por hora " + empHora.calcularSalario());
		System.out.println("Empleado asalariado " + empAsalariado.calcularSalario());
		System.out.println("Empleado por comicion " + empComicion.calcularSalario());
		System.out.println("Empleado base mas comicion " + empBaseComicion.calcularSalario());
	}
}
