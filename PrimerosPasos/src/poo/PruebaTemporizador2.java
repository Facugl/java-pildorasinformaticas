package poo;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import java.awt.Toolkit;

public class PruebaTemporizador2 {

	public static void main(String[] args) {
		Reloj mireloj = new Reloj();
		mireloj.enMarcha(3000, true); // Ahora paso los argumentos aca y no en el constructor de Reloj
		JOptionPane.showMessageDialog(null, "Pulsa Aceptar para detener");
	}

}

class Reloj {
	
	// También podemos prescinder del constructor, ya no tendremos usas variables declaradas
	/* public Reloj(int intervalo, boolean sonido) {
		this.intervalo = intervalo;
		this.sonido = sonido;
	} */
	
	// Otra ventaja, en lugar de variables puedo pasar parametros directamente, declarados como final
	public void enMarcha(int intervalo, final boolean sonido) {  
		// Clase interna local, se debe ejecutar una unica vez
		class DameLaHora2 implements ActionListener {
			public void actionPerformed(ActionEvent evento) {
				Date ahora = new Date();
				System.out.println("Te muestro la hora cada 3 segundos: " + ahora);
				// sonido no esta definido dentro de la clase interna, pero puedo acceder a ella sin crear geters y seters
				if (sonido) {
					Toolkit.getDefaultToolkit().beep();
				}
				
			}
		}
		
		ActionListener oyente = new DameLaHora2();
		Timer mitemporizador = new Timer(intervalo, oyente);
		mitemporizador.start();
	}	
}
 