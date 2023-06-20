package graficos;

import javax.swing.*;
import java.awt.event.*;

public class Eventos_Ventana {

	public static void main(String[] args) {
		MarcoVentana mimarco = new MarcoVentana();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // se cierran todas

		MarcoVentana mimarco2 = new MarcoVentana();
		mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // se cierra ventana 2, las demas quedan
	
		mimarco.setTitle("Ventana 1");
		mimarco2.setTitle("Ventana 2");
		
		mimarco.setBounds(300, 300, 500, 350);
		mimarco2.setBounds(900, 300, 500, 350);
	}

}


class MarcoVentana extends JFrame {
	public MarcoVentana() {
		// setTitle("Respondiendo");
		// setBounds(300, 300, 500, 350);
		setVisible(true);
				
		// M_Ventana oyente_ventana = new M_Ventana();
		// addWindowListener(oyente_ventana); // pongo a la escucha de alguna evento de tipo ventana
	
		// puedo simplificar mas el código, por ejemplo no es necesario que cree una instancia
		addWindowListener(new M_Ventana());
	}
}

/*
class M_Ventana implements WindowListener {
	public void windowActivated(WindowEvent e) {
		System.out.println("Ventana activada");
	}
	public void windowClosed(WindowEvent e) {
		// cuando la ventana se cierra, ojo que si el programa termina al cerrar la ventana, no dará tiempo a que suceda
		System.out.println("La ventana ha sido cerrada");
	}
	public void windowClosing(WindowEvent e) {
		System.out.println("Cerrando ventana");
	}
	public void windowDeactivated(WindowEvent e) {
		System.out.println("Ventana desactivada");
	}
	public void windowDeiconified(WindowEvent e) {
		// cuando la ventana se restaura
		System.out.println("Ventana restaurada");
	}
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
	public void windowOpened(WindowEvent e) {
		System.out.println("Ventana abierta");
	}
}
*/

// La Interfaz me obliga a implementar metodos que no utilizaré
// En su lugar puedo usar una clase adaptadora, la ya implementa dicha interfaz entonces puedo sobre escribir alguno de sus metodos
class M_Ventana extends WindowAdapter {
	public void windowIconified(WindowEvent e) {
		System.out.println("Ventana minimizada");
	}
}
