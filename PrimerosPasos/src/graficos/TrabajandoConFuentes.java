package graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.SystemColor;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class TrabajandoConFuentes {

	public static void main(String[] args) {
		MarcoConFuente mimarco = new MarcoConFuente();
		
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}
}

class MarcoConFuente extends JFrame {
	public MarcoConFuente() {
		setTitle("Marco con fuente");
		setSize(400, 400);		
		LaminaConFuente milamina = new LaminaConFuente();		
		add(milamina);
		
		// definir el color principal de toda la lamina
		// milamina.setForeground(Color.BLUE);
		
	}
}

class LaminaConFuente extends JPanel {
	public void paintComponent(Graphics g) {
		super.paintComponents(g);
		
		Graphics2D g2 = (Graphics2D) g;
		
		Font mifuente = new Font("Georgia", Font.BOLD, 26);
		g2.setFont(mifuente);
		g2.setColor(Color.BLUE);
		g2.drawString("Facundo Luna", 100, 100);
		
		// también puedo instanciar la fuente en el metodo
		g2.setFont(new Font("Arial", Font.ITALIC, 24));
		g2.setColor(new Color(128, 90, 50).brighter());
		g2.drawString("Curso de Java", 100, 200);
	}
}
