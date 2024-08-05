public class HolaMundoOO{
	String texto;
	void enviamensaje(){
		texto="Hola Mundo";
		System.out.println(texto);
	};
	public static void main(String args[]){
		HolaMundoOO miOOHolaMundo=new HolaMundoOO();
		miOOHolaMundo.texto="Hola Mundo";
		miOOHolaMundo.enviamensaje();
	}
}