package PrimerPackage;

import javax.swing.JOptionPane;

public class Entrada_Numeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String numero_obtenido=JOptionPane.showInputDialog("Inserte un numero");
		
		String decimales=JOptionPane.showInputDialog("Inserte el numero de decimales a mostrar");
		
		decimales = "%1."+decimales+"f;";
		
		double numero_convertido=Double.parseDouble(numero_obtenido);
		
		System.out.print("La raíz cuadrada de "+numero_convertido+" es ");
		
		System.out.printf(decimales,Math.sqrt(numero_convertido));

	}

}
