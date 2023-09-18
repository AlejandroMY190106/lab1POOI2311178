/******************************************************************************
11. Escribe un programa que dada una hora determinada (horas y minutos), calcule los segundos
que faltan para llegar a la medianoche.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int horas,minutos,segundos;
		System.out.println("Introduce la hora en formato 24 horas: ");
		horas =s.nextInt();
		System.out.println("Introduce la minutos en formato 60 minutos: ");
		minutos =s.nextInt();
		segundos =(23-horas)*3600+(60-minutos)*60;
		System.out.println("Los segundos que faltan hasta media noche es "+segundos+" segundos");
		
	}
}