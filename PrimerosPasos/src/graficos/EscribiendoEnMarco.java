package graficos;

import javax.swing.*;
import java.awt.*;

public class EscribiendoEnMarco {

	public static void main(String[] args) {
		MarcoConTexto mimarco = new MarcoConTexto();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}

class MarcoConTexto extends JFrame {
	public MarcoConTexto() {
		// aca en el constructor le defino visibilidad, tamaño, etc
		setVisible(true);
		setSize(600, 450);
		setLocation(400, 200);
		setTitle("Primer texto");
		
		Lamina milamina = new Lamina();
		add(milamina);
	}
}

// creacion de la lamina, esta va sobre el marco o lienzo
class Lamina extends JPanel {
	// sobre escribimos el metodo
	public void paintComponent(Graphics g) {
		// ademas debemos decirle que haga eso para lo que fue programado, con super
		super.paintComponent(g);  // invocamos paintComponent de la clase JComponent
		
		g.drawString("Estamos aprendiendo Swing", 100, 100);
	}
}