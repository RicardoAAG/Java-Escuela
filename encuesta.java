import java.util.Scanner;

public class encuesta{
	String nombre;
	int edad;
	String dom;
	String tel;
	float prom;
	Scanner leer=new Scanner(System.in);
	
	void llenar(){
		System.out.println("Ingrese su nombre:");
		nombre=leer.nextLine();
		System.out.println("Ingrese su edad:");
		edad=leer.nextInt();
		System.out.println("Ingrese su domicilio:");
		dom=leer.nextLine();
		dom=leer.nextLine();
		System.out.println("Ingrese su telefono:");
		tel=leer.nextLine();
		System.out.println("Ingrese su promedio:");
		prom=leer.nextFloat();
	};
	void imprimir(){
		System.out.printf("Nombre: %s\n",nombre);
		System.out.printf("Edad: %d\n",edad);
		System.out.printf("Domicilio: %s\n",dom);
 		System.out.printf("Telefono: %s\n",tel);
		System.out.printf("Promedio: %.2f\n",prom);
	};
	
	public static void main(String args[]){
		encuesta primero=new encuesta();
		encuesta segundo=new encuesta();
		encuesta tercero=new encuesta();
		primero.llenar();
		System.out.printf("\n\nPrimer usuario ingresado con exito, favor de ingresar el siguiente\n\n");
		segundo.llenar();
		System.out.printf("\n\nSegundo usuario ingresado con exito, favor de ingresar el siguiente\n\n");
		tercero.llenar();
		System.out.printf("\n\nTodos los usuarios han sido ingresados con exito, estos son sus datos\n\n");
		System.out.printf("\n\nPrimero: \n");
		primero.imprimir();
		System.out.printf("\n\nSegundo: \n");
		segundo.imprimir();
		System.out.printf("\n\nTercero: \n");
		tercero.imprimir();
		
	}
}