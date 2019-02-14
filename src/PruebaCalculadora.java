import javax.swing.*;
import javax.swing.border.Border;

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
		
		lblHistorial=new JLabel("1+1+1+1+1+1+1+1+1+1+1+1+1333333333333+1+1+1+1+1+1+2");
			lblHistorial.setFont(new Font("Times New Roman", 0, 15));
			lblHistorial.setBounds(10, 50, 370, 20);
			lblHistorial.setHorizontalAlignment(JLabel.RIGHT);
		add(lblHistorial);
		
		lblPantalla=new JLabel("0");
			lblPantalla.setFont(new Font("Arial", 0, 55));
			lblPantalla.setBounds(10, 80, 370, 50);
			lblPantalla.setHorizontalAlignment(JLabel.RIGHT);
		add(lblPantalla);
		
		btnPorcentaje=new JButton(" % ");
			btnPorcentaje.setFont(new Font("Arial", 0, 30));
			btnPorcentaje.setBounds(10, 180, 90, 60);
		add(btnPorcentaje);
		
		btnRaiz=new JButton(" √ ");
			btnRaiz.setFont(new Font("Arial", 0, 30));
			btnRaiz.setBounds(105, 180, 90, 60);
		add(btnRaiz);
	
		btnAlCuadrado=new JButton("x^2");
			btnAlCuadrado.setFont(new Font("Arial", 0, 30));
			btnAlCuadrado.setBounds(200, 180, 90, 60);
		add(btnAlCuadrado);
		
		btnUnoEntreX=new JButton("1/x");
			btnUnoEntreX.setFont(new Font("Arial", 0, 30));
			btnUnoEntreX.setBounds(295, 180, 90, 60);
		add(btnUnoEntreX);
		
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