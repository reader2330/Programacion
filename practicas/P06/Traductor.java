import java.io.*;

public class Traductor{
		private static int n=0;
		private static PrintStream fs=System.out;
		private static InputStreamReader isr=new InputStreamReader(System.in);
		private static BufferedReader br = new BufferedReader(isr);
		private static String x;
		private int a=0, b=0 ;
		

	public void crearDiccionario(String in[],String es[],int n) {
		int i;
		String z;
		fs.println("Bienvenido a la creacion del diccionario");
		
			for(i=0;i<n;i++){
				do{
				try{
				fs.println("Dame la palabra en ingles");
				z=br.readLine();
				if(z.length()<40){
				in[i]=z;
				a++;
				}
				fs.println("Dame la palabra en español");
				z=br.readLine();
				if(z.length()<40){
				es[i]=z;
				b++;
				}
			
			
			}catch(IOException ex){
				fs.println("");

			}
			

			}while(a==0 && b==0);

			//fs.println("Se guardo exitosamente");
		}
	}


	public void traducir(String in[],String es[], int n){
		int y=200;
		String w;
		int i;
		String a="0";

			
			do{
				try{
				fs.println("Bienvenido al sistema de traduccion");
				fs.println("Dame la palabra en ingles:");
				w=br.readLine();

				for(i=0;i<n;i++){
					if(in[i].equals(w)){
						y=i;
						break;
					}
					
				}
				if(y>-1 && y<=100)
				fs.println(""+es[y]);
					else
					fs.println("No se encontro la palabra que usted ingreso");
					fs.println("Quieres traducir otra palabra (s/n)");
					a=br.readLine();
					y=200;
				}catch(IOException ex){
					fs.println("Error");
				}

			}while(a.equals("s"));
	}



	public static void main(String [] args) {
		Traductor dicc1=new Traductor();
		String[]  ingles;
		String[]  espa;
		try{
		System.out.println("Dame el numero de palabras que quieres agregar al sistema de diccionario\n");
		x=br.readLine();
		n=Integer.parseInt(x);
		if(n>0 && n<=100){
			ingles=new String[n];
			espa=new String[n];
			dicc1.crearDiccionario(ingles,espa,n);
			fs.println("\n");
			dicc1.traducir(ingles,espa,n);

		}else

		fs.println("numero invalido de palabras");




		}catch(IOException ex){
			fs.println("Error");
		}
	}
}