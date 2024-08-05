public class Alumno{
	
	String registro;
	String nombre;
	String domicilio;
	String carrera;
	String promedio;
	String semestre;

	public Alumno(String r,String n,String d,String c,String p,String s){
		registro=r;
		nombre=n;
		domicilio=d;
		carrera=c;
		promedio=p;
		semestre=s;
	}
	
	public void datos(){
		System.out.printf("Registro: %s\n",registro);
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Domicilio: %s\n",domicilio);
		System.out.printf("Carrera: %s\n",carrera);
		System.out.printf("Promedio: %s\n",promedio);
		System.out.printf("Semestre: %s\n",semestre);
	}
}