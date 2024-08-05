import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class mostrar extends JFrame implements KeyListener{
	public JTextArea inventarioimp;
	public inicio temporal=new inicio();
	public String inventario;
	public JLabel titulo;
	public JScrollPane scroll;

	public mostrar(){
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Invenario completo");
		setFocusable(true);

		titulo=new JLabel("El inventario completo es: ");
		titulo.setBounds(10,10,200,30);
		add(titulo);

		for(int x=0;x<100;x++){
			if(temporal.articulos.getnombre(x)!=""){
				if(x==0) inventario="Nombre: " + temporal.articulos.getnombre(x) + "\n";
				else inventario=inventario + "Nombre: " + temporal.articulos.getnombre(x) + "\n";
				inventario=inventario + "Descripcion: " + temporal.articulos.getdescripcion(x) + "\n";
				inventario=inventario + "Cantidad: " + temporal.articulos.getcantidad(x) + "\n";
				inventario=inventario + "Unidad de medida: " + temporal.articulos.getunidad(x) + "\n";
				inventario=inventario + "Fecha de ingreso: " + temporal.articulos.getingreso(x) + "\n";
				inventario=inventario + "Fecha de salida: " + temporal.articulos.getsalida(x) + "\n";
				inventario=inventario + "Codigo: " + temporal.articulos.getcodigo(x) + "\n\n\n";
			}
		}
	
		inventarioimp=new JTextArea(inventario);
		scroll=new JScrollPane(inventarioimp);
		scroll.setBounds(10,50,500,500);
		getContentPane().add(scroll);
		addKeyListener(this);
	}

	public void keyPressed(KeyEvent teclado){
		int presionada=teclado.getKeyCode();

		if(presionada==27){
			System.exit(0);
		}
	}
	
	public void keyReleased(KeyEvent teclado){}	
	public void keyTyped(KeyEvent teclado){}

	public static void main(String[] args) {
		mostrar ventanamostrar=new mostrar();
		ventanamostrar.setBounds(10,10,540,600);
		ventanamostrar.setVisible(true);
	}
}