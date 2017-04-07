import java.io.*;

public class Usuario{

	private String Nombre;
	private long Telefono;
	private String Direccion;
	private String Mail;
	private String Nickname;
	private int dia_nacimiento;
	private int mes_nacimiento;
	private int anio_nacimiento;
	private String contasena;


	public Usuario(){}

	public Usuario(long telefono){// Donde los usuario son del mes de Febrero
		this.Telefono=telefono;
	}

	public Usuario(String mail){// Donde los usarios sus correos llevan el subfijo @gmail.com
		
		this.Mail=mail;
	}

	public Usuario(int dia, int mes, int anio){ // Donde los usuarios son del mismo año
		this.dia_nacimiento=dia;
		this.mes_nacimiento=mes;
		this.anio_nacimiento=anio;

	}

	public String leercadenas(){
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		String x="0";
		int a=0;
		while(a==0){
			try{
				x=br.readLine();
				a++;
			}catch(IOException ex){
				System.out.println("Palabras no validas");
			}
		}
		return x;

	}

	public long leernumerolargos(){
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		long x=0;
		int a=0;

		while(a==0){
			try{
				x=Long.parseLong(br.readLine());
				a++;
			}catch(IOException ex){
				System.out.println("Palabras no validas");
			}catch(NumberFormatException ex){
				System.out.println("No se aceptan palabras como respuesta , deben ser numeros");

			}
		}

		return x;
	}

	public int leernumero(){
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		int x=0;
		int a=0;

		while(a==0){
			try{
				x=Integer.parseInt(br.readLine());
				a++;
			}catch(IOException ex){
				System.out.println("Palabras no validas");
			}catch(NumberFormatException ex){
				System.out.println("No se aceptan palabras como respuesta , deben ser numeros");

			}
		}

		return x;



	}

	public String getNombre(){
		String nombre="0";

		System.out.println("Dame el nombre");
		nombre=leercadenas();

		return nombre;
	}

	public void setNombre(String nombre){

		this.Nombre=nombre;

	}

	public long getTelefono(){

		long telefono=0;

		System.out.println("Dame el numero telefonico");
		telefono=leernumerolargos();

		return telefono;
	}

	public void setTelefono(long telefono){

		this.Telefono=telefono;

	}

	public String getDireccion(){
		String direccion="0";

		System.out.println("Dame tu direccion");
		direccion=leercadenas();

		return direccion;
	}

	public void setDireccion(String direccion){

		this.Direccion=direccion;
	}

	public String getMail(){

		String mail="0";

		System.out.println("Dame tu correo");
		mail=leercadenas();

		return mail;
	}

	public void setMail(String mail){

		this.Mail=mail;

	}

	public String getNickname(){

		String nickname="0";

		System.out.println("Dame tu Nickname");
		nickname=leercadenas();

		return nickname;
	}

	public void setNickname(String nickname){

		this.Nickname=nickname;

	}

	public int[] getFecha(){

		int fecha[]= new int [3];

		System.out.println("Dame tu dia de nacimiento");
		fecha[0]=leernumero();
		System.out.println("Dame tu mes de nacimiento");
		fecha[1]=leernumero();
		System.out.println("Dame tu anio de nacimiento");
		fecha[2]=leernumero();

		return fecha;
	}

	public void setFecha(int[] fecha){

		this.dia_nacimiento=fecha[0];
		this.mes_nacimiento=fecha[1];
		this.anio_nacimiento=fecha[2];
	}

	
	




}