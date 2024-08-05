import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class inicio extends JFrame implements ActionListener,KeyListener,MouseListener{
	public JLabel empresa,info;
	public JButton registrar,modificar,consultar,eliminar,inventario;
	public int cambio;
	public static articulo articulos=new articulo();

	public inicio(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Inventario");
		setFocusable(true);
		getContentPane().setBackground(new Color(255,211,0));
		
		empresa=new JLabel("Coppel 16 De Septiembre (Inventario)");
		empresa.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		empresa.setForeground(new Color(0,0,0));
		empresa.setBounds(20,10,300,30);
		add(empresa);

		info=new JLabel("<html><body>Presiona Escape en cualquier momento para <br> cerrar todo el programa</body></html>");
		info.setForeground(new Color(0,0,0));
		info.setBounds(10,220,350,30);
		add(info);		

		registrar=new JButton("Registrar nuevo articulo");
		registrar.setBounds(10,60,300,30);
		add(registrar);
		consultar=new JButton("Consultar, modificar y eliminar articulos");
		consultar.setBounds(10,120,300,30);
		add(consultar);
		inventario=new JButton("Ver inventario completo");
		inventario.setBounds(10,180,300,30);
		add(inventario);

		registrar.addActionListener(this);
		consultar.addActionListener(this);
		inventario.addActionListener(this);
		addKeyListener(this);
		addMouseListener(this);
	}

	public void actionPerformed(ActionEvent click){
		if(click.getSource()==registrar){
			registrar ventanaregistrar=new registrar();
			ventanaregistrar.setBounds(10,10,650,430);
			ventanaregistrar.setVisible(true);
		}
		if(click.getSource()==consultar){
			int x=0;
			String buscar;
			buscar=JOptionPane.showInputDialog("Ingrese el codigo del articulo que quiere buscar");
				int buscarnumero=Integer.parseInt(buscar);
				consultar ventanaconsultar=new consultar(buscarnumero);
				ventanaconsultar.setBounds(10,10,300,320);
				ventanaconsultar.setVisible(true);		
		}
		if(click.getSource()==inventario){
			mostrar ventanamostrar=new mostrar();
			ventanamostrar.setBounds(10,10,540,600);
			ventanamostrar.setVisible(true);
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

	public void mousePressed(MouseEvent cursor){
		int codigomouse=0;	
		codigomouse=cursor.getModifiersEx();
		System.out.println(codigomouse);
		if(codigomouse==1024){
			switch(cambio){
				case 0:
					getContentPane().setBackground(new Color(16,44,84));
					empresa.setForeground(new Color(255,255,255));
					info.setForeground(new Color(255,255,255));
					cambio=1;
					break;
				case 1:
					getContentPane().setBackground(new Color(255,211,0));
					empresa.setForeground(new Color(0,0,0));
					info.setForeground(new Color(0,0,0));
					cambio=0;
					break;
			}
		}	
	}

	public void mouseReleased(MouseEvent cursor){}
	public void mouseClicked(MouseEvent cursor){}
	public void mouseEntered(MouseEvent cursor){}
	public void mouseExited(MouseEvent cursor){}


	public static void main(String[] args){
	 	inicio ventanainicio=new inicio();
	 	ventanainicio.setBounds(10,10,350,300);
	 	ventanainicio.setResizable(false);
	 	ventanainicio.setVisible(true);
	 } 
}