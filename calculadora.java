import java.util.Scanner;
import java.util.InputMismatchException;

public class calculadora{
	int opc;
	float a;
	float b;
	float r;
	String tipo;
	Scanner leer=new Scanner(System.in);
	
	int menu(){
		int error;
		do{
		try{
			error=0;
			System.out.printf("Elija la opcion a relizar\n");
			System.out.printf("\n1. Sumar\n2. Restar\n3. Multiplicar\n4. Dividir\n5. Cambiar datos\n6. Salir\n");
			opc=leer.nextInt();
			if(opc!=1)
			if(opc!=2)
			if(opc!=3)
			if(opc!=4)
			if(opc!=5)
			if(opc!=6){
				System.out.printf("\nIngresaste una opcion no existente, favor de intentarlo nuevamente\n\n");
				error=1;
			}
		}catch(InputMismatchException InputMismatchException){
			System.out.printf("\nIngresaste un valor diferente a un numero, favor de intentarlo nuevamente\n\n");
			leer.nextLine();
			error=1;
		}
		}while(error==1);
		switch(opc){
			case 1: suma();
		break;
			case 2: resta();
		break;
			case 3: multiplicar();
		break;
			case 4: dividir();
		break;
			case 5: preguntaDatos();
		break;
			case 6: System.out.printf("\nGracias por usar la calculador :3\n");
		break;
		}
		return opc;
	};
	
	void suma(){
		r=a+b;
		tipo="suma";
	};

	void resta(){
		r=a-b;
		tipo="resta";
	};

	void multiplicar(){
		r=a*b;
		tipo="multiplicacion";
	};

	void dividir(){
		r=a/b;
		tipo="division";
	};

	void preguntaDatos(){
		int error;
		do{
			try{
				error=0;
				a=0;
				b=0;
				System.out.printf("\nPorfavor ingrese los numeros con los que quiere trabajar\n");
				a=leer.nextFloat();
				b=leer.nextFloat();	
			}catch(InputMismatchException InputMismatchException){
				System.out.printf("\n\nIngresaste un digito diferente a un numero, por favor intentelo de nuevo\n");
				leer.nextLine();
				error=1;
			}
		}while(error==1);
	};

	void mostrarDatos(){
		System.out.printf("\n\nEl resultado de la %s entre %f y %f es:\n %f\n\n",tipo,a,b,r);	
	};
	
	public static void main(String args[]){
		int opcmain,y=1;
		calculadora calculadora=new calculadora();
		System.out.printf("Calculadora iniciada...\n");
		calculadora.preguntaDatos();
		do{
			opcmain=calculadora.menu();
			if(opcmain!=5){
				if(opcmain!=6)
					calculadora.mostrarDatos();
			}
		}while(opcmain!=6);	
				
	}
}