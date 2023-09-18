/******************************************************************************
14. Realiza un programa que, dado un día de la semana (de lunes a viernes) y una hora (horas y
minutos), calcule cuántos minutos faltan para el fin de semana. Se considerará que el fin de
semana comienza el viernes a las 15:00h. Se da por hecho que el usuario introducirá un día y
hora correctos, anterior al viernes a las 15:00h.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int día,horas,minutos;
        System.out.println("  N°    Día");
	    System.out.println("  1.   Lunes");
	    System.out.println("  2.   Martes");
	    System.out.println("  3.   Miércoles");
	    System.out.println("  4.   Jueves");
	    System.out.println("  5.   Viernes");
	    System.out.println("Escriba el número del día (1 al 5):");
	    día= s.nextInt();
		System.out.println("Introduce la hora en formato 24 horas: ");
		horas =s.nextInt();
		minutos =(5-día)*14400+(15-horas)*60;
		System.out.println("Los minutos que faltan hasta el fin de semana son "+minutos+" minutos");
		
}
}
