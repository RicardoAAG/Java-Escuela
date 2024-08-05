import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;
import java.awt.*;

public class tiendaderopa extends JFrame implements ActionListener,ItemListener{
	public JLabel titulo;

	public JLabel pantalon;
	public JComboBox <String> pcolor;
	public JComboBox <String> ptalla;	
	public JComboBox <String> pcorte;
	
	public JLabel camisa;
	public JComboBox <String> ccolor;
	public JComboBox <String> ctalla;	
	public JComboBox <String> cmanga;
	
	public JLabel calceta;
	public JComboBox <String> calcolor;
	public JComboBox <String> calgenero;

	public JLabel infantil;
	public JComboBox <String> igenero;
	public JComboBox <String> imeses;

	public JButton registrar;
	public JTextArea recibo;

	public String pcolor1;
	public String ptalla1;
	public String pcorte1;
	public String ccolor1;
	public String ctalla1;
	public String cmanga1;
	public String calcolor1;
	public String calgenero1;
	public String igenero1;
	public String imeses1;

	public tiendaderopa(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		titulo=new JLabel("Tienda de Ropa "+'\u0022'+"La mas Fachera"+'\u0022');
		titulo.setBounds(10,10,300,30);
		add(titulo);

		pantalon=new JLabel("Pantalon");
		pantalon.setBounds(10,50,50,40);
		add(pantalon);
		pcolor=new JComboBox<String>();
		pcolor.setEditable(true);
		pcolor.setSelectedItem("Color");
		pcolor.setEditable(false);
		pcolor.setBounds(10,85,75,25);
		pcolor.addItem("Negro");
		pcolor.addItem("Azul");
		pcolor.addItem("Cafe");
		pcolor.addItem("Gris");
		add(pcolor);
		ptalla=new JComboBox<String>();
		ptalla.setEditable(true);
		ptalla.setSelectedItem("Talla");
		ptalla.setEditable(false);
		ptalla.setBounds(10,150-30,75,25);
		ptalla.addItem("XL");
		ptalla.addItem("Grade");
		ptalla.addItem("Mediano");
		ptalla.addItem("Chico");
		ptalla.addItem("XS");		
		add(ptalla);
		pcorte=new JComboBox<String>();
		pcorte.setEditable(true);
		pcorte.setSelectedItem("Corte");
		pcorte.setEditable(false);
		pcorte.setBounds(10,200-45,75,25);
		pcorte.addItem("Regular");
		pcorte.addItem("Slim");
		pcorte.addItem("Skinny");
		pcorte.addItem("Ancho");
		add(pcorte);

		camisa=new JLabel("Camisa");
		camisa.setBounds(80+25,50,50,40);
		add(camisa);
		ccolor=new JComboBox<String>();
		ccolor.setEditable(true);
		ccolor.setSelectedItem("Color");
		ccolor.setEditable(false);
		ccolor.setBounds(80+25,100-15,75,25);
		ccolor.addItem("Negra");
		ccolor.addItem("Azul");
		ccolor.addItem("Cafe");
		ccolor.addItem("Gris");
		ccolor.addItem("Amarilla");
		ccolor.addItem("Roja");
		ccolor.addItem("Verde");
		ccolor.addItem("Blanca");
		add(ccolor);
		ctalla=new JComboBox<String>();
		ctalla.setEditable(true);
		ctalla.setSelectedItem("Talla");
		ctalla.setEditable(false);
		ctalla.setBounds(80+25,150-30,75,25);
		ctalla.addItem("XL");
		ctalla.addItem("Grade");
		ctalla.addItem("Mediano");
		ctalla.addItem("Chico");
		ctalla.addItem("XS");		
		add(ctalla);
		cmanga=new JComboBox<String>();
		cmanga.setEditable(true);
		cmanga.setSelectedItem("Manga");
		cmanga.setEditable(false);
		cmanga.setBounds(80+25,200-45,75,25);
		cmanga.addItem("Larga");
		cmanga.addItem("Corta");
		add(cmanga);

		calceta=new JLabel("Calceta");
		calceta.setBounds(150+50,50,50,40);
		add(calceta);
		calcolor=new JComboBox<String>();
		calcolor.setEditable(true);
		calcolor.setSelectedItem("Color");
		calcolor.setEditable(false);
		calcolor.setBounds(150+50,100-15,75,25);
		calcolor.addItem("Negra");
		calcolor.addItem("Azul");
		calcolor.addItem("Cafe");
		calcolor.addItem("Gris");
		calcolor.addItem("Amarilla");
		calcolor.addItem("Roja");
		calcolor.addItem("Verde");
		calcolor.addItem("Blanca");
		add(calcolor);
		calgenero=new JComboBox<String>();
		calgenero.setEditable(true);
		calgenero.setSelectedItem("Genero");
		calgenero.setEditable(false);
		calgenero.setBounds(150+50,150-30,75,25);
		calgenero.addItem("Caballero");
		calgenero.addItem("Dama");
		add(calgenero);

		infantil=new JLabel("Infantil");
		infantil.setBounds(220+75,50,50,40);
		add(infantil);
		igenero=new JComboBox<String>();
		igenero.setEditable(true);
		igenero.setSelectedItem("Genero");
		igenero.setEditable(false);
		igenero.setBounds(220+75,100-15,75,25);
		igenero.addItem("Ni\u00f1o");
		igenero.addItem("Ni\u00f1a");
		add(igenero);
		imeses=new JComboBox<String>();
		imeses.setEditable(true);
		imeses.setSelectedItem("Meses");
		imeses.setEditable(false);
		imeses.setBounds(220+75,150-30,75,25);
		imeses.addItem("1");
		imeses.addItem("2");
		imeses.addItem("3");
		imeses.addItem("4");
		imeses.addItem("5");
		imeses.addItem("6");
		imeses.addItem("7");
		imeses.addItem("8");
		imeses.addItem("9");
		imeses.addItem("10");
		imeses.addItem("11");
		imeses.addItem("12");
		add(imeses);

		registrar=new JButton("Registrar pedido");
		registrar.setBounds(125,225,150,25);
		add(registrar);
		
		recibo=new JTextArea("");
		recibo.setEditable(false);
		recibo.setBounds(400,10,400,400);
		add(recibo);

		registrar.addActionListener(this);
		pcolor.addItemListener(this);
		ptalla.addItemListener(this);
		pcorte.addItemListener(this);
		ccolor.addItemListener(this);
		ctalla.addItemListener(this);
		cmanga.addItemListener(this);
		calcolor.addItemListener(this);
		calgenero.addItemListener(this);
		imeses.addItemListener(this);
		igenero.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent action){
		pcolor1=pcolor.getSelectedItem().toString();
		ptalla1=ptalla.getSelectedItem().toString();
		pcorte1=pcorte.getSelectedItem().toString();
		ccolor1=ccolor.getSelectedItem().toString();
		ctalla1=ctalla.getSelectedItem().toString();
		cmanga1=cmanga.getSelectedItem().toString();
		calcolor1=calcolor.getSelectedItem().toString();
		calgenero1=calgenero.getSelectedItem().toString();
		imeses1=imeses.getSelectedItem().toString();
		igenero1=igenero.getSelectedItem().toString();
	}

