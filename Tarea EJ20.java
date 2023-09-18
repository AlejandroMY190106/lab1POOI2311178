/******************************************************************************
20. Escribe un programa que, dado un número entero, diga cuáles son y cuánto suman los dígitos
pares. Los dígitos pares se deben mostrar en orden, de izquierda a derecha. Usa long en lugar de
int donde sea necesario para admitir números largos.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        long número,digito,númeroinverso=0,suma=0;
        System.out.print("Ingrese un número entero largo: ");
        número = s.nextLong();
        while (número != 0) {
            digito = número % 10;
            númeroinverso = númeroinverso * 10 + digito;
            número = número / 10;
        }
        número = númeroinverso;
        if (número < 0) {
            número = -número;
        }
        if (número == 0) {
            System.out.print("0 ");
        }
        while (número > 0) {
            digito = número % 10;
            if(digito%2==0){
                System.out.println(digito);
                suma+=digito;
            }
            número = número / 10; 
        }
        System.out.println("La suma de los dígitos pares es: "+suma);
        
}
}