import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class encuesta2 extends JFrame implements ActionListener,ItemListener,ChangeListener{
	public JLabel municipioet,generoet,estudioset,gustoset,horarioet;
	public JComboBox <String> municipio;
	public JCheckBox licenciatura,maestria,doctorado,leer,correr,bicicleta;
	public JRadioButton masculino,femenino,matutino,vespertino;
	public ButtonGroup grupogenero,grupohorario;
	public JButton terminar;
	public JTextArea resultados;
	public String selecmunicipio="",selecestudios,selecgenero="",selecgustos,selechorario="";

	public encuesta2(){
		setLayout(null);
		setTitle("Encuesta");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		municipioet=new JLabel("Municipio");
		municipioet.setBounds(10,10,100,30);
		add(municipioet);
		municipio=new JComboBox<String>();
		municipio.setEditable(true);
		municipio.setSelectedItem("Municipio");
		municipio.setEditable(false);
		municipio.setBounds(10,45,100,30);
		municipio.addItem("Zapopan");
		municipio.addItem("Guadalajara");
		municipio.addItem("Tonala");
		municipio.addItem("Tlaquepaque");
		add(municipio);

		generoet=new JLabel("Genero");
		generoet.setBounds(10,90,100,30);
		add(generoet);
		masculino=new JRadioButton("Masculino");
		masculino.setBounds(10,120,100,30);
		add(masculino);
		femenino=new JRadioButton("Femenino");
		femenino.setBounds(10,155,100,30);
		add(femenino);
		grupogenero=new ButtonGroup();
		grupogenero.add(masculino);
		grupogenero.add(femenino);

		estudioset=new JLabel("Nivel de Estudios");
		estudioset.setBounds(10,200,100,30);
		add(estudioset);
		licenciatura=new JCheckBox("Licenciatura");
		licenciatura.setBounds(10,230,100,30);
		add(licenciatura);
		maestria=new JCheckBox("Maestria");
		maestria.setBounds(10,260,100,30);
		add(maestria);
		doctorado=new JCheckBox("Doctorado");
		doctorado.setBounds(10,290,100,30);
		add(doctorado);

		gustoset=new JLabel("Gustos");
		gustoset.setBounds(10,335,100,30);
		add(gustoset);
		leer=new JCheckBox("Leer");
		leer.setBounds(10,365,100,30);
		add(leer);
		correr=new JCheckBox("Correr");
		correr.setBounds(10,395,100,30);
		add(correr);
		bicicleta=new JCheckBox("Bicicleta");
		bicicleta.setBounds(10,425,100,30);
		add(bicicleta);

		horarioet=new JLabel("Horario");
		horarioet.setBounds(10,460,100,30);
		add(horarioet);
		matutino=new JRadioButton("Matutino");
		matutino.setBounds(10,490,100,30);
		add(matutino);
		vespertino=new JRadioButton("Vespertino");
		vespertino.setBounds(10,520,100,30);
		add(vespertino);
		grupohorario=new ButtonGroup();
		grupohorario.add(matutino);
		grupohorario.add(vespertino);

		terminar=new JButton("Terminar Encuesta");
		terminar.setBounds(10,570,100,50);	
		add(terminar);

		resultados=new JTextArea("");
		resultados.setEditable(false);
		resultados.setBounds(250,10,550,600);
		add(resultados);	

		municipio.addItemListener(this);
		terminar.addActionListener(this);
		maestria.addChangeListener(this);
		licenciatura.addChangeListener(this);
		doctorado.addChangeListener(this);
		masculino.addChangeListener(this);
		femenino.addChangeListener(this);
		leer.addChangeListener(this);
		bicicleta.addChangeListener(this);
		correr.addChangeListener(this);	
		matutino.addChangeListener(this);
		vespertino.addChangeListener(this);
	}

	public void stateChanged(ChangeEvent click){
		selecestudios="";
		selecgustos="";

		if(masculino.isSelected()==true){
			selecgenero="Masculino";
		}
		if(femenino.isSelected()==true){
			selecgenero="Femenino";
		}

		if(licenciatura.isSelected()==true){
			selecestudios=selecestudios+"- Licenciatura \n";
		}
		if(maestria.isSelected()==true){
			selecestudios=selecestudios+"- Maestria \n";
		}
		if(doctorado.isSelected()==true){
			selecestudios=selecestudios+"- Doctorado \n";
		}

		if(leer.isSelected()==true){
			selecgustos=selecgustos+"- Leer \n";
		}
		if(correr.isSelected()==true){
			selecgustos=selecgustos+"- Correr \n";
		}
		if(bicicleta.isSelected()==true){
			selecgustos=selecgustos+"- Bicicleta \n";
		}

		if(vespertino.isSelected()==true){
			selechorario="Vespertino";
		}
		if(matutino.isSelected()==true){
			selechorario="Matutino";
		}
	}

	public void itemStateChanged(ItemEvent click){
		selecmunicipio=municipio.getSelectedItem().toString();
	}

	public void actionPerformed(ActionEvent click){
		if(click.getSource()==terminar){
			resultados.setText("                 ENCUESTA \n\nMunicipio: \n"+"-"+selecmunicipio);
			resultados.setText(resultados.getText()+"\n\nGenero: \n"+"-"+selecgenero);
			resultados.setText(resultados.getText()+"\n\nNivel de Estudios: \n"+selecestudios);
			resultados.setText(resultados.getText()+"\nGustos: \n"+selecgustos);
			resultados.setText(resultados.getText()+"\nHorario: \n"+"-"+selechorario);
		}
	}

	public static void main(String[] args) {
		encuesta2 ventana=new encuesta2();
		ventana.setBounds(50,50,900,670);
		ventana.setVisible(true);		
	}
}