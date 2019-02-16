import javax.swing.*;
import javax.swing.tree.ExpandVetoException;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.PasswordAuthentication;

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

@SuppressWarnings("serial")
class VentanaCalculadora extends JFrame implements ActionListener {
	
	JLabel lblEstandar, lblHistorial;
	JTextField txtFPantalla;
	JButton btnPorcentaje, btnRaiz, btnAlCuadrado, btnUnoEntreX, btnCE, btnC, btnBorrar,
		btnDividir, btnMultiplicar, btnRestar, btnSumar, btnIgual, btnPunto, btnMasMenos,
		btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;
	JButton btnMC, btnMR, btnMmas, btnMmenos, btnMS, btnMH;
	
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
		
		
		lblHistorial=new JLabel("1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+1+2");
			lblHistorial.setFont(new Font("Times New Roman", 0, 15));
			lblHistorial.setBounds(5, 45, 370, 20);
			lblHistorial.setHorizontalAlignment(JLabel.RIGHT);
		add(lblHistorial);
		
		
		txtFPantalla=new JTextField("0");
			txtFPantalla.setFont(new Font("Arial", 0, 55));
			txtFPantalla.setBounds(5, 65, 370, 60);
			txtFPantalla.setBorder(null);
			txtFPantalla.setEditable(false);
			txtFPantalla.setHorizontalAlignment(JTextField.RIGHT);
		add(txtFPantalla);
		
		
		btnMC=new JButton("MC");
			btnMC.setFont(new Font("Arial", 0, 14));
			btnMC.setBounds(5, 145, 58, 30);
		add(btnMC);
		
		
		btnMR=new JButton("MR");
			btnMR.setFont(new Font("Arial", 0, 14));
			btnMR.setBounds(68, 145, 58, 30);
		add(btnMR);
		
		
		btnMmas=new JButton("M+");
			btnMmas.setFont(new Font("Arial", 0, 14));
			btnMmas.setBounds(132, 145, 58, 30);
		add(btnMmas);
		
		
		btnMmenos=new JButton("M-");
			btnMmenos.setFont(new Font("Arial", 0, 14));
			btnMmenos.setBounds(195, 145, 58, 30);
		add(btnMmenos);
		
		
		btnMS=new JButton("MS");
			btnMS.setFont(new Font("Arial", 0, 14));
			btnMS.setBounds(258, 145, 58, 30);
		add(btnMS);
		
		
		btnMH=new JButton("M^");
			btnMH.setFont(new Font("Arial", 0, 14));
			btnMH.setBounds(322, 145, 58, 30);
		add(btnMH);
			
		
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
			btnBorrar.addActionListener(this);
		add(btnBorrar);
		
		
		btnDividir=new JButton("/");
			btnDividir.setFont(new Font("Arial", 0, 30));
			btnDividir.setBounds(290, 245, 90, 60);
		add(btnDividir);
		
		
		btn7=new JButton("7");
			btn7.setFont(new Font("Arial", 0, 30));
			btn7.setBounds(5, 310, 90, 60);
			btn7.addActionListener(this);
		add(btn7);
		
		
		btn8=new JButton("8");
			btn8.setFont(new Font("Arial", 0, 30));
			btn8.setBounds(100, 310, 90, 60);
			btn8.addActionListener(this);
		add(btn8);
	
		
		btn9=new JButton("9");
			btn9.setFont(new Font("Arial", 0, 30));
			btn9.setBounds(195, 310, 90, 60);
			btn9.addActionListener(this);
		add(btn9);
		
		
		btnMultiplicar=new JButton("*");
			btnMultiplicar.setFont(new Font("Arial", 0, 30));
			btnMultiplicar.setBounds(290, 310, 90, 60);
		add(btnMultiplicar);
		
		
		btn4=new JButton("4");
			btn4.setFont(new Font("Arial", 0, 30));
			btn4.setBounds(5, 375, 90, 60);
			btn4.addActionListener(this);
		add(btn4);
		
		
		btn5=new JButton("5");
			btn5.setFont(new Font("Arial", 0, 30));
			btn5.setBounds(100, 375, 90, 60);
			btn5.addActionListener(this);
		add(btn5);
	
		
		btn6=new JButton("6");
			btn6.setFont(new Font("Arial", 0, 30));
			btn6.setBounds(195, 375, 90, 60);
			btn6.addActionListener(this);
		add(btn6);
		
		
		btnRestar=new JButton("-");
			btnRestar.setFont(new Font("Arial", 0, 30));
			btnRestar.setBounds(290, 375, 90, 60);
		add(btnRestar);
		
		
		btn1=new JButton("1");
			btn1.setFont(new Font("Arial", 0, 30));
			btn1.setBounds(5, 440, 90, 60);
			btn1.addActionListener(this);
		add(btn1);
		
		
		btn2=new JButton("2");
			btn2.setFont(new Font("Arial", 0, 30));
			btn2.setBounds(100, 440, 90, 60);
			btn2.addActionListener(this);
		add(btn2);
	
		
		btn3=new JButton("3");
			btn3.setFont(new Font("Arial", 0, 30));
			btn3.setBounds(195, 440, 90, 60);
			btn3.addActionListener(this);
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
			btn0.addActionListener(this);
		add(btn0);
	
		
		btnPunto=new JButton(".");
			btnPunto.setFont(new Font("Arial", 0, 30));
			btnPunto.setBounds(195, 505, 90, 60);
			btnPunto.addActionListener(this);
		add(btnPunto);
		
		
		btnIgual=new JButton("=");
			btnIgual.setFont(new Font("Arial", 0, 30));
			btnIgual.setBounds(290, 505, 90, 60);
		add(btnIgual);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//codigo numeros
		if(txtFPantalla.getText().equals("0")){
			if(e.getSource()==btn0)
				txtFPantalla.setText("0");
			else if(e.getSource()==btn1)
				txtFPantalla.setText("1");
			else if(e.getSource()==btn2)
				txtFPantalla.setText("2");
			else if(e.getSource()==btn3)
				txtFPantalla.setText("3");
			else if(e.getSource()==btn4)
				txtFPantalla.setText("4");
			else if(e.getSource()==btn5)
				txtFPantalla.setText("5");
			else if(e.getSource()==btn6)
				txtFPantalla.setText("6");
			else if(e.getSource()==btn7)
				txtFPantalla.setText("7");
			else if(e.getSource()==btn8)
				txtFPantalla.setText("8");
			else if(e.getSource()==btn9)
				txtFPantalla.setText("9");
		}
		else{
			if(e.getSource()==btn0)
				txtFPantalla.setText(txtFPantalla.getText()+"0");
			else if(e.getSource()==btn1)
				txtFPantalla.setText(txtFPantalla.getText()+"1");
			else if(e.getSource()==btn2)
				txtFPantalla.setText(txtFPantalla.getText()+"2");
			else if(e.getSource()==btn3)
				txtFPantalla.setText(txtFPantalla.getText()+"3");
			else if(e.getSource()==btn4)
				txtFPantalla.setText(txtFPantalla.getText()+"4");
			else if(e.getSource()==btn5)
				txtFPantalla.setText(txtFPantalla.getText()+"5");
			else if(e.getSource()==btn6)
				txtFPantalla.setText(txtFPantalla.getText()+"6");
			else if(e.getSource()==btn7)
				txtFPantalla.setText(txtFPantalla.getText()+"7");
			else if(e.getSource()==btn8)
				txtFPantalla.setText(txtFPantalla.getText()+"8");
			else if(e.getSource()==btn9)
				txtFPantalla.setText(txtFPantalla.getText()+"9");
		}
		if(e.getSource()==btnPunto){
			if(txtFPantalla.getText().length()==0)
				txtFPantalla.setText("0.");
			else{
				if(!txtFPantalla.getText().contains(".")){
					txtFPantalla.setText(txtFPantalla.getText()+".");
				}
			}
		}
		//codigo borrar
		if(e.getSource()==btnBorrar){
			if(txtFPantalla.getText().length()>1)
				txtFPantalla.setText(txtFPantalla.getText().substring(0, txtFPantalla.getText().length()-1));
			else
				txtFPantalla.setText("0");
		}
		
		
		
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