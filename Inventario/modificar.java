import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class modificar extends JFrame implements ChangeListener,ActionListener,MouseListener,KeyListener{
	public JLabel titulo,codigo,salida;
	public JTextField[] respuesta=new JTextField[5];
	public JLabel[] elementos=new JLabel[7];
	public JCheckBox[] seleccionados=new JCheckBox[5];
	public JButton guardar;
	public String texto;
	public int posiciony,codigoabuscar;
	public int[] control=new int[5];
	public inicio temporal=new inicio();

	public modificar(int buscar){
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Modificar articulo");
		setFocusable(true);

		codigoabuscar=buscar;

		titulo=new JLabel("Seleccione los elementos a modificar (Ayuda)");
		titulo.setBounds(10,10,260,15);
		add(titulo);
		titulo.addMouseListener(this);

		for(int x=0,posiciony=0;x<7;x++){
			if(x==0) texto="Nombre:";
			if(x==1) texto="Descripcion:";
			if(x==2) texto="Cantidad:";
			if(x==3) texto="Unidad de medida (Kilogramos,cajas,unidades,etc):";
			if(x==4) texto="Fecha de ingreso:";
			if(x==5) texto="Fecha de salida:";
			if(x==6) texto="Codigo:";
			
			elementos[x]=new JLabel(texto);
			elementos[x].setBounds(10,posiciony=posiciony+40,300,30);
			add(elementos[x]);
		}

		for(int x=0,posiciony=0;x<5;x++){
			respuesta[x]=new JTextField();
			respuesta[x].setBounds(360,posiciony=posiciony+40,200,30);
			add(respuesta[x]);
			respuesta[x].setVisible(false);
		}

		for(int y=0,posiciony=0;y<5;y++){
			seleccionados[y]=new JCheckBox();
			seleccionados[y].setBounds(320,posiciony=posiciony+40,30,30);
			add(seleccionados[y]);
			seleccionados[y].addChangeListener(this);
		}		

		salida=new JLabel(temporal.articulos.getsalida(buscar) + " (este elemento no se puede modificar)");
		salida.setBounds(110,40*6,300,30);
		add(salida);
		codigo=new JLabel(temporal.articulos.getcodigo(buscar) + " (este elemento no se puede modificar)");
		codigo.setBounds(60,40*7,300,30);
		add(codigo);

		guardar=new JButton("Guardar cambios");
		guardar.setBounds(580,100,200,30);
		add(guardar);

		guardar.addActionListener(this);
		addKeyListener(this);
	}

	public void actionPerformed(ActionEvent click){
		int opcion,vacio=0;
		if(click.getSource()==guardar){
			opcion=JOptionPane.showConfirmDialog(guardar,"Estas seguro que desea guardar los cambios?\n"+"La informacion anterior se perdera");
			if(opcion==0){
				if(control[2]==0){
					if(respuesta[2].getText().equals("0") || respuesta[2].getText().equals("")){
						String nuevasalida=JOptionPane.showInputDialog("Como ya no hay elementos de este articulo en el sistema\n"+"inserte fecha de salida");
						temporal.articulos.setsalida(nuevasalida,codigoabuscar);
						if(respuesta[2].getText().equals("")){
							temporal.articulos.setcantidad("No hay existencia",codigoabuscar);
							vacio=1;
						}
					}
				}
				if(control[0]==0) temporal.articulos.setnombre(respuesta[0].getText(),codigoabuscar);
				if(control[1]==0) temporal.articulos.setdescripcion(respuesta[1].getText(),codigoabuscar);
				if(vacio==0) if(control[2]==0) temporal.articulos.setcantidad(respuesta[2].getText(),codigoabuscar);
				if(control[3]==0) temporal.articulos.setunidad(respuesta[3].getText(),codigoabuscar);
				if(control[4]==0) temporal.articulos.setingreso(respuesta[4].getText(),codigoabuscar);
				dispose();				
			}
		}
	}

	public void stateChanged(ChangeEvent elegido){
		for(int z=0;z<5;z++){
			if(seleccionados[z].isSelected()==true){respuesta[z].setVisible(true);control[z]=0;}
			else{
				control[z]=1;
				respuesta[z].setText("");
				respuesta[z].setVisible(false);
			}
		}
	}

	public void mouseEntered(MouseEvent cursor){
		JOptionPane mensajedeayuda=new JOptionPane();
		if(cursor.getSource()==titulo){
			mensajedeayuda.showMessageDialog(titulo,"Seleccione los elementos a modificar, deseleccione un elemento si no quiere o ya no quiere realizarle cambios");
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

	public static void main(String[] args) {
		modificar ventanamodificar=new modificar(0);
		ventanamodificar.setBounds(10,10,820,380);
		ventanamodificar.setVisible(true);
	}
}