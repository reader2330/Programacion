public class P4_A{


	public static void incorrectPasscodeAttempts(String passcode, String [] attempts, int l){


		int i;
		int j=0;
		int x=0;
		boolean bool=true;

			for(i=0;i<l;i++){

				if(j<10){
					if(attempts[i].equals(passcode))
					j=0;
						
					else
					j++;
				
				bool=false;
			}else
				bool=true;
			}



			if(bool == true){
					System.out.println(""+bool);
					System.out.println("El dispositivo sera bloqueado");
				
				}else{	
					System.out.println(""+bool);
					System.out.println("Se accedio al sistema exitosamente");
				}

		}


	public static void main(String[] args){
	
		int longitud;
		int i;
		boolean bool=true;


		String passcode="2330";

		String [] attempts={"1234","2548","5879","1234","5879","1234","4589","1548","5489","2330","1234","1234","1234"};


		longitud=attempts.length;
		
			if( (longitud >= 0) && (longitud <= 20)){

				incorrectPasscodeAttempts(passcode,attempts,longitud);

			}else

			System.out.println("Excedio el numero de intentos");

		


	}
}
