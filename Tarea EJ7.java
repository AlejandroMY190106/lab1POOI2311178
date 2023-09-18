/******************************************************************************
7. Realiza un programa que calcule la nota que hace falta sacar en el segundo examen de la
asignatura Programación para obtener la media deseada. Hay que tener en cuenta que la nota
del primer examen cuenta el 40% y la del segundo examen un 60%. En la imagen se muestra el
funcionamiento del programa.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
		double nota_Ex1,nota_Ex2,nota_Requerida;
		System.out.print("Introduce la nota del primer examen: ");
		nota_Ex1 =s.nextFloat();
		System.out.println("¿Qué nota quieres sacar en el trimestre?");
		nota_Requerida=s.nextFloat();
		nota_Ex2 = (nota_Requerida - nota_Ex1*0.4) *10/6;
		System.out.println("Para tener "+nota_Requerida+" en el trimestre necesitas sacar un "+nota_Ex2+" en el segundo examen");
		
	}
}