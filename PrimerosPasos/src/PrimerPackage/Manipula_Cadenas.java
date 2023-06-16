package PrimerPackage;

public class Manipula_Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Facundo";
		
		System.out.println("Mi nombre es " + name);
		
		System.out.println("Mi nombre tiene " + name.length() + " letras.");
		
		System.out.println("La primera letra de " + name + " es la " + name.charAt(0));
		
		int ultima_letra;
		ultima_letra = name.length();
		System.out.println("Y la última letra es la " + name.charAt(ultima_letra - 1));

	}

}
