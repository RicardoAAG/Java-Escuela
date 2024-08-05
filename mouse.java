import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mouse extends JFrame implements MouseListener{
	public JLabel ayuda,datos;
	public JTextField nuevotitulo;
	public JTextArea escribir;

	public mouse(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Pruebas Mouse");
		setFocusable(true);

		ayuda=new JLabel("Ayuda");
		ayuda.setBounds(450,10,50,30);
		add(ayuda);

		datos=new JLabel("");
		datos.setBounds(60,210,400,30);
		add(datos);

		nuevotitulo=new JTextField();
		nuevotitulo.setBounds(10,10,100,30);
		add(nuevotitulo);

		escribir=new JTextArea();
		escribir.setBounds(10,50,500,150);
		add(escribir);

		ayuda.addMouseListener(this);
		addMouseListener(this);
		datos.addMouseListener(this);
	}

	public void mouseEntered(MouseEvent cursor){
		JOptionPane mensajedeayuda=new JOptionPane();
		if(cursor.getSource()==ayuda){
			mensajedeayuda.showMessageDialog(ayuda,"Acciones que puede realizar en la ventana: \n1. Escribir textos largos en el area de texto grande\n2. Hacer click izquierdo en cualquier parte de la ventana para cambiar el titulo a lo que tenga escrito en el espacio de texto peque\u00f1o\n3. Hacer click derecho en cualquier parte de la ventana para ver los datos del creador\n4. Hacer click con la rueda del raton en los datos del creador le preguntara si desea cerrar la ventana");
		}
	}

	public void mouseExited(MouseEvent cursor){}

	public void mousePressed(MouseEvent cursor){
		int codigomouse=0,opcion=10;
		System.out.println("Haz hecho " + cursor.getClickCount() +" click");		
		codigomouse=cursor.getModifiersEx();
		System.out.println(codigomouse);
		if(codigomouse==1024)
			setTitle(nuevotitulo.getText());
		if(codigomouse==4096)
			datos.setText("Esta ventana fue dise\u00f1ada por Ricardo Alexander Aguilar Gutierrez");
		if(codigomouse==2048 && cursor.getSource()==datos){
			opcion=JOptionPane.showConfirmDialog(datos,"Estas seguro que desea cerrar la ventana?");
			if(opcion==0){
				System.exit(0);
			}
		}
	}

	public void mouseReleased(MouseEvent cursor){}

	public void mouseClicked(MouseEvent cursor){}

	public static void main(String[] args) {
		mouse ventana=new mouse();
		ventana.setBounds(700,100,550,300);
		ventana.setVisible(true);
	}
}