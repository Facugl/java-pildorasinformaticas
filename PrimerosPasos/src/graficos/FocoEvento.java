package graficos;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.*;

public class FocoEvento {

	public static void main(String[] args) {
		MarcoFoco mimarco = new MarcoFoco();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoFoco extends JFrame {
	public MarcoFoco() {
		setVisible(true);
		setBounds(300, 300, 600, 450);
		add(new LaminaFoco());
	}
}

class LaminaFoco extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// invalido el layout, por defecto Java los acomoda
		setLayout(null);
		
		cuadro1 = new JTextField(); // las instancio aca y estan declaradas fuera para que no tengan un ambito local
		cuadro2 = new JTextField();
		
		// como desactive el autolayout, les ubico
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);
		
		add(cuadro1);
		add(cuadro2);
		
		// y como siempre, comenzamos creado una instancia de la clase oyente
		LanzaFocos elFoco = new LanzaFocos();
		cuadro1.addFocusListener(elFoco); // y ponemos al cuadro1 a la escucha
	}
	
	// creo una clase interna, porque LanzaFocos debe utilizar cuador1 y cuadro2
	class LanzaFocos implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void focusLost(FocusEvent e) {
			// System.out.println("Has perdido el foco");
			
			String email = cuadro1.getText();
			
			boolean comprobacion = false;
			
			for (int i = 0; i < email.length(); i++) {
				if (email.charAt(i) == '@') {
					comprobacion = true;
				}
			}
			
			if (comprobacion) {
				System.out.println("Correcto");
			} else {
				System.out.println("Incorrecto");
			}
		}
		
	}	
	
	// construyo dos cuadros de texto
	JTextField cuadro1; // las declaro fuera porque accedere a ellas desde otros metodos diferentes de paintComponent
	JTextField cuadro2;
}


