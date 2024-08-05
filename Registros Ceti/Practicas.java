public class Practicas extends Alumno{
	
	String horas;
	String empresa;
	String remuneracion;

	public Practicas(String r,String n,String d,String c,String p,String s,String h,String e,String rem){
		super(r,n,d,c,p,s);
		horas=h;
		empresa=e;
		remuneracion=rem;
	}
	
	public void practicasdatos(){
		System.out.printf("Registro: %s\n",registro);
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Domicilio: %s\n",domicilio);
		System.out.printf("Carrera: %s\n",carrera);
		System.out.printf("Promedio: %s\n",promedio);
		System.out.printf("Semestre: %s\n",semestre);
		System.out.printf("Horas: %s\n",horas);
		System.out.printf("Area: %s\n",empresa);
		System.out.printf("Area: %s\n",remuneracion);
	}
}