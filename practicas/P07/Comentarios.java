import java.io.*;

public class Comentarios{
	private String coment;



	public String leercad(){
			String x="0";
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			try{
				x=br.readLine();
			}catch(IOException ex){
				System.out.println("No se puede guardar tu comentario");
			}
			return x;
		} 


		public String Comentar(String decision){
			String comentario="0";

			this.coment=decision;

			if(decision=="si" || decision=="s"){

				System.out.println("Escribe tu comentario, tambien puedes dejar sugerencias, seran tomadas en cuenta");
				comentario=this.leercad();
				return comentario;

			}
			return comentario;
		}
}