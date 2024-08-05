import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;

public class menus extends JFrame implements ActionListener{
	public JMenuBar barra;
	public JMenu[] menu=new JMenu[4];
	public JMenuItem[] item=new JMenuItem[9];
	public int x,y;

	public menus(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Ejemplos menu");
		setResizable(false);

		barra=new JMenuBar();
		setJMenuBar(barra);

		menu[0]=new JMenu("Apariencia");
		menu[1]=new JMenu("Titulo");
		menu[2]=new JMenu("Extras");
		menu[3]=new JMenu("Color");
		for(x=0;x<3;x++){
			barra.add(menu[x]);
		}

		item[0]=new JMenuItem("240 x 480");
		item[1]=new JMenuItem("640 x 720");
		item[2]=new JMenuItem("Rojo");
		item[3]=new JMenuItem("Azul");
		item[4]=new JMenuItem("Verde");
		item[5]=new JMenuItem("Titulo Original");
		item[6]=new JMenuItem("Titulo nuevo");
		item[7]=new JMenuItem("Datos del creador");
		item[8]=new JMenuItem("Calculadora");

		for(x=0,y=0;y!=4;x++){
			if(y==0){
				menu[y].add(item[x]);
				if(x==2) 
					y=3;
			}
			if(y==3){
				menu[y].add(item[x]);
				if(x==5) 
					y=1;
			}
			if(y==1){
				menu[y].add(item[x]);
				if(x==7) 
					y=2;
			}
			if(y==2){
				menu[y].add(item[x]);
				if(x==8) 
					y=4;
			}
		}
		menu[0].add(menu[3]);

		for(x=0;x!=9;x++){
			item[x].addActionListener(this);
		}
	}
	
	public void actionPerformed(ActionEvent click){
		String titulo="";
		if(click.getSource()==item[0])
			setBounds(100,50,240,480);
		if(click.getSource()==item[1])
			setBounds(100,50,640,720);
		if(click.getSource()==item[2])
			getContentPane().setBackground(new Color(255,0,0));
		if(click.getSource()==item[3])
			getContentPane().setBackground(new Color(0,0,255));
		if(click.getSource()==item[4])
			getContentPane().setBackground(new Color(0,255,0));
		if(click.getSource()==item[5])
			setTitle("Ejemplos menu");
		if(click.getSource()==item[6]){
			titulo=JOptionPane.showInputDialog("Inserte el nuevo titulo de la ventana");
			setTitle(titulo);
		}
		if(click.getSource()==item[7])
			JOptionPane.showMessageDialog(null,"Ricardo Alexander Aguilar Gutierrez\n"+"20310354\n"+"Mecatronica 3E");
		if(click.getSource()==item[8]){
			calculadora2 calcu=new calculadora2();
			calcu.setBounds(100,100,350,350);
			calcu.setVisible(true);
		}
	}

	public static void main(String[] args){
		menus ventana=new menus();
		ventana.setBounds(100,50,300,300);
		ventana.setVisible(true);
	}
}