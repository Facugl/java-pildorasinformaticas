package PrimerPackage;

import javax.swing.*;

public class Uso_Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String [] paises = new String[8];
		
		/*
		paises[0] = "España";
		paises[1] = "Argentina";
		paises[2] = "Portugal";
		paises[3] = "Japón";
		paises[4] = "Perú";
		paises[5] = "Grecia";
		paises[6] = "Italia";
		paises[7] = "Estados Unidos";
		*/
		
		/* for (int i = 0; i < paises.length; i++) {
			System.out.println("Pais " + (i + 1) + " " + paises[i]);
		} */
		
		// String [] paises = { "España", "Argentina", "Portugal", "Japón", "Perú", "Grecia", "Italia", "Estados Unidos" };
		
		for (int i = 0; i < 8; i++) {
			paises[i] = JOptionPane.showInputDialog("Introduce pais " + (i + 1));
		}
		
		for (String elemento: paises) {
			System.out.println("Pais: " + elemento);
		}
	}

}
