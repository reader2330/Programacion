import java.util.*;
import java.io.*;

public class FechaConstructor{
	private  int dia=0;
	private  int mes=0;
	private  int anio=0;



	public   void FechaConstructor(){
		asignarFecha();
	}

	public  void FechaConstructor(int dia_parametro){
		asignarFecha();
		this.dia=dia_parametro;

	}

	public  void FechaConstructor(int dia_parametro , int mes_parametro){
		asignarFecha();
		this.dia=dia_parametro;
		this.mes=mes_parametro;
	}

	public  void FechaConstructor(int dia_parametro, int mes_parametro, int anio_parametro){
		this.dia=dia_parametro;
		this.mes=mes_parametro;
		this.anio=anio_parametro;
	}


	public  int  leerenteros(){
		int x=0;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		try{
		x=Integer.parseInt(br.readLine());
	  }  catch(IOException ex){
		System.out.println("Tu numero  no puede ser ingresada");
	} catch(NumberFormatException ed){
		System.out.println("Tu numero  no puede ser ingresada");
	}
	return x;
	}

	public  void asignarFecha(){
		obtenerFecha1();
	
	}

	public void asignarFecha(int dia_param){
		obtenerFecha1();
		this.dia=dia_param;
		
		

	}

	public void asignarFecha(int dia_param, int mes_param){
		obtenerFecha1();
		this.dia=dia_param;
		this.mes=mes_param;
		
		
	}

	public void asignarFecha(int dia_param, int mes_param, int anio_param){
		this.dia=dia_param;
		this.mes=mes_param;
		this.anio=anio_param;
		
		
	}

  public  void obtenerFecha1(){
		Calendar falta=new GregorianCalendar();
		this.dia=falta.get(Calendar.DAY_OF_MONTH);
		this.mes=falta.get(Calendar.MONTH)+1;
		this.anio=falta.get(Calendar.YEAR);
	}

  public void imprimirfecha(){
		System.out.println("Fecha :"+this.dia+" / "+this.mes+" / "+this.anio);
	}
}