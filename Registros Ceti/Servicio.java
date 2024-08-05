public class Servicio extends Alumno{
	
	String horas;
	String area;

	public Servicio(String r,String n,String d,String c,String p,String s,String h,String a){
		super(r,n,d,c,p,s);
		horas=h;
		area=a;
	}
	
	public void serviciodatos(){
		System.out.printf("Registro: %s\n",registro);
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Domicilio: %s\n",domicilio);
		System.out.printf("Carrera: %s\n",carrera);
		System.out.printf("Promedio: %s\n",promedio);
		System.out.printf("Semestre: %s\n",semestre);
		System.out.printf("Horas: %s\n",horas);
		System.out.printf("Area: %s\n",area);
	}
}