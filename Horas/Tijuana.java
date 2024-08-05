public class Tijuana extends Ciudades implements InterfaceHorarios{
	int hora=19;
	int min=35;
	public void horaGMT(){
	}
	public void horaLocal(){
		System.out.println("La hora en Tijuana es: "+hora+":"+min);
	}
}