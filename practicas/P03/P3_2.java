
public class P3_2{
	public static void main(String[] args){
     int a=1000;
     int b=7;
    long ti , tf, t;
    ti=System.currentTimeMillis();
      if((a>0 && a<1001) && (b>0 && a<1001)){

     if(a%2==0) 
     System.out.println("input is " +a+ ",then output should be:'Even'");
     else
     System.out.println("input is " +a+",then output should be:'Odd'");
     if(b%2==0)
     	System.out.println("input is " +b+ ",then output should be:'Even'");
     else
     	System.out.println("input is " +b+",then output should be:'Odd'");
     
     
} else 
      System.out.println("El numero no es valido");

    tf=System.currentTimeMillis();
	t=tf-ti;
	System.out.println("El tiempo de ejecucion en milisegundos es :"+t);
	}

}