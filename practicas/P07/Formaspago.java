import java.io.*;

public class Formaspago{
	private String forma;

		

		public int leernum(){
			int x=0;
			InputStreamReader isr=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(isr);
			try{
				x=Integer.parseInt(br.readLine());
			}catch(IOException ex){
				System.out.println("No se puede leer tu billete");
			}
			return x;
		} 

		public void formas(String metodo){
			int cambio=0;
			this.forma=metodo;

			if(this.forma=="Efectiivo" || this.forma=="efectivo"){

				System.out.println("Necesitas cambio de algun billete?\n Pon la denominacion en numero de tu billete");
				cambio=this.leernum();

				System.out.println("Tu forma es en efectivo y tu cambio del billete "+cambio+" se imprimira en tu pedido");

			}
			if(this.forma=="Tarjeta" || this.forma=="tarjeta"){

				System.out.println("Tu forma es en en tarjeta se imprimira en tu pedido, ten a la mano tu tarjeta");
			}





		}
}