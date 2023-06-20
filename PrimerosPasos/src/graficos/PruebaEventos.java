package graficos;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		MarcoBotones mimarco = new MarcoBotones();
		mimarco.setVisible(true);
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

class MarcoBotones extends JFrame {
	public MarcoBotones() {
		setTitle("Botones y Eventos");
		setBounds(700, 300, 500, 300);		
		LaminaConBotones milamina = new LaminaConBotones();		
		add(milamina);
	}
}

class LaminaConBotones extends JPanel {
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	public LaminaConBotones() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		ColorFondo Azul = new ColorFondo(Color.BLUE);
		ColorFondo Amarillo = new ColorFondo(Color.YELLOW);		
		ColorFondo Rojo = new ColorFondo(Color.RED);
		
		botonAzul.addActionListener(Azul); // le decimos al button que desencadene un evento al hacer click
		botonAmarillo.addActionListener(Amarillo);
		botonRojo.addActionListener(Rojo);
	} 
	
	// EL objeto que recibirá el evento debe implementar la interfaz ActionListener
	// creo una clase interna para poder usar setBackground que pertenece a JPanel
	private class ColorFondo implements ActionListener {
		public ColorFondo(Color c) {
			colorDeFondo = c;
		}
		
		public void actionPerformed(ActionEvent e) {
			setBackground(colorDeFondo);
		}
		
		private Color colorDeFondo;
	}
	
}



