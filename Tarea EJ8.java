/******************************************************************************
8. Realiza un programa que pida una hora por teclado y que muestre luego buenos días, buenas
tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5.
respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben introducir por
teclado.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int hora;
		System.out.print("Introduce la hora en sistema 24 horas (Solo hora): ");
		hora =s.nextInt();
		if(hora>=6 && hora<=12){
		   System.out.println("Buenos Días"); 
		}else if(hora>=13 && hora<=20){
		   System.out.println("Buenos Tardes"); 
		}else if(hora<=5 && hora>=0){
		   System.out.println("Buenos Noches"); 
		}else if(hora>=21 && hora<24){
		   System.out.println("Buenos Noches"); 
		}else{
		   System.out.println("Hora ingresado inválida");
		}
	}
}