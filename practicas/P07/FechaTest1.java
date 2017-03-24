public class FechaTest1{

	public static void main(String [] args){
		Fecha1 fecha1=new Fecha1();
		int opcion;
		int mes, dia, anio;


		System.out.println("Bienvenido a Tu agenda electronica\n En un momento se te preguntara como quieres asignar fechas\n");
		do{
		System.out.println(" 1.-Sin conocer nada\n 2.-Conociendo solo el dia\n 3.- Conociendo el dia y el mes\n 4.-Conociendo la fecha completa \n 5.-Salir");
		System.out.println("Elige una opcion");
		opcion=fecha1.leerenteros();

			switch(opcion){

					case 1:

						System.out.println("En momentos se genera tu fecha deseada");
						fecha1.asignarFecha();
						fecha1.imprimirfecha();

						break;

					case 2:
						System.out.println("Dame el dia que cononoces");
						dia=fecha1.leerenteros();
						fecha1.asignarFecha(dia);
						fecha1.imprimirfecha();

						break;

					case 3:
						System.out.println("Dame el dia que cononoces");
						 dia=fecha1.leerenteros();
						System.out.println("Dame el mes que cononoces");
						 mes=fecha1.leerenteros();
						fecha1.asignarFecha(dia,mes);
						fecha1.imprimirfecha();


						break;

					case 4:	

						System.out.println("Dame el dia que cononoces");
						dia=fecha1.leerenteros();
						System.out.println("Dame el mes que cononoces");
						 mes=fecha1.leerenteros();
						System.out.println("Dame el anio que cononoces");
						anio=fecha1.leerenteros();
						fecha1.asignarFecha(dia,mes,anio);
						fecha1.imprimirfecha();


						break;
			}



	}while(opcion!=5);
}
}