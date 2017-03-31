import java.io.*;

public class Fecha{	
	private int dia;
	private int mes;
	private int anio;



	public int  leerenteros(){
		int x =0;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		
			try{
			x=Integer.parseInt(br.readLine());
	       }catch(IOException ex){
			System.out.println("Tu fecha no puede ser ingresada");
			}catch(NumberFormatException e){
				System.out.println("Tu numero no se puede ingresar");
			}

	        return x;
	}

	public void mes31(){
		if(dia>0 && dia<=31){

			System.out.println("Tu feha es correcta");
			System.out.println("Fecha : "+this.dia+" - "+this.mes+" - "+this.anio);

	}	else{
		System.out.println("Tu fecha es incorrecta");
	}
  }

	public void mes30(){
		if(dia>0 && dia<31){
			System.out.println("Tu fecha es correcta");
			System.out.println("Fecha : "+this.dia+"-"+this.mes+""+this.anio);

		}else
		System.out.println("Tu fecha es incorrecta");

	}

	public void bisiesto(){
		if(anio%4==0 && (anio%100!=0 || anio%400==0)){
			this.dia=this.dia+1;


		}
		System.out.println(this.dia);
	}


	public void asignarFecha(int dia_parametro,int mes_parametro ,int anio_parametro){
		
		this.dia=dia_parametro;
		this.mes=mes_parametro;
		this.anio=anio_parametro;

		System.out.println("Fecha:  "+this.dia+" / "+this.mes+" / "+this.anio);
		


	}

	public void obtenerfecha(int [] fechaobj){

		fechaobj[0] = this.dia;
		fechaobj[1] = this.mes;
		fechaobj[2] = this.anio;


		this.fechaCorrecta(fechaobj[0],fechaobj[1],fechaobj[2]);


	}

	public void fechaCorrecta(int dia , int mes, int anio){
		
		this.dia=dia;
		this.mes=mes;
		this.anio=anio;
		
		
			if(anio > 1581){
				if(mes>0 && mes <=12){
				switch (mes){

					case 1:
						mes31();
						break;

					case 2:
						if(dia == 28){
							bisiesto();
							System.out.println("Tu Fecha es correcta");
							System.out.println("Fecha : "+this.dia+"-"+this.mes+"-"+this.anio);
						}
						System.out.println("Fecha : "+this.dia+"-"+this.mes+"-"+this.anio);
						break;

					case 3:
						mes31();
						break;

					case 4:
						mes30();
						break;
					case 5:
						mes31();
						break;
					case 6:
						mes30();
						break;
					case 7:
						mes31();
						break;
					case 8:
						mes31();
						break;
					case 9:
						mes30();
						break;
					case 10:
						mes31();
						break;
					case 11:
						mes30();
						break;
					case 12:
						mes31();
						break;

						

						}


				}else
				System.out.println("Tu mes es incorrecto");

			}else
				System.out.println("Tu anio es incorrecto");

	}
}