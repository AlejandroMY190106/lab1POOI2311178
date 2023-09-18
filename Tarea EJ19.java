/******************************************************************************
19. Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El programa pedirá la
altura. El palo horizontal de la L tendrá una longitud de la mitad (división entera entre 2) de la
altura más uno.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int altura;
        System.out.println("Ingrese la altura de la letra L: ");
        altura =s.nextInt();
        if (altura < 2) {
            System.out.println("La altura debe ser al menos 2 para que la letra L este bien");
        } else {
            System.out.println("Letra L:");

            for (int i = 1; i <= altura; i++) {
                if (i == altura) {
                    for (int j = 1; j <= (altura / 2) + 1; j++) {
                        System.out.print("*");
                    }
                } else {
                    System.out.println("*");
                }
            }
        }
}
}