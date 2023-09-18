/******************************************************************************
10. Realiza un programa que calcule el tiempo que tardará en caer un objeto desde una altura h.
Aplica la fórmula
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		double h,t,g;
		System.out.println("Introduce la altura en metros: ");
		h =s.nextDouble();
		g=9.81;
		t= Math.sqrt( 2*h/g);
		System.out.println("El tiempo que demora en caer de "+h+" metros es "+t+" segundos");
		
	}
}