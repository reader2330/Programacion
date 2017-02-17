public class P4_3{
	public static void main(String[] args){
		long tf,ti,t;

		ti=System.currentTimeMillis();

        int pos;

        String firstword;

        String word="Hello, my good friend!";

        	pos= word.indexOf(",");

        	firstword=word.substring(0,pos);

       		 System.out.println("La Primera palabra es: "+firstword);

			





			tf=System.currentTimeMillis();
			t=tf-ti;
		System.out.println("El tiempo de ejecucion es:"+t);

	}
}