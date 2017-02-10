public class P3_4{
	public static void main(String[] args){
    
   String op; 
   String a="January";
   String b="February";
   String c="March";
   String d="April";
   String e="May";
   String f="June";
   String g="July";
   String h="August";
   String i="September";
   String j="October";
   String k="November";
   String l="December";
   long ti , tf, t;
  ti=System.currentTimeMillis();
  op="May";
      switch(op){
         case "January":
           System.out.println("input is  " +a+" ,then output should be: 30");
           break;
        case "February":
           System.out.println("input is  " +b+" ,then output should be: 29");
           break;
        case "March":
           System.out.println("input is  " +c+" ,then output should be: 31");
           break;
         case "April":
           System.out.println("input is  " +d+" ,then output should be: 30");
           break;
        case "May":
           System.out.println("input is  " +e+" ,then output should be: 31");
           break;
        case "June":
           System.out.println("input is  " +f+" ,then output should be: 30");
           break;
        case "July":
           System.out.println("input is  " +g+" ,then output should be: 31");
           break;
        case "August":
           System.out.println("input is  " +h+" ,then output should be: 31");
           break;
        case "September":
           System.out.println("input is  " +i+" ,then output should be: 30");
           break;
         case "October":
           System.out.println("input is  " +j+" ,then output should be: 31");
           break;
         case "November":
           System.out.println("input is  " +k+" ,then output should be: 30");
           break;
        case "December":
           System.out.println("input is  " +l+" ,then output should be: 31");
           break;

        default:
            System.out.println("EL nombre del mes es invalido");

        




      }
  tf=System.currentTimeMillis();
  t=tf-ti;
  System.out.println("El tiempo de ejecucion en milisegundos es :"+t);

	}
}