	public void actionPerformed(ActionEvent click){
		if(click.getSource()==registrar){
			recibo.setText("Pantalon: \n");
			recibo.setText(recibo.getText()+"Color: "+pcolor1+"\n");
			recibo.setText(recibo.getText()+"Talla: "+ptalla1+"\n");
			recibo.setText(recibo.getText()+"Corte: "+pcorte1+"\n");
			recibo.setText(recibo.getText()+"\nCamisa: \n");
			recibo.setText(recibo.getText()+"Color: "+ccolor1+"\n");
			recibo.setText(recibo.getText()+"Talla: "+ctalla1+"\n");
			recibo.setText(recibo.getText()+"Manga: "+cmanga1+"\n");
			recibo.setText(recibo.getText()+"\nCalcetas: \n");
			recibo.setText(recibo.getText()+"Color: "+calcolor1+"\n");
			recibo.setText(recibo.getText()+"Genero: "+calgenero1+"\n");
			recibo.setText(recibo.getText()+"\nInfantil/Bebe: \n");
			recibo.setText(recibo.getText()+"Meses: "+imeses1+"\n");
			recibo.setText(recibo.getText()+"Genero: "+igenero1+"\n");
		}
	}

	public static void main(String[] args) {
		tiendaderopa ventana=new tiendaderopa();
		ventana.setBounds(100,100,900,500);
		ventana.setVisible(true);
	}
}