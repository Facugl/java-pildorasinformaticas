package poo;

import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		Coche micoche = new Coche();
		
		micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));
		
		System.out.println(micoche.dime_datos_generales());
		
		System.out.println(micoche.dime_color());
		
		micoche.configurar_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
		
		System.out.println(micoche.dime_asientos());
		
		micoche.configurar_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
		
		System.out.println(micoche.dime_climatizador());
		
		*/
		
		Coche micoche1 = new Coche();
		micoche1.establece_color("rojo");
		Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
		mifurgoneta1.establece_color("azul");
		mifurgoneta1.configurar_asientos("si");
		mifurgoneta1.configurar_climatizador("si");
		System.out.println(micoche1.dime_datos_generales() + " " + micoche1.dime_color());
		System.out.println(mifurgoneta1.dime_datos_generales() + mifurgoneta1.dimeDatosFurgoneta());
		
	}

}
