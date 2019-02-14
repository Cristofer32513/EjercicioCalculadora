import javax.swing.*;
import java.awt.*;

class Calculadora{
	
	public double porcentaje(){
		return 0.0;
	}
	
	public double raizCuadrada(){
		return 0.0;
	}
	
	public double alCuadrado(){
		return 0.0;
	}
	
	public double unoEntreX(){
		return 0.0;
	}
	
	public double suma(){
		return 0.0;
	}
	
	public double resta(){
		return 0.0;
	}
	
	public double multiplicacion(){
		return 0.0;
	}
	
	public double division(){
		return 0.0;
	}
}

class VentanaCalculadora extends JFrame {
	
	JLabel lblEstandar, lblHistorial, lblPantalla;
	JButton btnPorcentaje, btnRaiz, btnAlCuadrado, btnUnoEntreX, btnCE, btnC, btnBorrar,
		btnDividir, btnMultiplicar, btnRestar, btnSumar, btnIgual, btnPunto, btnMasMenos,
		btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	
	
	public VentanaCalculadora() {
		//Configuracon de la ventana
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Calculadora");
		setVisible(true);
		
		//Componentes
		lblEstandar=new JLabel("Estándar");
			lblEstandar.setFont(new Font("Times New Roman", 0, 30));
			lblEstandar.setBounds(20, 15, 120, 20);
		add(lblEstandar);
	}
	
	
}

public class PruebaCalculadora {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaCalculadora();
			}
		});
	}
}