package graficos;

import java.awt.event.*;
import javax.swing.*;

public class Varios_Oyentes {

	public static void main(String[] args) {
		Marco_Principal mimarco = new Marco_Principal();
		miMarco.setDefaultLookAndFeelDecorated(false);
		mimarco.setVisible(true);
	}

}

class Marco_Principal extends JFrame {
	public Marco_Principal() {
		setTitle("Prueba Varios");
		setBounds(600, 100, 300, 200);
		Lamina_Principal lamina = new Lamina_Principal();
		add(lamina);	
	}
}

class Lamina_Principal extends JPanel {
	public Lamina_Principal() {
		JButton boton_nuevo = new JButton("Nuevo");
		add(boton_nuevo);
		boton_cerrar = new JButton("Cerrar todo");
		add(boton_cerrar);
		
		OyenteNuevo miOyente = new OyenteNuevo();
		boton_nuevo.addActionListener(miOyente);
	}
	
	private class OyenteNuevo implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
			marco.setVisible(true);
		}
	}
	
	JButton boton_cerrar;
}

class Marco_Emergente extends JFrame {
	public Marco_Emergente(JButton boton_de_princippal) {
		contador++;
		setTitle("Ventana " + contador);
		setBounds(40*contador, 40*contador, 300, 150);
		
		CierraTodos oyenteCerrar = new CierraTodos();
		boton_de_princippal.addActionListener(oyenteCerrar);
	}
	
	public class CierraTodos implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			contador = 0;
			dispose();
		}
	}
	
	private static int contador = 0;
}
