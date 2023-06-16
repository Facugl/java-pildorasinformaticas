package PrimerPackage;

import javax.swing.*;
import java.util.*;

public class Areas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Elige una opcion:");
		
		System.out.println("1: Cuadrado");
		System.out.println("2: Rectangulo");
		System.out.println("3: Triangulo");
		System.out.println("4: Circulo");
		
		// almaceno el proximo entero que se ingrese
		int figura = entrada.nextInt();
		
		switch (figura) {
		case 1:
			int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
			System.out.println("El area del cuadrado es: " + Math.pow(lado, 2));
			break;
		case 2:
			int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del rectangulo es: " + base*altura);
			break;
		case 3:
			base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
			altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
			System.out.println("El area del triangulo es: " + (base*altura)/2);
			break;
		case 4:
			int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce radio"));
			System.out.print("El area del circulo es: " );
			System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
			break;
		default:
			System.out.println("La opcion no es correcta");
		}
	}

}
