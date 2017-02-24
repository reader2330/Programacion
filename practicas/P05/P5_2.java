
import java.io.*;

public class P5_2{
	public static void main(String[] args) throws IOException{
		long ti,tf,t;
		ti=System.currentTimeMillis();
		int i;
		int r=0;
		int n;
		String x;
		int m;
		PrintStream ps =new PrintStream(System.out);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		ps.println("Dame el tamaño del arreglo deseado");
		x=br.readLine();
		n=Integer.parseInt(x);

		int [] arreglo = new int[n];
		int [] arreglo2 =new int[n];

			for(i=0;i<n;i++){

				arreglo[i]=(int)((Math.random()*300+1));
			
			}

				ps.println("Dame un digito de terminacion de los numero que quieres");

				x=br.readLine();

				m=Integer.parseInt(x);

			if( m>= 0 && m <10){
				for(i=0;i<n;i++){
					if(arreglo[i]%10==m){
						arreglo2[r]=arreglo[i];
						r++;
						}
				}

			}

				ps.println("");
				ps.println("");

			

			for(i=0;i<r;i++){
				ps.println(""+arreglo2[i]);
			}
		




















		tf=System.currentTimeMillis();
		t=tf-ti;
		ps.println("El tiempo de ejecucion: " +t);	
	}
}