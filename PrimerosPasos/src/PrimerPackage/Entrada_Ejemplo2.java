package PrimerPackage;

import javax.swing.*;

public class Entrada_Ejemplo2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre, por favor");
		
		String edad = JOptionPane.showInputDialog("Introduce la edad, por favor");
		
		System.out.println("Hola " + nombre_usuario + ". Tienes " + edad + " años.");
		
		// System.out.println("Holis");

	}

}
