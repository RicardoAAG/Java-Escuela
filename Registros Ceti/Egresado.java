public class Egresado extends Alumno{
	
	String area;
	String horas;
	String sueldo;
	String empresa;
	String salario;

	public Egresado(String r,String n,String d,String c,String p,String s,String a,String h,String sul,String e,String sal){
		super(r,n,d,c,p,s);
		area=a;
		horas=h;
		sueldo=sul;
		empresa=e;
		salario=sal;
	}
	
	public void egresadodatos(){
		System.out.printf("Registro: %s\n",registro);
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Domicilio: %s\n",domicilio);
		System.out.printf("Carrera: %s\n",carrera);
		System.out.printf("Promedio: %s\n",promedio);
		System.out.printf("Semestre: %s\n",semestre);
		System.out.printf("CETI WORKER \nArea: %s\n",area);
		System.out.printf("Horas: %s\n",horas);
		System.out.printf("Sueldo: %s\n",sueldo);
		System.out.printf("INDUSTRIA \nEmpresa: %s\n",empresa);
		System.out.printf("Salario: %s\n",salario);
	}
}