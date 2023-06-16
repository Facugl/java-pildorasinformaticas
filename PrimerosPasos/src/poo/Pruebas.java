package poo;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1 = new Empleados("Paco");		
		Empleados trabajador2 = new Empleados("Ana");
		Empleados trabajador3 = new Empleados("Antonio");
		Empleados trabajador4 = new Empleados("Maria");
		
		trabajador1.changeSection("RRHH");
		// trabajador1.cambiaNombre("Maria");
		
		System.out.println(trabajador1.devuelveDatos());
		System.out.println(trabajador2.devuelveDatos());
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());
		
		System.out.println(Empleados.dameIdSiguiente());
	}

}

class Empleados {
	
	public Empleados(String nom) {
		name = nom;
		section = "Administracion";
		Id = IdSiguiente;
		IdSiguiente++;
	}
	
	public void changeSection(String section) {
		this.section = section;
	}
	
	/*
	public void cambiaNombre(String nombre) {
		this.name = nombre;
	}
	*/
	
	public String devuelveDatos() {
		return "El nombre es: " + name + " y la seccion es: " + section + " y el Id es: " + Id;
	}
	
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: " + IdSiguiente;
	}
	
	private final String name;
	private String section;
	private int Id;
	public static int IdSiguiente = 1;
}

