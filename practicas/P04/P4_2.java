public class P4_2{

   private static void printCapitalized(String n){

	String m;

	m=n.toUpperCase();

	
	System.out.println(""+m);


	}

	public static void main(String[] args){
		long ti, tf ,t;
		ti=System.currentTimeMillis();
		String n="hola mundo";
		

			printCapitalized(n);

		
        	tf=System.currentTimeMillis();
        	t=tf-ti;
        	System.out.println("EL tiempo de ejecucion es: "+t);
	}

	
}