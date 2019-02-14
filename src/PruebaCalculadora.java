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
	
	JLabel lblEstandar, lblHistorial;
	JTextField txtFPantalla;
	JButton btnPorcentaje, btnRaiz, btnAlCuadrado, btnUnoEntreX, btnCE, btnC, btnBorrar,
		btnDividir, btnMultiplicar, btnRestar, btnSumar, btnIgual, btnPunto, btnMasMenos,
		btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	
	
	public VentanaCalculadora() {
		//Configuracon de la ventana
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(390, 600);
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
			lblHistorial.setBounds(5, 50, 370, 20);
			lblHistorial.setHorizontalAlignment(JLabel.RIGHT);
		add(lblHistorial);
		
		txtFPantalla=new JTextField("0");
			txtFPantalla.setFont(new Font("Arial", 0, 55));
			txtFPantalla.setBounds(5, 80, 370, 50);
			txtFPantalla.setBorder(null);
			txtFPantalla.setBackground(null);
			txtFPantalla.setEditable(false);
			txtFPantalla.setHorizontalAlignment(JTextField.RIGHT);
		add(txtFPantalla);
		
		btnPorcentaje=new JButton("%");
			btnPorcentaje.setFont(new Font("Arial", 0, 30));
			btnPorcentaje.setBounds(5, 180, 90, 60);
		add(btnPorcentaje);
		
		btnRaiz=new JButton("√");
			btnRaiz.setFont(new Font("Arial", 0, 30));
			btnRaiz.setBounds(100, 180, 90, 60);
		add(btnRaiz);
	
		btnAlCuadrado=new JButton("x^2");
			btnAlCuadrado.setFont(new Font("Arial", 0, 30));
			btnAlCuadrado.setBounds(195, 180, 90, 60);
		add(btnAlCuadrado);
		
		btnUnoEntreX=new JButton("1/x");
			btnUnoEntreX.setFont(new Font("Arial", 0, 30));
			btnUnoEntreX.setBounds(290, 180, 90, 60);
		add(btnUnoEntreX);
		
		btnCE=new JButton("CE");
			btnCE.setFont(new Font("Arial", 0, 30));
			btnCE.setBounds(5, 245, 90, 60);
		add(btnCE);
		
		btnC=new JButton("C");
			btnC.setFont(new Font("Arial", 0, 30));
			btnC.setBounds(100, 245, 90, 60);
		add(btnC);
	
		btnBorrar=new JButton("<-");
			btnBorrar.setFont(new Font("Arial", 0, 30));
			btnBorrar.setBounds(195, 245, 90, 60);
		add(btnBorrar);
		
		btnDividir=new JButton("/");
			btnDividir.setFont(new Font("Arial", 0, 30));
			btnDividir.setBounds(290, 245, 90, 60);
		add(btnDividir);
		
		btn7=new JButton("7");
			btn7.setFont(new Font("Arial", 0, 30));
			btn7.setBounds(5, 310, 90, 60);
		add(btn7);
		
		btn8=new JButton("8");
			btn8.setFont(new Font("Arial", 0, 30));
			btn8.setBounds(100, 310, 90, 60);
		add(btn8);
	
		btn9=new JButton("9");
			btn9.setFont(new Font("Arial", 0, 30));
			btn9.setBounds(195, 310, 90, 60);
		add(btn9);
		
		btnMultiplicar=new JButton("*");
			btnMultiplicar.setFont(new Font("Arial", 0, 30));
			btnMultiplicar.setBounds(290, 310, 90, 60);
		add(btnMultiplicar);
		
		btn4=new JButton("4");
			btn4.setFont(new Font("Arial", 0, 30));
			btn4.setBounds(5, 375, 90, 60);
		add(btn4);
		
		btn5=new JButton("5");
			btn5.setFont(new Font("Arial", 0, 30));
			btn5.setBounds(100, 375, 90, 60);
		add(btn5);
	
		btn6=new JButton("6");
			btn6.setFont(new Font("Arial", 0, 30));
			btn6.setBounds(195, 375, 90, 60);
		add(btn6);
		
		btnRestar=new JButton("-");
			btnRestar.setFont(new Font("Arial", 0, 30));
			btnRestar.setBounds(290, 375, 90, 60);
		add(btnRestar);
		
		btn1=new JButton("1");
			btn1.setFont(new Font("Arial", 0, 30));
			btn1.setBounds(5, 440, 90, 60);
		add(btn1);
		
		btn2=new JButton("2");
			btn2.setFont(new Font("Arial", 0, 30));
			btn2.setBounds(100, 440, 90, 60);
		add(btn2);
	
		btn3=new JButton("3");
			btn3.setFont(new Font("Arial", 0, 30));
			btn3.setBounds(195, 440, 90, 60);
		add(btn3);
		
		btnSumar=new JButton("+");
			btnSumar.setFont(new Font("Arial", 0, 30));
			btnSumar.setBounds(290, 440, 90, 60);
		add(btnSumar);
		
		btnMasMenos=new JButton("±");
			btnMasMenos.setFont(new Font("Arial", 0, 30));
			btnMasMenos.setBounds(5, 505, 90, 60);
		add(btnMasMenos);
		
		btn0=new JButton("0");
			btn0.setFont(new Font("Arial", 0, 30));
			btn0.setBounds(100, 505, 90, 60);
		add(btn0);
	
		btnPunto=new JButton(".");
			btnPunto.setFont(new Font("Arial", 0, 30));
			btnPunto.setBounds(195, 505, 90, 60);
		add(btnPunto);
		
		btnIgual=new JButton("=");
			btnIgual.setFont(new Font("Arial", 0, 30));
			btnIgual.setBounds(290, 505, 90, 60);
		add(btnIgual);
		
		
	}
}

public class PruebaCalculadora {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaCalculadora();
			}
		});
	}
}