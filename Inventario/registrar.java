import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class registrar extends JFrame implements ActionListener, MouseListener, KeyListener{
	public JTextField[] respuesta=new JTextField[7];
	public JLabel[] pregunta=new JLabel[7];
	public JLabel ayuda;
	public JButton guardar,salir;
	public String dato="";
	public int nuevo=0,codigo=0;
	public inicio temporal=new inicio();

	public registrar(){
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Registrar nuevo articulo");
		setFocusable(true);

		ayuda=new JLabel("Ayuda");
		ayuda.setBounds(10,5,100,30);
		add(ayuda);
		ayuda.addMouseListener(this);
		
		for(int x=0,posiciony=0;x<7;x++){
			if(x==0) dato="Nombre:";
			if(x==1) dato="Descripcion:";
			if(x==2) dato="Cantidad:";
			if(x==3) dato="Unidad de medida (Kilogramos,cajas,unidades,etc):";
			if(x==4) dato="Fecha de ingreso:";
			if(x==5) dato="Fecha de salida (No se registra) :";
			if(x==6) dato="Codigo (Asignado de forma automatica): ";
			
			pregunta[x]=new JLabel(dato);
			pregunta[x].setBounds(10,posiciony=posiciony+40,300,30);
			add(pregunta[x]);
		}

		for(int x=0,posiciony=0;x<7;x++){
			respuesta[x]=new JTextField();
			respuesta[x].setBounds(310,posiciony=posiciony+40,300,30);
			add(respuesta[x]);
			if(x==5) respuesta[5].setEditable(false);
			if(x==6){
				for(int y=0;y<100;y++){
					if(temporal.articulos.getcantidad(y)==""){
						String textoy=Integer.toString(y);
						respuesta[6].setText(textoy);
						nuevo=y;
						y=101;
						respuesta[6].setEditable(false);
					}
					if(y==99){
						respuesta[6].setText("Almacen lleno");
						respuesta[6].setEditable(false);
					}
				}
			}
		}

		guardar=new JButton("Guardar articulo");
		guardar.setBounds(80,330,200,30);
		add(guardar);
		salir=new JButton("Guardar articulo y cerrar");
		salir.setBounds(320,330,200,30);
		add(salir);


		guardar.addActionListener(this);
		salir.addActionListener(this);
		addKeyListener(this);
	}

	public void actionPerformed(ActionEvent click){
		if(click.getSource()==guardar){
			codigo=Integer.parseInt(respuesta[6].getText());
			temporal.articulos.setnombre(respuesta[0].getText(),codigo);
			temporal.articulos.setdescripcion(respuesta[1].getText(),codigo);
			temporal.articulos.setcantidad(respuesta[2].getText(),codigo);
			temporal.articulos.setunidad(respuesta[3].getText(),codigo);
			temporal.articulos.setsalida(respuesta[5].getText(),codigo);
			temporal.articulos.setingreso(respuesta[4].getText(),codigo);
			temporal.articulos.setcodigo(respuesta[6].getText(),codigo);
		}
		if(click.getSource()==salir){
			codigo=Integer.parseInt(respuesta[6].getText());
			temporal.articulos.setnombre(respuesta[0].getText(),codigo);
			temporal.articulos.setdescripcion(respuesta[1].getText(),codigo);
			temporal.articulos.setcantidad(respuesta[2].getText(),codigo);
			temporal.articulos.setunidad(respuesta[3].getText(),codigo);
			temporal.articulos.setsalida(respuesta[5].getText(),codigo);
			temporal.articulos.setingreso(respuesta[4].getText(),codigo);
			temporal.articulos.setcodigo(respuesta[6].getText(),codigo);
			dispose();			
		}
	}

	public void mouseEntered(MouseEvent cursor){
		JOptionPane mensajedeayuda=new JOptionPane();
		if(cursor.getSource()==ayuda){
			mensajedeayuda.showMessageDialog(ayuda,"En esta ventana usted puede registrar nuevos articulo llenando los espacios de texto con la informacion que desee");
		}
	}

	public void mouseExited(MouseEvent cursor){}
	public void mousePressed(MouseEvent cursor){}
	public void mouseReleased(MouseEvent cursor){}
	public void mouseClicked(MouseEvent cursor){}

	public void keyPressed(KeyEvent teclado){
		int presionada=teclado.getKeyCode();

		if(presionada==27){
			System.exit(0);
		}
	}
	
	public void keyReleased(KeyEvent teclado){}	
	public void keyTyped(KeyEvent teclado){}

	public static void main(String[] args){
		registrar ventanaregistrar=new registrar();
		ventanaregistrar.setBounds(10,10,650,430);
		ventanaregistrar.setVisible(true);
	}
}