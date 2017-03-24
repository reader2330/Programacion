import java.util.*;
import java.io.*;

public class Fecha1{
	private  int dia=0;
	private  int mes=0;
	private  int anio=0;



	public int  leerenteros(){
		int x=0;
		InputStreamReader isr= new InputStreamReader(System.in);
		BufferedReader br= new BufferedReader(isr);
		try{
		x=Integer.parseInt(br.readLine());
	  }  catch(IOException ex){
		System.out.println("Tu fecha no puede ser ingresada");
	}
	return x;
	}

	public void asignarFecha(){
		obtenerFecha1();
	
	}

	public void asignarFecha(int dia_param){
		this.dia=dia_param;
		obtenerFecha1();
		

	}

	public void asignarFecha(int dia_param, int mes_param){
		this.dia=dia_param;
		this.mes=mes_param;
		obtenerFecha1();
		
	}

	public void asignarFecha(int dia_param, int mes_param, int anio_param){
		this.dia=dia_param;
		this.mes=mes_param;
		this.anio=anio_param;
		obtenerFecha1();
		
	}

	

	public void obtenerFecha1(){
		Calendar falta=new GregorianCalendar();
		if(this.dia==0){
			this.dia=falta.get(Calendar.DAY_OF_MONTH);

		}if(this.mes==0){
			this.mes=falta.get(Calendar.MONTH)+1;

		}if(this.anio==0){
			this.anio=falta.get(Calendar.YEAR);
		}
	}

	public void imprimirfecha(){
		System.out.println("Fecha :"+this.dia+" / "+this.mes+" / "+this.anio);
	}
}