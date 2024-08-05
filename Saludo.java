public class Saludo{
	String texto;
	void imprimir(){
		System.out.println(texto);
	};
	public static void main(String args[]){
		Saludo buenosdias=new Saludo();
		Saludo buenastardes=new Saludo();
		Saludo buenasnoches=new Saludo();
		buenosdias.texto="Buenos Dias";
		buenastardes.texto="Buenas Tardes";
		buenasnoches.texto="Buenas Noches";
		buenosdias.imprimir();
		buenastardes.imprimir();
		buenasnoches.imprimir();
	}
}