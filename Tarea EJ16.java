/******************************************************************************
16. Escribe un programa que lea una lista de diez números y determine cuántos son positivos, y
cuántos son negativos.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int número, cpar = 0, cimpar = 0;
        for(int i=1; i<=10;i++){
            System.out.println(i+") Ingrese número ");
            número = s.nextInt();
            if (número%2 == 0){
                cpar++;
            }else{
                cimpar++;
            }
        }
        System.out.println("La cantidad de números pares son :"+cpar);
        System.out.println("La cantidad de números impares son :"+cimpar);
}
}
