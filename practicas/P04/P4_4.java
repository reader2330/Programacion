public class P4_4{
	public static void main(String[] args){
    	long ti,tf,t;
    	ti=System.currentTimeMillis();
    		int i,j;
    		int pos1;
    		int n,m=0;
    		float[] datos= {10,9,8,7,6,5,4,3,2,1};
    		float minimum=0;
    		float maximum=0;
    		float range;
    		float sum=0;
    		float count;
    		float mean;
    		float median;
    		float mode=0;
    		double standarddeviation;
    		double variance;
    		float midrange;
    		double aux=0,aux2;
    		minimum= datos[0];

    				for(i=0; i<10; i++){
    					if(minimum < datos[i]){

    				}else{
    					minimum = datos[i];
    				}	
				}

						maximum = datos[0];

				for(i=0; i<10; i++){
					if(maximum < datos[i])
						maximum = datos[i];
			}

		range=maximum-minimum;

		for( i=0; i<10; i++){
			sum=sum+datos[i];
		}

		count=datos.length;

		mean=sum/count;

		pos1=(int)count/2;
		median=(datos[pos1]+datos[pos1-1])/2;


		for(i=0; i<datos.length; i++){
			n=0;
			for(j=0; j<datos.length; j++){
				if(datos[i] == datos[j])
					n++;
			}
			if( n> m){
				mode= datos[i];
				m=n;
			}

		}

		for( i=0; i<10; i++){
			aux=aux+Math.pow(datos[i]-mean,2);

		}
		
		aux2=(1/(count-1))*(aux);
		
		standarddeviation=Math.sqrt(aux2);

		variance=aux2;

		midrange=(maximum+minimum)/2;




    		

    		

    	
			
					System.out.println("The minimum = "+minimum);
					System.out.println("The maximum = "+maximum);
					System.out.println("The range = " +range);
					System.out.println("The sum ="+sum);
					System.out.println("The count ="+count);
					System.out.println("The mean ="+mean);
					System.out.println("The median ="+median);
					System.out.println("The mode ="+mode);
					System.out.println("The Standard deviation ="+standarddeviation);
					System.out.println("The variance = "+variance);
					System.out.println("The midrange = "+midrange);

    	tf=System.currentTimeMillis();
    	t=tf-ti;
    	System.out.println("EL tiempo de ejecucion es: "+t);
			}

	}
