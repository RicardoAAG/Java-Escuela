import java.util.Scanner;
//if (nombre.equals(""))

public class banco{
	String nom;
	String dom;
	String tel;
	float edad;
	float sal;
	Scanner leer=new Scanner(System.in);
	
	public banco(float salinicial){
		sal=salinicial;
	}; //fin del constructor

	void setdatos(String nombre, String domicilio, String telefono, float edaad){
		nom=nombre;
		dom=domicilio;
		tel=telefono;
		edad=edaad;
	};

	String getdatos(int x){
		if(x==1){
			return nom;
		}
		if(x==2){
			return dom;
		}
		if(x==3){
			return tel;
		}
		return "vacio";
	};


	float getdatos2(int x){
		if(x==1){
			return edad;
		}
		if(x==2){
			return sal;
		}
		return 0;
	};

	int menu(){
		int opc;
		System.out.printf("Elija la opcion a relizar\n");
		System.out.printf("\n1. Darte de alta un usuario con su cuenta\n2. Mostrar sus datos incluyendo su saldo\n3. Modificar datos personales\n4. Hacer retiros de efectivo\n5. Realizar abonos a la cuenta\n6. Salir\n");
		opc=leer.nextInt();
		switch(opc){
			case 1: alta();
		break;
			case 2: mostrar();
		break;
			case 3: modificar();
		break;
			case 4: retiro();
		break;
			case 5: abono();
		break;
			case 6: System.out.printf("\nGracias por su preferencia\n");
		break;
		}
		return opc;
	};
	
	void alta(){
		String nombre;
		String domicilio;
		String telefono;
		float edaad;
		System.out.printf("Ingrese sus datos:\n");
		System.out.printf("\nNombre: ");
		nombre=leer.nextLine();
		nombre=leer.nextLine();
		System.out.printf("\nDomicilio: ");
		domicilio=leer.nextLine();
		System.out.printf("\nTelefono: ");
		telefono=leer.nextLine();
		System.out.printf("\nEdad: ");
		edaad=leer.nextFloat();
		setdatos(nombre,domicilio,telefono,edaad);
		System.out.printf("\n\n------Su cuenta ha sido registrada con exito------\n\n");		
	};

	void mostrar(){
		int x;
		String mostrando;
		float mostrando2;
		x=1;
		mostrando=getdatos(x);
		System.out.printf("Nombre: %s\n",mostrando);
		x=2;
		mostrando=getdatos(x);
		System.out.printf("Domicilio: %s\n",mostrando);
		x=3;
		mostrando=getdatos(x);
		System.out.printf("Telefono: %s\n",mostrando);
		x=1;
		mostrando2=getdatos2(x);
		System.out.printf("Edad: %f\n",mostrando2);
		x=2;
		mostrando2=getdatos2(x);
		System.out.printf("Saldo: %f\n",mostrando2);
	};

	void modificar(){
		int opc;
		System.out.printf("\nQue datos desea cambiar?\n1. Nombre\n2. Domicilio\n3. Edad\n4. Telefono\n5. No quiero cambiar nada\n");
		opc=leer.nextInt();
		switch(opc){
			case 1: 
				System.out.printf("Ingrese el nuevo nombre\n");
				nom=leer.nextLine();
				nom=leer.nextLine();
				System.out.printf("Cambios realizados con exito\n");
			break;
			case 2:
				System.out.printf("Ingrese el nuevo domicilio\n");
				dom=leer.nextLine();
				dom=leer.nextLine();
				System.out.printf("Cambios realizados con exito\n");
			break;
			case 3:
				System.out.printf("Ingrese su nueva edad\n");
				edad=leer.nextFloat();
				System.out.printf("Cambios realizados con exito\n");
			break;
			case 4:
				System.out.printf("Ingrese el nuevo telefono\n");
				tel=leer.nextLine();
				tel=leer.nextLine();
				System.out.printf("Cambios realizados con exito\n");
			break;
			case 5:
				System.out.printf("No se ha cambiado nada\n");
			break;
		}		
	};

	void retiro(){
		float saca;
		System.out.printf("Cuanto dinero desea retirar?\n");
		saca=leer.nextFloat();
		sal=sal-saca;
		System.out.printf("Su nuevo saldo es: %f\n",sal);		
	};

	void abono(){
		float mete;
		System.out.printf("Cuanto dinero desea abonar a su cuenta?\n");
		mete=leer.nextFloat();
		sal=sal+mete;
		System.out.printf("\nSu nuevo saldo es: %f\n",sal);	
	};
	
	public static void main(String args[]){
		int opcmain;
		banco cuenta=new banco(10000);
		System.out.printf("Bienvenido al sistema del bancho Cheems...\n");
		do{
			opcmain=cuenta.menu();
		}while(opcmain!=6);	
				
	}
}