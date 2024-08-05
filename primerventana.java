import javax.swing.*;
import java.util.Scanner;

public class primerventana extends JFrame{
	public JLabel vpalabra1;
	public JLabel vpalabra2;
	public JLabel vpalabra3;
	public JLabel vpalabra4;
	public JLabel vpalabra5;
	Scanner leer=new Scanner(System.in);

	public primerventana(String palabra1,String palabra2,String palabra3,String palabra4,String palabra5){
		setLayout(null);
		setTitle("Primeras ventanas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		vpalabra1=new JLabel(palabra1);
		vpalabra1.setBounds(0,0,100,15);
		add(vpalabra1);
		vpalabra2=new JLabel(palabra2);
		vpalabra2.setBounds(220,0,100,15);
		add(vpalabra2);
		vpalabra3=new JLabel(palabra3);
		vpalabra3.setBounds(130,100,100,15);
		add(vpalabra3);
		vpalabra4=new JLabel(palabra4);
		vpalabra4.setBounds(0,190,100,15);
		add(vpalabra4);
		vpalabra5=new JLabel(palabra5);
		vpalabra5.setBounds(220,190,100,15);
		add(vpalabra5);
	}
	
	public static String preguntar(int opc){
		Scanner leer=new Scanner(System.in);
		String palabra;
		System.out.printf("\nQue desea imprimir como su palabra numero %d: ",opc);
		if(opc==1)
		System.out.printf("-Arriba a la izquierda- \n");
		if(opc==2)
		System.out.printf("-Arriba a la derecha- \n");
		if(opc==3)
		System.out.printf("-Centro- \n");
		if(opc==4)
		System.out.printf("-Abajo a la izquierda- \n");
		if(opc==5)
		System.out.printf("-Abajo a la derecha- \n");
		palabra=leer.nextLine();
		return palabra;
	}
	
	public static void main(String args[]){
		int opc;
		String palabra1="",palabra2="",palabra3="",palabra4="",palabra5="",cache;
		for(opc=1;opc<=5;opc++){
			cache=primerventana.preguntar(opc);
			switch(opc){
				case 1:
					palabra1=cache;
				break;
				case 2:
					palabra2=cache;
				break;
				case 3:
					palabra3=cache;
				break;
				case 4:
					palabra4=cache;
				break;
				case 5:
					palabra5=cache;
				break;
			}
		}
		primerventana ventana1=new primerventana(palabra1,palabra2,palabra3,palabra4,palabra5);
		primerventana ventana2=new primerventana(palabra1,palabra2,palabra3,palabra4,palabra5);
		primerventana ventana3=new primerventana(palabra1,palabra2,palabra3,palabra4,palabra5);
		primerventana ventana4=new primerventana(palabra1,palabra2,palabra3,palabra4,palabra5);
		primerventana ventana5=new primerventana(palabra1,palabra2,palabra3,palabra4,palabra5);
		ventana1.setBounds(0,0,300,250);
		ventana2.setBounds(1050,0,300,250);
		ventana3.setBounds(525,250,300,250);
		ventana4.setBounds(0,500,300,250);
		ventana5.setBounds(1050,500,300,250);
		ventana1.setVisible(true);
		ventana2.setVisible(true);
		ventana3.setVisible(true);
		ventana4.setVisible(true);
		ventana5.setVisible(true);
	}
}