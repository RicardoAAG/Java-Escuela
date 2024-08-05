public class LaPaz extends Ciudades implements InterfaceHorarios{
	int hora=17;
	int min=35;
	public void horaGMT(){
	}
	public void horaLocal(){
		System.out.println("La hora en La Paz es: "+hora+":"+min);
	}
}