
import java.io.*;

public class P5_3{
	public static void main(String[] args) throws IOException{
	long ti,tf ,t;
	int n=10;
	ti=System.currentTimeMillis();
	int i;
	int a=0;
	String x;
	float m;
	String y="bien";
	String z="rebrobado";
	String w="notable";
	String u="Sobresaliente";
	float [] calificaciones=new float[10];
	String [] nombres=new String[10];
	String [] datos=new String[10];

	datos[0]=z;
	datos[1]=y;
	datos[2]=w;
	datos[3]=u;
	PrintStream fs = new PrintStream(System.out);
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



	for(i=0;i<n;i++){

		fs.println("Dame el nombre del alumno");
		nombres[i]=br.readLine();
	do{
		a=0;
		fs.println("Dame la calificacion del alumno");
		x=br.readLine();
		m=Float.parseFloat(x);
		
		
			if( m >= 0 && m <= 10){
				calificaciones[i]=m;
				a++;
			}
		else
			fs.println("Esa calificacion es incorrecto");
	    }while(a==0);
}

		for( i=0 ; i<n; i++){ 

			if( calificaciones[i]>= 0 && calificaciones[i]<= 4.99){
				fs.println("" +nombres[i]+ "   Calif.    "  +calificaciones[i]+"  " +datos[0]);
			}
			if( calificaciones[i]>= 5 && calificaciones[i]<= 6.99){
				fs.println(""+nombres[i]+ "  Calif.   " +calificaciones[i]+"  " +datos[1]);

			}
			if( calificaciones[i]>= 7 && calificaciones[i]<= 8.99){
				fs.println("" +nombres[i]+ " Calif.   " +calificaciones[i]+"  "+datos[2]);
			}
			if( calificaciones[i]>=9 && calificaciones[i]<= 10){
				fs.println("" +nombres[i]+  " Calif.   " +calificaciones[i]+" " +datos[3]);
			}


		}







	fs.println("");
	tf=System.currentTimeMillis();
	t=tf-ti;
	fs.println("EL tiempo de ejecucion es:"+t);
	}
}