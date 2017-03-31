public class FechaTest{
	
	public static void main(String [] args){
		Fecha fecha=new Fecha();
		Fecha fecha1=new Fecha();
		int opcion;
	do{
		System.out.println("Bienvenido a tu agenda electronica en un momento veras las opciones a elegir");
		System.out.println(" 1.-Mostrar Fecha \n 2.-Destruir Fecha\n 3.-Salir");
		System.out.println("Elige una opcion\n");
		opcion=fecha.leerenteros();
		
		switch(opcion){
			case 1:
				System.out.println("Bienvenido al sistema de Mostar  fecha");
				fecha.asignarFecha(2,5,2000);
				break;
			case 2:
				System.out.println("Bienvenido al sistema de Destruir fecha");
				fecha=fecha1;
				fecha1=null;
				System.out.println("El objeto sera destruido");
				break;

		}
		System.out.println("");

	   }while(opcion!=3);






		


	}
}