package poo;

import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;

public class PruebaTemporizador {
	public static void main(String[] args) {		
		DameLaHora oyente = new DameLaHora();
		Timer mitemporizador = new Timer(5000, oyente);
		mitemporizador.start();
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
		// La siguiente expresion detiene la ejecucion
		System.exit(0);
	}
}

class DameLaHora implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		Date ahora = new Date();
		System.out.println("Te muestro la hora cada 5 segundos: " + ahora);
		Toolkit.getDefaultToolkit().beep();
	}
}
