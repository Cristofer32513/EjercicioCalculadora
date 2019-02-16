import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class VentanaCalculadora extends JFrame implements ActionListener {
	
	JLabel lblEstandar, lblHistorial;
	JTextField txtFPantalla;
	JButton btnPorcentaje, btnRaiz, btnAlCuadrado, btnUnoEntreX, btnCE, btnC, btnBorrar,
		btnDividir, btnMultiplicar, btnRestar, btnSumar, btnIgual, btnPunto, btnMasMenos,
		btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnMC, btnMR, btnMmas,
		btnMmenos, btnMS, btnMH;
	
	int operacionARealizar;
	double num1, num2, resultado;
	
	public VentanaCalculadora() {
		//Configuracon de la ventana
		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(390, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("Calculadora");
		setVisible(true);
		setBackground(new Color(222, 222, 222));
		
		//Componentes
		lblEstandar=new JLabel("Estándar");
			lblEstandar.setFont(new Font("Times New Roman", 0, 30));
			lblEstandar.setBounds(20, 15, 120, 20);
		add(lblEstandar);
		
		
		lblHistorial=new JLabel("");
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
			btnMC.setBackground(new Color(222, 222, 222));
		add(btnMC);
		
		
		btnMR=new JButton("MR");
			btnMR.setFont(new Font("Arial", 0, 14));
			btnMR.setBounds(68, 145, 58, 30);
			btnMR.setBackground(new Color(222, 222, 222));
		add(btnMR);
		
		
		btnMmas=new JButton("M+");
			btnMmas.setFont(new Font("Arial", 0, 14));
			btnMmas.setBounds(132, 145, 58, 30);
			btnMmas.setBackground(new Color(222, 222, 222));
		add(btnMmas);
		
		
		btnMmenos=new JButton("M-");
			btnMmenos.setFont(new Font("Arial", 0, 14));
			btnMmenos.setBounds(195, 145, 58, 30);
			btnMmenos.setBackground(new Color(222, 222, 222));
		add(btnMmenos);
		
		
		btnMS=new JButton("MS");
			btnMS.setFont(new Font("Arial", 0, 14));
			btnMS.setBounds(258, 145, 58, 30);
			btnMS.setBackground(new Color(222, 222, 222));
		add(btnMS);
		
		
		btnMH=new JButton("M^");
			btnMH.setFont(new Font("Arial", 0, 14));
			btnMH.setBounds(322, 145, 58, 30);
			btnMH.setBackground(new Color(222, 222, 222));
		add(btnMH);
			
		
		btnPorcentaje=new JButton("%");
			btnPorcentaje.setFont(new Font("Arial", 0, 30));
			btnPorcentaje.setBounds(5, 180, 90, 60);
			btnPorcentaje.setBackground(new Color(235, 235, 235));
			btnPorcentaje.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(lblHistorial.getText().length()==0)
						num1=1;
					else
						num1=Double.parseDouble(lblHistorial.getText());
					
					if(txtFPantalla.getText().length()==0)
						num2=1;
					else
						num2=Double.parseDouble(txtFPantalla.getText());
					
					resultado=1;
					resultado=resultado*num2;
					txtFPantalla.setText("0");
					lblHistorial.setText("");
					operacionARealizar=5;
				}
			});
		add(btnPorcentaje);
		
		
		btnRaiz=new JButton("\u221A");
			btnRaiz.setFont(new Font("Arial", 0, 30));
			btnRaiz.setBounds(100, 180, 90, 60);
			btnRaiz.setBackground(new Color(235, 235, 235));
			btnRaiz.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(txtFPantalla.getText());
					resultado=Math.sqrt(num1);
					txtFPantalla.setText(String.valueOf(resultado));
				}
			});
		add(btnRaiz);
	
		
		btnAlCuadrado=new JButton("x\u00B2");
			btnAlCuadrado.setFont(new Font("Arial", 0, 30));
			btnAlCuadrado.setBounds(195, 180, 90, 60);
			btnAlCuadrado.setBackground(new Color(235, 235, 235));
			btnAlCuadrado.addActionListener(new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(txtFPantalla.getText());
					resultado=Math.pow(num1, 2);
					txtFPantalla.setText(String.valueOf(resultado));
				}
			});
		add(btnAlCuadrado);
		
		
		btnUnoEntreX=new JButton("1/x");
			btnUnoEntreX.setFont(new Font("Arial", 0, 30));
			btnUnoEntreX.setBounds(290, 180, 90, 60);
			btnUnoEntreX.setBackground(new Color(235, 235, 235));
			btnUnoEntreX.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(txtFPantalla.getText());
					resultado=1/num1;
					txtFPantalla.setText(String.valueOf(resultado));
				}
			});
		add(btnUnoEntreX);
		
		
		btnCE=new JButton("CE");
			btnCE.setFont(new Font("Arial", 0, 30));
			btnCE.setBounds(5, 245, 90, 60);
			btnCE.setBackground(new Color(235, 235, 235));
			btnCE.addActionListener(this);
		add(btnCE);
		
		
		btnC=new JButton("C");
			btnC.setFont(new Font("Arial", 0, 30));
			btnC.setBounds(100, 245, 90, 60);
			btnC.setBackground(new Color(235, 235, 235));
			btnC.addActionListener(this);
		add(btnC);
	
		
		btnBorrar=new JButton("<-");
			btnBorrar.setFont(new Font("Arial", 0, 30));
			btnBorrar.setBounds(195, 245, 90, 60);
			btnBorrar.addActionListener(this);
			btnBorrar.setBackground(new Color(235, 235, 235));
		add(btnBorrar);
		
		
		btnDividir=new JButton("\u00F7");
			btnDividir.setFont(new Font("Arial", 0, 30));
			btnDividir.setBounds(290, 245, 90, 60);
			btnDividir.setBackground(new Color(235, 235, 235));
			btnDividir.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(lblHistorial.getText().length()==0)
						num1=1;
					else
						num1=Double.parseDouble(lblHistorial.getText());
					
					if(txtFPantalla.getText().length()==0)
						num2=1;
					else
						num2=Double.parseDouble(txtFPantalla.getText());
					
					resultado=1;
					resultado=resultado*num2;
					txtFPantalla.setText("0");
					lblHistorial.setText("");
					operacionARealizar=4;
				}
			});
		add(btnDividir);
		
		
		btn7=new JButton("7");
			btn7.setFont(new Font("Arial", 0, 30));
			btn7.setBounds(5, 310, 90, 60);
			btn7.addActionListener(this);
			btn7.setBackground(new Color(255, 255, 255));
		add(btn7);
		
		
		btn8=new JButton("8");
			btn8.setFont(new Font("Arial", 0, 30));
			btn8.setBounds(100, 310, 90, 60);
			btn8.addActionListener(this);
			btn8.setBackground(new Color(255, 255, 255));
		add(btn8);
	
		
		btn9=new JButton("9");
			btn9.setFont(new Font("Arial", 0, 30));
			btn9.setBounds(195, 310, 90, 60);
			btn9.addActionListener(this);
			btn9.setBackground(new Color(255, 255, 255));
		add(btn9);
		
		
		btnMultiplicar=new JButton("x");
			btnMultiplicar.setFont(new Font("Arial", 0, 30));
			btnMultiplicar.setBounds(290, 310, 90, 60);
			btnMultiplicar.setBackground(new Color(235, 235, 235));
			btnMultiplicar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(lblHistorial.getText().length()==0)
						num1=1;
					else
						num1=Double.parseDouble(lblHistorial.getText());
					
					if(txtFPantalla.getText().length()==0)
						num2=1;
					else
						num2=Double.parseDouble(txtFPantalla.getText());
					
					resultado=1;
					resultado=resultado*num2;
					txtFPantalla.setText("x");
					lblHistorial.setText("");
					operacionARealizar=3;
				}
			});
		add(btnMultiplicar);
		
		
		btn4=new JButton("4");
			btn4.setFont(new Font("Arial", 0, 30));
			btn4.setBounds(5, 375, 90, 60);
			btn4.addActionListener(this);
			btn4.setBackground(new Color(255, 255, 255));
		add(btn4);
		
		
		btn5=new JButton("5");
			btn5.setFont(new Font("Arial", 0, 30));
			btn5.setBounds(100, 375, 90, 60);
			btn5.addActionListener(this);
			btn5.setBackground(new Color(255, 255, 255));
		add(btn5);
	
		
		btn6=new JButton("6");
			btn6.setFont(new Font("Arial", 0, 30));
			btn6.setBounds(195, 375, 90, 60);
			btn6.addActionListener(this);
			btn6.setBackground(new Color(255, 255, 255));
		add(btn6);
		
		
		btnRestar=new JButton("-");
			btnRestar.setFont(new Font("Arial", 0, 30));
			btnRestar.setBounds(290, 375, 90, 60);
			btnRestar.setBackground(new Color(235, 235, 235));
			btnRestar.addActionListener(new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					if(lblHistorial.getText().equals("")) 
						num2=0;
					else
						num2=Double.parseDouble(lblHistorial.getText());
					
					num1=Double.parseDouble(txtFPantalla.getText());
					resultado=num1-num2;
					txtFPantalla.setText("-");
					lblHistorial.setText(String.valueOf(resultado));
					operacionARealizar=2;		
				}
			});
		add(btnRestar);
		
		
		btn1=new JButton("1");
			btn1.setFont(new Font("Arial", 0, 30));
			btn1.setBounds(5, 440, 90, 60);
			btn1.addActionListener(this);
			btn1.setBackground(new Color(255, 255, 255));
		add(btn1);
		
		
		btn2=new JButton("2");
			btn2.setFont(new Font("Arial", 0, 30));
			btn2.setBounds(100, 440, 90, 60);
			btn2.addActionListener(this);
			btn2.setBackground(new Color(255, 255, 255));
		add(btn2);
	
		
		btn3=new JButton("3");
			btn3.setFont(new Font("Arial", 0, 30));
			btn3.setBounds(195, 440, 90, 60);
			btn3.addActionListener(this);
			btn3.setBackground(new Color(255, 255, 255));
		add(btn3);
		
		
		btnSumar=new JButton("+");
			btnSumar.setFont(new Font("Arial", 0, 30));
			btnSumar.setBounds(290, 440, 90, 60);
			btnSumar.setBackground(new Color(235, 235, 235));
			btnSumar.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(lblHistorial.getText().equals(""))
						num2=0;
					else
						num2=Double.parseDouble(lblHistorial.getText());
					
					num1=Double.parseDouble(txtFPantalla.getText());
					resultado=num2+num1;
					txtFPantalla.setText("+");
					lblHistorial.setText(String.valueOf(resultado));
					operacionARealizar=1;
				}
			});
		add(btnSumar);
		
		
		btnMasMenos=new JButton("±");
			btnMasMenos.setFont(new Font("Arial", 0, 30));
			btnMasMenos.setBounds(5, 505, 90, 60);
			btnMasMenos.setBackground(new Color(235, 235, 235));
			btnMasMenos.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					num1=Double.parseDouble(txtFPantalla.getText());
					resultado=num1*(-1);
					txtFPantalla.setText(String.valueOf(resultado));
				}
			});
		add(btnMasMenos);
		
		
		btn0=new JButton("0");
			btn0.setFont(new Font("Arial", 0, 30));
			btn0.setBounds(100, 505, 90, 60);
			btn0.addActionListener(this);
			btn0.setBackground(new Color(255, 255, 255));
		add(btn0);
	
		
		btnPunto=new JButton(".");
			btnPunto.setFont(new Font("Arial", 0, 30));
			btnPunto.setBounds(195, 505, 90, 60);
			btnPunto.addActionListener(this);
			btnPunto.setBackground(new Color(235, 235, 235));
		add(btnPunto);
		
		
		btnIgual=new JButton("=");
			btnIgual.setFont(new Font("Arial", 0, 30));
			btnIgual.setBounds(290, 505, 90, 60);
			btnIgual.setBackground(new Color(235, 235, 235));
			btnIgual.addActionListener(new ActionListener() {	
				@Override
				public void actionPerformed(ActionEvent e) {
					num2=Double.parseDouble(txtFPantalla.getText());
					if(operacionARealizar==1)
						resultado=resultado+num2;
					else if(operacionARealizar == 2)
						resultado=resultado-num2;
					else if(operacionARealizar == 3)
						resultado=resultado*num2;
					else if(operacionARealizar == 4)
						resultado=resultado/num2;
					else if(operacionARealizar == 5)
						resultado=resultado*(num2/100);
					
					txtFPantalla.setText(String.valueOf(resultado));
					lblHistorial.setText("");
				}
			});
		add(btnIgual);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		//codigo numeros
		String cad = "";
		cad = cad + txtFPantalla.getText();
		
		if(e.getSource().equals(btn0)) {
			if(txtFPantalla.getText().equals("0") ) 
				txtFPantalla.setText("0");
			else 
				txtFPantalla.setText(cad+"0");
		}
		else if(e.getSource().equals(btn1)) {
			if(txtFPantalla.getText().equals("0")) 
				txtFPantalla.setText("1");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"1");
			}
			else 
				txtFPantalla.setText(cad+"1");
		}
		else if(e.getSource().equals(btn2)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("2");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"2");
			} 
			else
				txtFPantalla.setText(cad+"2");
		}
		else if(e.getSource().equals(btn3)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("3");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"3");
			}
			else
				txtFPantalla.setText(cad+"3");
		}
		else if(e.getSource().equals(btn4)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("4");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"4");
			}
			else
				txtFPantalla.setText(cad+"4");
		}
		else if(e.getSource().equals(btn5)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("5");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"5");
			}
			else
				txtFPantalla.setText(cad+"5");
		}
		else if(e.getSource().equals(btn6)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("6");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"6");
			}
			else
				txtFPantalla.setText(cad+"6");
		}
		else if(e.getSource().equals(btn7)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("7");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"7");
			}
			else
				txtFPantalla.setText(cad+"7");
		}
		else if(e.getSource().equals(btn8)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("8");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"8");
			}
			else
				txtFPantalla.setText(cad+"8");
		}
		else if(e.getSource().equals(btn9)) {
			if(txtFPantalla.getText().equals("0"))
				txtFPantalla.setText("9");
			else if(txtFPantalla.getText().equals("+") || txtFPantalla.getText().equals("-") || txtFPantalla.getText().equals("x") || txtFPantalla.getText().equals("\u00F7")) {
				cad = "";
				txtFPantalla.setText(cad+"9");
			}
			else
				txtFPantalla.setText(cad+"9");
		}
		if(e.getSource()==btnPunto){
			if(txtFPantalla.getText().length()==0)
				txtFPantalla.setText("0.");
			else{
				if(!txtFPantalla.getText().contains("."))
					txtFPantalla.setText(txtFPantalla.getText()+".");
			}
		}
		
		//codigo borrar
		if(e.getSource()==btnBorrar){
			if(txtFPantalla.getText().length()>1)
				txtFPantalla.setText(txtFPantalla.getText().substring(0, txtFPantalla.getText().length()-1));
			else
				txtFPantalla.setText("0");
		}
		
		//codigo C
		if(e.getSource()==btnC){
			txtFPantalla.setText("0");
			lblHistorial.setText("");
			resultado = 0.0;
		}
		
		//codigo CE
		if(e.getSource()==btnCE){
			txtFPantalla.setText("0");
			resultado = 0.0;
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