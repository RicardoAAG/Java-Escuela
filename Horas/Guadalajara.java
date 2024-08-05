public class Guadalajara extends Ciudades implements InterfaceHorarios{
	int hora=18;
	int min=35;
	public void horaGMT(){
	}
	public void horaLocal(){
		System.out.println("La hora en Guadalajara es: "+hora+":"+min);
	}
}