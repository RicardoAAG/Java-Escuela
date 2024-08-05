public class RegistrosCeti{
	public static void main(String args[]){
		System.out.printf("\n\nALUMNO REGULAR\n");
		Alumno alumno=new Alumno("20310354","Ricardo Aguilar","Avenida Vallarta 567","Mecatronica","96.7","Tercero");
		alumno.datos();
		Becado becado=new Becado("20310369","Alexander Gutierrez","La Estancia 5208","Software","100","Quinto","$3000.00");
		System.out.printf("\n\nALUMNO BECADO\n");
		becado.becadodatos();
		Egresado egresado=new Egresado("20310777","Ernesto de la Cruz","La Estancia5208","Mecatronica","86.7","Egresado","---","---","---","INTEL","$30000.00");
		System.out.printf("\n\nALUMNO EGRESADO\n");
		egresado.egresadodatos();
		Irregular irregular=new Irregular("20310000","Pinwinasio","Mexico DF","Civil","79.34","Cuarto","Calculo Diferencial e Integral","65","68","64","No tengo tiempo para estudiar por el trabajo y el profe no explica bien");
		System.out.printf("\n\nALUMNO IRREGULAR\n");
		irregular.irregulardatos();
		Practicas practicas=new Practicas("20310420","Porfirio Diaz","Privdencia 8960","Biomedica","98.78","Sexto","4","Flextronics","%5000.00");
		System.out.printf("\n\nALUMNO EN PRACTICAS LABORALES\n");
		practicas.practicasdatos();
		Servicio servicio=new Servicio("20310007","Cristiano Ronaldo","Ciudad Granja 12345","Software","89.01","Tercero","3","Bosque de los Colomos");
		System.out.printf("\n\nALUMNO EN SERVICIO SOCIAL\n");
		servicio.serviciodatos();
	}
}