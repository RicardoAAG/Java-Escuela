public class Irregular extends Alumno{
	
	String materia;
	String calificacion1;
	String calificacion2;
	String calificacion3;
	String justificacion;

	public Irregular(String r,String n,String d,String c,String p,String s,String m,String c1,String c2,String c3,String j){
		super(r,n,d,c,p,s);
		materia=m;
		calificacion1=c1;
		calificacion2=c2;
		calificacion3=c3;
		justificacion=j;
	}
	
	public void irregulardatos(){
		System.out.printf("Registro: %s\n",registro);
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Domicilio: %s\n",domicilio);
		System.out.printf("Carrera: %s\n",carrera);
		System.out.printf("Promedio: %s\n",promedio);
		System.out.printf("Semestre: %s\n",semestre);
		System.out.printf("Materia reprobada: %s\n",materia);
		System.out.printf("Calificacion: %s\n",calificacion1);
		System.out.printf("TITULO. Calificacion: %s\n",calificacion2);
		System.out.printf("CARTA. Calificacion: %s\n",calificacion3);
		System.out.printf("Justificacion: %s\n",justificacion);
	}
}