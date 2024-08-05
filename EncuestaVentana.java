import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;

public class EncuestaVentana extends JFrame implements ActionListener{
	public JLabel nom,dom,email;
	public JButton act,cerrar;
	public JTextField cnom,cdom,cemail;

	public EncuestaVentana(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		cnom=new JTextField();
		cnom.setBounds(20,20,100,20);
		add(cnom);
		cemail=new JTextField();
		cemail.setBounds(20,50,100,20);
		add(cemail);
		cdom=new JTextField();
		cdom.setBounds(20,80,100,20);
		add(cdom);

		act=new JButton("Actualizar");
		act.setBounds(25,125,100,20);
		add(act);
		cerrar=new JButton("Cerrar");
		cerrar.setBounds(150,125,100,20);
		add(cerrar);

		nom=new JLabel();
		nom.setBounds(140,20,250,20);
		add(nom);
		email=new JLabel();
		email.setBounds(140,50,250,20);
		add(email);
		dom=new JLabel();
		dom.setBounds(140,80,250,20);
		add(dom);

		act.addActionListener(this);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == act){
			nom.setText(cnom.getText());
			email.setText(cemail.getText());
			dom.setText(cdom.getText());
		}
		if(accion.getSource() == cerrar){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		EncuestaVentana ventana=new EncuestaVentana();
		ventana.setBounds(350,200,450,250);
		ventana.setVisible(true);
	}
}