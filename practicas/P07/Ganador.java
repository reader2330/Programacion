public class Ganador{
	private int concursante;

	public void ganar(int conteo){
		this.concursante=conteo;
		if(this.concursante==1000){
			System.out.println("!!!FELICIDADES ERES UN GANADOR!!!\n Tu comida va ser gratis");
		}

	}

}