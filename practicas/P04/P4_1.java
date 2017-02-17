
import java.io.*;
import java.util.Arrays;

public class P4_1 {
	public static void main(String[] args) {
     	long ti,tf,tiempo;
     	int i;
     	int n=0;
     	boolean igual=true;
     		ti=System.currentTimeMillis();

     	String word="aretes";
     	String word_2="teresa";
     	int s1;
     	int s2;
            
     	 	
     		s1=word.length();
     		s2=word.length();

     		char comp1[]=word.toCharArray();
     		char comp2[]=word_2.toCharArray();
     	
     		Arrays.sort(comp1);
     		Arrays.sort(comp2);
            
     		if(s1==s2){
     				for( i=0; i<s1; i++){
     					if(comp1[i] != comp2[i]){
     						igual=false;

     					
     					}
     				}
     		     	if(igual==true){
     				System.out.println("for example  "+word+" ,is an anagram of  "+word_2);
     			}else
     					System.out.println("La palabra no es un anagrama");

     		}else
     			System.out.println("La palabra no es un anagrama");

     	
     	tf=System.currentTimeMillis();
     	tiempo=tf-ti;
     	System.out.println("El tiempo de ejecucion es:"+tiempo);
	}
}