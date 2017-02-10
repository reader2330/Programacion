public class P3_1{
	public static void main(String[] args){
    long ti , tf, t;
    ti=System.currentTimeMillis();
	int result=0;

    result+=3;

	System.out.println("result is now " + result);
	result-=1;
	System.out.println("result is now " + result);
	result*=2;
	System.out.println("result is now " + result);
	result/=2;
	System.out.println("result is now " + result);
	result*=5;
	System.out.println("result is now " + result);
	result/=3;
	System.out.println("result is now " + result);

	tf=System.currentTimeMillis();
	t=tf-ti;
	System.out.println("El tiempo de ejecucion en milisegundos es :"+t);
	}
}