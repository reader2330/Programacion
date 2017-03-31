public class ConstructorTest{

	

	public static void main(String [] args){
		int opcion;
		int dia;
		int mes;
		int anio;
		FechaConstructor fecha1=new FechaConstructor();
		Fecha fechacon=new Fecha();

		System.out.println("Bienvenido al sistema de construccion ");
		do{
		System.out.println(" 1.-Construir una fecha sin paramteros\n 2.-Construir una fecha solo dando el dia \n 3.-Construir una fecha dando mes y dia \n 4.- Construir una fecha al gusto \n 5.- Salir");
		System.out.println("Dame una opcion");
		opcion=fecha1.leerenteros();

		switch(opcion){

			case 1:
				fecha1.FechaConstructor();
				fecha1.imprimirfecha();
				break;
			case 2:
				System.out.println("Dame un dia");
				dia=fecha1.leerenteros();
				if(dia>0 && dia <32){
				fecha1.FechaConstructor(dia);
				fecha1.imprimirfecha();
			 }	else{
				System.out.println("Tu  dia es invalido");
			 }
				break;
			
			case 3:
				fecha1.FechaConstructor(10,5);
				fecha1.imprimirfecha();
				break;
			case 4:
				fecha1.FechaConstructor(8,10,1990);
				fecha1.imprimirfecha();
				break;
			

		}
		System.out.println("");
	}while(opcion!=5);


}
}