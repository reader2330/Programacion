public class Conteo{
	private int conteo;
	private int hora;

	public int Contar(int hora){
		this.hora=hora;

		while(this.hora<19){
			this.conteo=this.conteo+1;
		}


	}

}