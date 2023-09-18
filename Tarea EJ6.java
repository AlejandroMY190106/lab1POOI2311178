/******************************************************************************
6. Realiza un programa que convierta valores de Mb a Kb.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		int  Mb, Kb;
		System.out.println("Ingresar la cantidad de Megabytes:");
        Mb = s.nextInt();
        Kb = Mb * 1024;
		System.out.println("Megabytes = "+ Mb);
		System.out.println("Kilobytes = "+ Kb);

	}
}