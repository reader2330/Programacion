public class DirectorioUsuariosTest{

	public static void main(String [] args){
		boolean consulta;
		String nombre;
		String contrasena;
		String aux="n";
		int i;
		int opcion=0;

		Usuario obj1=new Usuario();
		DirectorioUsuarios obj2= new DirectorioUsuarios();
		DirectorioUsuarios listadeusuarios[] = new DirectorioUsuarios[2];
		listadeusuarios[0]=new DirectorioUsuarios("admi","contrasena");

		do{
			System.out.println("Bienvenido  \n 1.-Registro a un usuario \n 2.-Inicio de Sesion\n 3.-Salir\n");
			System.out.println("Elige un numero");
			opcion=obj1.leernumero();


			
			switch(opcion){


				case 1:	
				System.out.println("Bienvenido al sistema de Registro");
				for(i=1;i<listadeusuarios.length;i++){
					System.out.println("Dame tu usuario a registar");
					nombre=obj1.leercadenas();
					System.out.println("Password a registar");
					contrasena=obj1.leercadenas();
					listadeusuarios[i]=new DirectorioUsuarios(nombre,contrasena);
				} 
				break;

				case 2:

				do{
					System.out.println("Bienvenido al inicio de Sesion\n");
					System.out.println("Nombre de usario:");
					nombre=obj1.leercadenas();
					System.out.println("Password:");
					contrasena=obj1.leercadenas();
					consulta=obj2.iniciarSesion(listadeusuarios,nombre,contrasena);

					if(consulta==true ){
						System.out.println("Acceso Correcto\n");
					}else{
						System.out.println("Acceso Denagado");
						System.out.println("Quieres volver iniciar sesion(S/N)\n");
						aux=obj1.leercadenas();
					}

				}while( consulta==false && aux.equals("s"));

				break;

				case 3:

				System.out.println("Adios");
				break;


				default:
				System.out.println("Opcion no valida");

			}

		}while(opcion!=3);



	}
}