package PrimerPackage;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] mi_matriz = new int[5];
		
		mi_matriz[0] = 5;
		mi_matriz[1] = 38;
		mi_matriz[2] = -15;
		mi_matriz[3] = 92;
		mi_matriz[4] = 71;
		
		for (int i = 0; i < mi_matriz.length; i++) {
			System.out.println("Valor de indice " + i + " = " + mi_matriz[i]);
		}

	}

}
