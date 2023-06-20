package graficos;

import java.awt.event.*;

import javax.swing.JFrame;

public class Eventos_Raton {

	public static void main(String[] args) {
		MarcoRaton mimarco = new MarcoRaton();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MarcoRaton extends JFrame {
	public MarcoRaton() {
		setVisible(true);
		setBounds(700, 300, 600, 450);
		
		// ponemos el marco a la escucha del evento
		EventosDeRaton EventoRaton = new EventosDeRaton();
		// addMouseListener(EventoRaton);
		// para eventos tipo darg no uso el metodo de arriba sino el de abajo
		addMouseMotionListener(EventoRaton);
	}
}

//La interfaz me obliga a implementar TODOS sus metodos
	/*
class EventosDeRaton implements MouseListener {
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Has hecho click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("Acabas de presionar");
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("Acabas de levantar");		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Acabas de entrar");
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Acabas de salir");
		
	}	
}
*/

// usando una clase adaptadora y en ese caso solo sobre escribimos el metodo que necesitamos


// class EventosDeRaton extends MouseAdapter {
	/*
	public void mouseClicked(MouseEvent e) {
		// System.out.println("Has hecho click papu");
		// System.out.println("Coordenada X: " + e.getX() + "Coordenada Y: " + e.getY());
		System.out.println(e.getClickCount());
	}
	*/
	
/*
	public void mousePressed(MouseEvent e) {
		// click izquierdp: 1024, click derecho: 4096, rueda hacia abajo: 2048
		// System.out.println(e.getModifiersEx());
		
		if (e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			System.out.println("Has pulsado el boton izquierdo");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON2_DOWN_MASK) {
			System.out.println("Has pulsado la rueda del raton");
		} else if (e.getModifiersEx() == MouseEvent.BUTTON3_DOWN_MASK) {
			System.out.println("Has pulsado el boton derecho");
		}
	}
	*/
// }


class EventosDeRaton implements MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Estas arrastrando el mouse");
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("Has movido el mouse");		
	}
	
}