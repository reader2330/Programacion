public class FechaTest{
	
	public static void main(String [] args){
		Fecha fecha=new Fecha();
		int opcion;
	do{
		System.out.println("Bienvenido a tu agenda electronica en un momento veras las opciones a elegir");
		System.out.println("1.-Asignar Fecha \n 2.-Obtener Fecha\n 3.-Salir");
		System.out.println("Elige una opcion");
		opcion=fecha.leerenteros();
		
		switch(opcion){
			case 1:
				System.out.println("Bienvenido al sistema de asignar fecha");
				fecha.asignarFecha();
				break;
			case 2:
				System.out.println("Bienvenido al sistema de obtener fecha");
				int fechaobj[]=new int [3];
				fecha.obtenerfecha(fechaobj);
				break;

		}

	   }while(opcion!=3);






		


	}
}