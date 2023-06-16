package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] lasPersonas = new Persona[2];
		lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25);
		lasPersonas[1] = new Alumno("Matias Perez", "Ingenieria Civil");

		for (Persona p: lasPersonas) {
			System.out.println(p.dame_nombre() + ", " + p.dame_descripcion());
		}
	}

}

abstract class Persona {
	public Persona(String nom) {
		nombre = nom;
	}
	
	public String dame_nombre() {
		return nombre;
	}
	
	// Creo el metodo abstracto, sera diferente para cada clase, y solo se define
	public abstract String dame_descripcion();
	
	private String nombre;
}

class Empleado2 extends Persona {
	public Empleado2(String nom, double sue, int year, int month, int day) {
		
		super(nom);
		
		sueldo = sue;
		GregorianCalendar calendario = new GregorianCalendar(year, month - 1, day);
		
		altaContrato = calendario.getTime();
		
		++IdSiguiente;
		Id = IdSiguiente;
	}
	
	public String dame_descripcion() {
		return "Este empleado tiene un Id = " + Id + " con un sueldo = " + sueldo;
	}
	
	public double dameSueldo() {
		return sueldo;
	}
	
	public Date dameFechaContrato() {
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {
		double aumento = sueldo*porcentaje/100;
		sueldo += aumento;
	}
	
	private double sueldo;
	private Date altaContrato;
	private static int IdSiguiente;
	private int Id;
}

class Alumno extends Persona {
	public Alumno(String nom, String car) {
		super(nom);
		
		carrera = car;
	}
	
	public String dame_descripcion() {
		return "Este alumno esta estudiando la carrera de " + carrera;
	}
	
	private String carrera;
}
