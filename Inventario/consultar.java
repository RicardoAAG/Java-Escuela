import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class consultar extends JFrame implements ActionListener,KeyListener{
	public JLabel[] dato=new JLabel[7];
	public JLabel estado;
	public JMenuBar barra;
	public JMenu otrasacciones;
	public JMenuItem modificar,eliminar;
	public int codigoabuscar,prueba=0,control=0;
	public inicio temporal=new inicio();

	public void getFrame(){
		consultar ventanaconsultar=new consultar(codigoabuscar);
		ventanaconsultar.setBounds(10,10,300,320);
		ventanaconsultar.setVisible(true);
	}

	public consultar(int buscar){
		setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setTitle("Consultar, modificar y eliminar articulos");
		setFocusable(true);	

		estado=new JLabel("");
		estado.setBounds(30,10,300,30);
		add(estado);
		if(temporal.articulos.getcantidad(buscar)=="") estado.setText("Este articulo no existe o fue eliminado");

		codigoabuscar=buscar;
		
		barra=new JMenuBar();
		setJMenuBar(barra);
		
		otrasacciones=new JMenu("Otras acciones a realizar con este articulo");
		barra.add(otrasacciones);

		modificar=new JMenuItem("Modificar articulo");
		otrasacciones.add(modificar);
		eliminar=new JMenuItem("Eliminar articulo");
		otrasacciones.add(eliminar);
		for(int x=0,posiciony=10;x<7;x++){
			if(x==0) dato[x]=new JLabel("Nombre: "+temporal.articulos.getnombre(buscar));
			if(x==1) dato[x]=new JLabel("Descripcion: "+temporal.articulos.getdescripcion(buscar));
			if(x==2) dato[x]=new JLabel("Cantidad: "+temporal.articulos.getcantidad(buscar));
			if(x==3) dato[x]=new JLabel("Unidad de medida: "+temporal.articulos.getunidad(buscar));
			if(x==4) dato[x]=new JLabel("Fecha de ingreso: "+temporal.articulos.getingreso(buscar));
			if(x==5) dato[x]=new JLabel("Fecha de salida: "+temporal.articulos.getsalida(buscar));
			if(x==6) dato[x]=new JLabel("Codigo: "+temporal.articulos.getcodigo(buscar));
			dato[x].setBounds(10,posiciony=posiciony+30,500,30);
			add(dato[x]);
		}

		modificar.addActionListener(this);
		eliminar.addActionListener(this);
		addKeyListener(this);
	}

	public void actionPerformed(ActionEvent click){
		int opcion;
		if(click.getSource()==modificar){
			modificar ventanamodificar=new modificar(codigoabuscar){
				@Override
				public void dispose(){
					getFrame();
					super.dispose();
				}
			};
			ventanamodificar.setBounds(100,10,820,380);
			ventanamodificar.setVisible(true);	
			dispose();
		}
		if(click.getSource()==eliminar){
			opcion=JOptionPane.showConfirmDialog(eliminar,"Estas seguro que desea ELIMINAR este articulo del sistema?\n");
			if(opcion==0){
				temporal.articulos.setnombre("",codigoabuscar);
				temporal.articulos.setdescripcion("",codigoabuscar);
				temporal.articulos.setcantidad("",codigoabuscar);
				temporal.articulos.setunidad("",codigoabuscar);
				temporal.articulos.setingreso("",codigoabuscar);
				temporal.articulos.setsalida("",codigoabuscar);
				temporal.articulos.setcodigo("",codigoabuscar);
				dispose();
				getFrame();
			}
		}
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
		consultar ventanaconsultar=new consultar(0);
		ventanaconsultar.setBounds(10,10,300,320);
		ventanaconsultar.setVisible(true);	
	}
}