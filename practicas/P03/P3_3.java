public class P3_3{
	public static void main(String[] args){

	int a=1;
	int b=2;
	int c=3;
	int d=4;
	int e=5;
	int f=6;
	int g=7;
	int h=8;
	int i=9;
	int j=10;
	int k=11;
	int l=12;
	int op;
    long ti , tf, t;
    ti=System.currentTimeMillis();
     op=5;

     if(op>0 && op<13){
	if(op==a)
	   System.out.println("input is "+a+" ,then output should be:Janury");

	else if(op==b)
	     System.out.println("input is "+b+" ,then output should be:February");
	     else if(op==c)
	           System.out.println("input is "+c+" ,then output should be:March");
	           else if(op==d)
	                 System.out.println("input is "+d+" ,then output should be:April");
	                 else if(op==e)
	                      System.out.println("input is "+e+" ,then output should be: May");
	                      else if(op==f)
	                            System.out.println("input is "+f+" ,then output should be:June");
	                            else if(op==g)
	                                 System.out.println("input is "+g+" ,then output should be:July");
	                                 else if(op==h)
	                                 	  System.out.println("input is "+h+" ,then output should be: August");
	                                 	  else if(op==i)
	                                 	       System.out.println("input is "+i+" ,then output should be: September");
	                                 	       else if(op==j)
	                                 	       	    System.out.println("input is "+j+" ,then output should be: October");
	                                 	       	    else if(op==k)
	                                 	       	         System.out.println("input is "+k+" ,then output should be: November");
	                                 	       	         else if(op==l)
	                                 	       	         	  System.out.println("input is "+l+" ,then output should be: December");	


}else
     System.out.println("EL Numero de mes es incorrecto");
    tf=System.currentTimeMillis();
	t=tf-ti;
	System.out.println("El tiempo de ejecucion en milisegundos es :"+t);
	
	}
}