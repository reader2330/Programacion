
import java.io.*;

public class P5_1{
	public static void main(String[] args)throws IOException{
	long ti,tf,t;
	ti=System.currentTimeMillis();
	int i,j;
	int mediana;
	int n;
	int aux;
	String x;
	int [] arreglo = new int[7];
	PrintStream fs=new PrintStream(System.out);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n=arreglo.length;

			for( i = 0; i < n; i ++){

			fs.println("Dame un numero");
			x=br.readLine();
			arreglo[i]= Integer.parseInt(x);

			}

			for(i=0;i<n;i++){
				for(j=i+1;j<n;j++){
					if(arreglo[i]>arreglo[j]){
						aux=arreglo[i];
						arreglo[i]=arreglo[j];
						arreglo[j]=aux;
					}
				}

			}

			
			mediana=arreglo[(n/2)];



			fs.println("");


			fs.println("La mediana es :"+mediana);











	tf=System.currentTimeMillis();
	t=tf-ti;
	fs.println("el Tiempo de ejecucion fue : "+t);
	}
}
 