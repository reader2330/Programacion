public class UsuarioTest{

	public static void main(String [] args){
		Usuario usuario0 = new Usuario();
		int opcion=0;
		int mes,dia,anio;
		int fecha[]=new int [3];
		int aux=0;
		int cont=0;
		String nombre="0";
		long telefono;
		String direccion,nickname,mail;



		do{
			System.out.println("\n\nBienvenido");
			System.out.println(" 1.-Construir un usuario con un fecha dada\n 2.- Construir un usuario dando un correo dado\n 3.-Construir un usuario dando telefono ");
			System.out.println(" 4.-Construir un usuario desde cero\n 5.-Salir");
			System.out.println("Dame un numero de opcion");
			opcion=usuario0.leernumero();


			

			switch(opcion){

				case 1:

				System.out.println("Bienvenido al constructor de usario con un fecha  dado");
				System.out.println("Dame un dia defecto");
				dia=usuario0.leernumero();
				System.out.println("Dame un mes defecto");
				mes=usuario0.leernumero();
				System.out.println("Dame un anio defecto");
				anio=usuario0.leernumero();
				
				Usuario usuario01 = new Usuario(mes);
				System.out.println("Llenaras los datos siguientes");
				
				while(aux==0){
					nombre=usuario01.getNombre();
					usuario01.setNombre(nombre);
					telefono=usuario01.getTelefono();
					usuario01.setTelefono(telefono);
					direccion=usuario01.getDireccion();
					usuario01.setDireccion(direccion);
					mail=usuario01.getMail();
					usuario01.setMail(mail);
					nickname=usuario01.getNickname();
					usuario01.setNickname(nickname);
					aux++;
				}
				if(aux!=0)
					System.out.println("Se creo el usuario satisfactoriamente");
				else
					System.out.println("No se pudo crear el usario");
				break;

				case 2:

				System.out.println("Bienvenido al constructor de usario con un correo  dado");
				System.out.println("Dame un corro defecto");
				mail=usuario0.leercadenas();
				Usuario usuario02 = new Usuario(mail);
				System.out.println("Llenaras los datos siguientes");
				
				while(aux==0){
					nombre=usuario02.getNombre();
					usuario02.setNombre(nombre);
					telefono=usuario02.getTelefono();
					usuario02.setTelefono(telefono);
					direccion=usuario02.getDireccion();
					usuario02.setDireccion(direccion);
					nickname=usuario02.getNickname();
					usuario02.setNickname(nickname);
					fecha=usuario02.getFecha();
					usuario02.setFecha(fecha);
					aux++;
				}
				if(aux!=0)
					System.out.println("Se creo el usuario satisfactoriamente");
				else
					System.out.println("No se pudo crear el usario");
				break;

				case 3:


				System.out.println("Bienvenido al constructor de usario con un telefono  dado");
				System.out.println("Dame un telefono defecto");
				telefono=usuario0.leernumerolargos();
				Usuario usuario03 = new Usuario(telefono);
				System.out.println("Llenaras los datos siguientes");
				
				while(aux==0){
					nombre=usuario03.getNombre();
					usuario03.setNombre(nombre);
					direccion=usuario03.getDireccion();
					usuario03.setDireccion(direccion);
					mail=usuario03.getMail();
					usuario03.setMail(mail);
					nickname=usuario03.getNickname();
					usuario03.setNickname(nickname);
					fecha=usuario03.getFecha();
					usuario03.setFecha(fecha);
					aux++;
				}
				if(aux!=0)
					System.out.println("Se creo el usuario satisfactoriamente");
				else
					System.out.println("No se pudo crear el usario");
				break;

				case 4:

				System.out.println("Bienvenido al constructor de usario desde cero");
				Usuario usuario04 = new Usuario();
				System.out.println("Llenaras los datos siguientes");
				
				while(aux==0){
					nombre=usuario04.getNombre();
					usuario04.setNombre(nombre);
					telefono=usuario04.getTelefono();
					usuario04.setTelefono(telefono);
					direccion=usuario04.getDireccion();
					usuario04.setDireccion(direccion);
					mail=usuario04.getMail();
					usuario04.setMail(mail);
					nickname=usuario04.getNickname();
					usuario04.setNickname(nickname);
					fecha=usuario04.getFecha();
					usuario04.setFecha(fecha);
					aux++;
				}
				if(aux!=0)
					System.out.println("Se creo el usuario satisfactoriamente");
				else
					System.out.println("No se pudo crear el usario");
				break;

				case 5:

				System.out.println("!Adios Muchas gracias!");
				break;

				default:

				System.out.println("Opcion no valida, elige una correcta del menu");

			}

		}while(opcion!=5);



	}
}