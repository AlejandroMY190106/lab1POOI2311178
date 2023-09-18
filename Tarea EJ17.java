/******************************************************************************
17. Realiza un programa que vaya pidiendo números hasta que se introduzca un numero negativo y
nos diga cuantos números se han introducido, la media de los impares y el mayor de los pares.
El número negativo sólo se utiliza para indicar el final de la introducción de datos, pero no se
incluye en el cómputo
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int número, mediaimpar=0,mayorpar=0,contador=0,contadorimpar=0,sumaimpar=0;
        boolean i=false;
        do{
            contador++;
            System.out.println("Introduce un número");
            número = s.nextInt();
            if(número<0){
                break;
            }if(número%2 == 0){
                if(mayorpar<número){
                    mayorpar=número;
                } 
            }else{
                contadorimpar++;
                sumaimpar+=número;
                mediaimpar=sumaimpar/contadorimpar;
            }
        }while(i=true);
        System.out.println("La cantidad de números introducidos es "+ (contador - 1));
        System.out.println("La media de los impares es "+mediaimpar);
        System.out.println("El mayor número par es "+mayorpar);
}
}
