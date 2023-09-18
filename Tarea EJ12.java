/******************************************************************************
12. Realiza un programa que diga si un número introducido por teclado es par y/o divisible entre 5.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int número;
        System.out.println("Ingrese el número a verificar: ");
        número= s.nextInt();
		if (número % 2 == 0){
		    System.out.println("Es un número par");
		}else{
		    System.out.println("Es un número no par");
		}
		if (número % 5 == 0){
		    System.out.println("Es múltiplo de 5");
		}else{
		    System.out.println("No es múltiplo de 5");
		}
		
	}
}