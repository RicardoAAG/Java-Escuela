public class Becado extends Alumno{
	
	String monto;

	public Becado(String r,String n,String d,String c,String p,String s,String m){
		super(r,n,d,c,p,s);
		monto=m;
	}
	
	public void becadodatos(){
		System.out.printf("Registro: %s\n",registro);
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Domicilio: %s\n",domicilio);
		System.out.printf("Carrera: %s\n",carrera);
		System.out.printf("Promedio: %s\n",promedio);
		System.out.printf("Semestre: %s\n",semestre);
		System.out.printf("Monto: %s\n",monto);
	}
}