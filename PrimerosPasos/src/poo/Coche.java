package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche() {
		ruedas = 4;
		largo = 2000;
		ancho = 300;
		motor = 1600;
		peso_plataforma = 500;
	}
	
	public String dime_datos_generales() {
		return "La plataforma del vehiculo tiene " + ruedas + " ruedas" + ". Mide " + largo/1000 + " metros con un ancho " + ancho + " cm y un peso de plataforma de " + peso_plataforma + " kg"; 
	}
	
	public void establece_color(String color_coche) {
		color = color_coche;
	}
	
	public String dime_color() {
		return "El color del coche es " + color; 
	}
	
	public void  configurar_asientos(String asientos_cuero) {
		if (asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero = true;
		} else {
			this.asientos_cuero = false;
		}
	}
	
	public String dime_asientos() {
		if (asientos_cuero == true) {
			return "El coche tiene asientos de cuero";
		} else {
			return "El coche tiene asientos de serie";
		}
	}
	
	public void configurar_climatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
			this.climatizador = true;
		} else {
			this.climatizador = false;
		}
	}
	
	public String dime_climatizador() {
		if (climatizador == true) {
			return "El coche incorpora climatizador";
		} else {
			return "El coche lleva aire acondicionado";
		}
	}

}
