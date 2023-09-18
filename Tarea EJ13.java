/******************************************************************************
13. Realiza un programa que nos diga cuántos dígitos tiene un número entero que puede ser
positivo o negativo. Se permiten números de hasta 5 dígitos.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int número;
        System.out.println("Ingrese el número a verificar: ");
        número= s.nextInt();
        if(número<0){
            número *= -1;
        }
		if (número>=10000 && número<=99999){
		    System.out.println("Es un número de 5 dígitos");
		}else if(número>=1000 && número<=9999){
		    System.out.println("Es un número de 4 dígitos");
	    }else if(número>=100 && número<=999){
	        System.out.println("Es un número de 3 dígitos");
        }else if(número>=10 && número<=99){
		    System.out.println("Es un número de 2 dígitos");
        }else if(número>=0 && número<=9){
		    System.out.println("Es un número de 1 dígitos");
}
}
}