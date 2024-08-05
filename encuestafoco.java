import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class encuestafoco extends JFrame implements ActionListener,FocusListener,KeyListener{
	public JLabel nom,dom,email,identificador[]=new JLabel[3];
	public JButton act,cerrar;
	public JTextField cnom,cdom,cemail;
	public int controlimprimirmensaje=0,controlrepeticion=0;

	public encuestafoco(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Encuesta");
		setFocusable(true);

		identificador[0]=new JLabel("Nombre");
		identificador[0].setBounds(20,20,100,20);
		add(identificador[0]);
		identificador[1]=new JLabel("Domicilio");
		identificador[1].setBounds(20,50,100,20);
		add(identificador[1]);
		identificador[2]=new JLabel("Email");
		identificador[2].setBounds(20,80,100,20);
		add(identificador[2]);


		cnom=new JTextField();
		cnom.setBounds(80,20,100,20);
		add(cnom);
		cemail=new JTextField();
		cemail.setBounds(80,50,100,20);
		add(cemail);
		cdom=new JTextField();
		cdom.setBounds(80,80,100,20);
		add(cdom);

		act=new JButton("Actualizar");
		act.setBounds(25,125,100,20);
		add(act);
		cerrar=new JButton("Cerrar");
		cerrar.setBounds(150,125,100,20);
		add(cerrar);

		nom=new JLabel();
		nom.setBounds(200,20,250,20);
		add(nom);
		email=new JLabel();
		email.setBounds(200,50,250,20);
		add(email);
		dom=new JLabel();
		dom.setBounds(200,80,250,20);
		add(dom);

		act.addActionListener(this);
		cerrar.addActionListener(this);
		cnom.addFocusListener(this);
		addKeyListener(this);
		nom.addKeyListener(this);
		email.addKeyListener(this);
		dom.addKeyListener(this);
		cnom.addKeyListener(this);
		cemail.addKeyListener(this);
		cdom.addKeyListener(this);
	}

	public void revisarnombre(){
		String nombrerevisar=cnom.getText();

		for(int x=0;x<nombrerevisar.length();x++){
			if(!Character.isLowerCase(nombrerevisar.charAt(x))){
				if(!Character.isUpperCase(nombrerevisar.charAt(x))){
					if(!Character.isSpaceChar(nombrerevisar.charAt(x)))
						controlimprimirmensaje=1;
				}
			}
		}
		if(controlimprimirmensaje!=0){
			JOptionPane.showMessageDialog(null,"Su nombre solo puede llevar letras y espacios, favor de cambiarlo");
		}
	}

	public void keyPressed(KeyEvent teclado){
		int presionada=teclado.getKeyCode();
		
		if(presionada==10){
			controlrepeticion=1;
			revisarnombre();
			email.setText(cemail.getText());
			dom.setText(cdom.getText());
			if(controlimprimirmensaje==0){
				nom.setText(cnom.getText());
			}else{
				nom.setText("Nombre invalido, favor de cambiarlo");
			}
		}
	}
	public void keyReleased(KeyEvent teclado){}	
	public void keyTyped(KeyEvent teclado){}

	public void focusLost(FocusEvent ojo){
		if(controlrepeticion==0)
		revisarnombre();
	}

	public void focusGained(FocusEvent ojo){
		controlimprimirmensaje=0;
		controlrepeticion=0;
	}

	public void actionPerformed(ActionEvent accion){
		if(accion.getSource() == act){
			if(controlimprimirmensaje==0){
				nom.setText(cnom.getText());
			}else{
				nom.setText("Nombre invalido, favor de cambiarlo");
			}
			email.setText(cemail.getText());
			dom.setText(cdom.getText());
		}
		if(accion.getSource() == cerrar){
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		encuestafoco ventana=new encuestafoco();
		ventana.setBounds(350,200,450,250);
		ventana.setVisible(true);
	}
}