public class ProyectoTest{

  public static void main(String [] args){

  	HoraMenu horaactual=new HoraMenu();
  	ComidaMenu comida1=new ComidaMenu();

  	int opcion;
  	String aux;
  	do{
  	int hora=horaactual.ObtenerHora();

  	  opcion= 2; //horaactual.VerificarHora(hora);

  	  
  	   switch(opcion){
  	   	  
  	   	  case 1:
  	   	  	comida1.getMenuDesayuno_platofuerte();
  	   	  	comida1.getMenuDesayuno_bebida();
  	   	  	System.out.println("Deseas algun postres S/N");
  	   	  	aux=comida1.leercadenas();
  	   	  	if(aux.equals("S") || aux.equals("s") )
  	   	  	comida1.getMenuDesayuno_postre();
  	   	  	System.out.println("Tu comida costara "+comida1.preciofinal);
  	   	  	break;
  	   	  case 2:

  	   	  	comida1.getMenuComida_platofuerte();
  	   	  	comida1.getMenuComida_bebida();
  	   	  	System.out.println("Deseas algun postres S/N");
  	   	  	aux=comida1.leercadenas();
  	   	  	if(aux.equals("S") || aux.equals("s") )
  	   	  	comida1.getMenuComida_postre();
  	   	  	System.out.println("Tu comida costara "+comida1.preciofinal);
  	   	  	break;

  	   	  case 3:

  	   	  	comida1.getMenuCena_platofuerte();
  	   	  	comida1.getMenuCena_bebida();
  	   	  	System.out.println("Tu comida costara "+comida1.preciofinal);
  	   	  	break;






  	   }
  	  }while(opcion!=4);

  		
  }



}