import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;

public class calculadora2 extends JFrame implements ActionListener{
	public JButton b0;
	public JButton b1;
	public JButton b2;
	public JButton b3;
	public JButton b4;
	public JButton b5;
	public JButton b6;
	public JButton b7;
	public JButton b8;
	public JButton b9;
	public JButton igual;
	public JButton limpiar;
	public JButton suma;
	public JButton resta;
	public JButton divi;
	public JButton multi;
	public JButton punto;
	public JButton ultimo;
	public JTextField pantalla;
	public Float n1;
	public Float n2;
	public int op=0;
	public Float total;
	public String imprimir;
	public String temp;

	public calculadora2(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		pantalla=new JTextField();
		pantalla.setBounds(20,5,290,40);
		add(pantalla);

		b1=new JButton("1");
		b1.setBounds(20,55,50,50);
		add(b1);
		b2=new JButton("2");
		b2.setBounds(80,55,50,50);
		add(b2);
		b3=new JButton("3");
		b3.setBounds(140,55,50,50);
		add(b3);
		suma=new JButton("+");
		suma.setBounds(200,55,50,50);
		add(suma);
		b4=new JButton("4");
		b4.setBounds(20,115,50,50);
		add(b4);
		b5=new JButton("5");
		b5.setBounds(80,115,50,50);
		add(b5);
		b6=new JButton("6");
		b6.setBounds(140,115,50,50);
		add(b6);
		resta=new JButton("-");
		resta.setBounds(200,115,50,50);
		add(resta);
		b7=new JButton("7");
		b7.setBounds(20,175,50,50);
		add(b7);
		b8=new JButton("8");
		b8.setBounds(80,175,50,50);
		add(b8);
		b9=new JButton("9");
		b9.setBounds(140,175,50,50);
		add(b9);
		divi=new JButton("/");
		divi.setBounds(260,55,50,50);
		add(divi);
		limpiar=new JButton("CE");
		limpiar.setBounds(20,235,50,50);
		add(limpiar);		
		b0=new JButton("0");
		b0.setBounds(80,235,50,50);
		add(b0);
		igual=new JButton("=");
		igual.setBounds(200,235,110,50);
		add(igual);
		multi=new JButton("x");
		multi.setBounds(260,115,50,50);
		add(multi);	
		punto=new JButton(".");
		punto.setBounds(200,175,50,50);
		add(punto);
		ultimo=new JButton("<~");
		ultimo.setBounds(140,235,50,50);
		add(ultimo);

		b0.addActionListener(this);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		suma.addActionListener(this);
		resta.addActionListener(this);
		divi.addActionListener(this);
		multi.addActionListener(this);
		igual.addActionListener(this);
		limpiar.addActionListener(this);
		punto.addActionListener(this);
		ultimo.addActionListener(this);
	}

	public void actionPerformed(ActionEvent click){
		if(click.getSource() == b0){
			pantalla.setText(pantalla.getText()+"0");
		}
		if(click.getSource() == b1){
			pantalla.setText(pantalla.getText()+"1");
		}
		if(click.getSource() == b2){
			pantalla.setText(pantalla.getText()+"2");
		}
		if(click.getSource() == b3){
			pantalla.setText(pantalla.getText()+"3");
		}
		if(click.getSource() == b4){
			pantalla.setText(pantalla.getText()+"4");
		}
		if(click.getSource() == b5){
			pantalla.setText(pantalla.getText()+"5");
		}
		if(click.getSource() == b6){
			pantalla.setText(pantalla.getText()+"6");
		}
		if(click.getSource() == b7){
			pantalla.setText(pantalla.getText()+"7");
		}
		if(click.getSource() == b8){
			pantalla.setText(pantalla.getText()+"8");
		}
		if(click.getSource() == b9){
			pantalla.setText(pantalla.getText()+"9");
		}
		if(click.getSource() == punto){
			pantalla.setText(pantalla.getText()+".");
		}
		if(click.getSource() == suma){
			n1=Float.parseFloat(pantalla.getText());
			pantalla.setText(pantalla.getText()+"+");
			op=1;
		}
		if(click.getSource() == resta){
			n1=Float.parseFloat(pantalla.getText());
			pantalla.setText(pantalla.getText()+"-");
			op=2;
		}
		if(click.getSource() == divi){
			n1=Float.parseFloat(pantalla.getText());
			pantalla.setText(pantalla.getText()+"/");
			op=3;
		}
		if(click.getSource() == multi){
			n1=Float.parseFloat(pantalla.getText());
			pantalla.setText(pantalla.getText()+"x");
			op=4;
		}
		if(click.getSource() == igual){
			if(op==1){
				temp=pantalla.getText();
				String[] parts=temp.split("\\+");
				temp=parts[1];
				n2=Float.parseFloat(temp);
				total=n1+n2;
				imprimir=Float.toString(total);
				pantalla.setText(imprimir);
			}
			if(op==2){
				temp=pantalla.getText();
				String[] parts=temp.split("\\-");
				temp=parts[1];
				n2=Float.parseFloat(temp);
				total=n1-n2;
				imprimir=Float.toString(total);
				pantalla.setText(imprimir);
			}
			if(op==3){
				temp=pantalla.getText();
				String[] parts=temp.split("\\/");
				temp=parts[1];
				n2=Float.parseFloat(temp);
				total=n1/n2;
				imprimir=Float.toString(total);
				pantalla.setText(imprimir);
			}
			if(op==4){
				temp=pantalla.getText();
				String[] parts=temp.split("x");
				temp=parts[1];
				n2=Float.parseFloat(temp);
				total=n1*n2;
				imprimir=Float.toString(total);
				pantalla.setText(imprimir);
			}
		}
		if(click.getSource()==limpiar){
			pantalla.setText(null);
		}
		if(click.getSource()==ultimo){
			pantalla.setText(pantalla.getText().replaceFirst(".$",""));
		}

	}


	public static void main(String[] args) {
		calculadora2 ventana=new calculadora2();
		ventana.setBounds(100,100,350,350);
		ventana.setVisible(true);
	}
}