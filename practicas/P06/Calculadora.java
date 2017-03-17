import java.io.*;

public class Calculadora{

	private PrintStream fs=System.out;
	private InputStreamReader isr=new InputStreamReader(System.in);
	private BufferedReader br = new BufferedReader(isr);
	private String x="0";


	public void suma(){
		int num1;
		int num2;
		int res;
		try{
			fs.println("Dame un numero");

			x=br.readLine();

			num1=Integer.parseInt(x);

			fs.println("Dame un numero");

			x=br.readLine();

			num2=Integer.parseInt(x);

			res=num1+num2;

			fs.println("El resultado es :" +res);
		}catch(IOException ex){
			fs.println("Error");
		}
	}

	public void resta(){
		int num1;
		int num2;
		int res;
		try{
			fs.println("Dame un numero");

			x=br.readLine();

			num1=Integer.parseInt(x);

			fs.println("Dame un numero");

			x=br.readLine();

			num2=Integer.parseInt(x);

			res=num1-num2;

			fs.println("El resultado es :" +res);
		}catch(IOException ex){
			fs.println("Error");
		}
	}

	public void multiplicar(){
		int num1;
		int num2;
		int res;
		try{
			fs.println("Dame un numero");

			x=br.readLine();

			num1=Integer.parseInt(x);

			fs.println("Dame un numero");

			x=br.readLine();

			num2=Integer.parseInt(x);

			res=num1*num2;

			fs.println("El resultado es :" +res);
		}catch(IOException ex){
			fs.println("Error");
		}
	}

	public void dividir(){
		int num1;
		int num2;
		int res;
		try{
			fs.println("Dame un numero");

			x=br.readLine();

			num1=Integer.parseInt(x);

			fs.println("Dame un numero");

			x=br.readLine();

			num2=Integer.parseInt(x);
			if(num2!=0){

			res=num1/num2;

			fs.println("El resultado es :" +res);
		}
			else
				fs.println("La operacion no puede ser realizada");
		}catch(IOException ex){
			fs.println("Error");
		}
	}



	public int opcion(){
		int op=0;
		try{
			System.out.println("Bienvenido al programa Calculadora se te mostrara el siguente menu:");
			System.out.println(" 1.-suma\n 2.-resta \n 3.-multiplicar \n 4.-dividir \n 5.-salir");
			System.out.println("Elige una opcion:");
			x=br.readLine();
			op=Integer.parseInt(x);
		}catch(IOException ex){
			fs.println("Error");
		}

		return op;

	}










	public static void main(String[] args){
		Calculadora operacion1=new Calculadora();
		int op=0;
		do{
		op=operacion1.opcion();// objeto.metodo();

		switch(op){

			case 1:

				System.out.println("Bienvenido al sistema de suma");
				operacion1.suma();
				System.out.println("\n");
				break;
			case 2:

				System.out.println("Bienvenido al sistema de resta");
				operacion1.resta();
				System.out.println("\n");
				break;
			case 3:

				System.out.println("Bienvenido al sistema de multiplicar");
				operacion1.multiplicar();
				System.out.println("\n");
				break;
			case 4:

				System.out.println("Bienvenido al sistema de dividir");
				operacion1.dividir();
				System.out.println("\n");
				break;
			case 5:

				System.out.println("Adios");
				System.out.println("\n");
				break;
		}
	}while(op!=5);


	}

}