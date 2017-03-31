import java.io.*;

public class Datos{


	 public static int leerenteros(){
  	    int x =0;
  	    int a=0;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		while(a==0){
			try{
			x=Integer.parseInt(br.readLine());
			a++;
	       }catch(IOException ex){
			System.out.println("Tu fecha no puede ser ingresada");
			}catch(NumberFormatException e){
				System.out.println("Tu numero no se puede ingresar");
				//System.out.println("Vuelve a ingresar un numero no una letra ");

				//x=Integer.parseInt(br.readLine());
			}
		}		
	        return x;
  }

  public static String leercadenas(){
  		String x="0";
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
			try{
			x=br.readLine();
	       }catch(IOException ex){
			System.out.println("Tu fecha no puede ser ingresada");
			}catch(NumberFormatException e){
				System.out.println("Tu numero no se puede ingresar");
			}

	        return x;
  }
}