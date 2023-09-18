/******************************************************************************
18. Escribe un programa que muestre por pantalla todos los números enteros positivos menores a
uno leído por teclado que no sean divisibles entre otro también leído de igual forma.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int número,númerocondicional;
        System.out.println("Introducir el número");
        número =s.nextInt();
        System.out.println("Introducir el condicional");
        númerocondicional=s.nextInt();
        System.out.println("Los números enteros positivos menores a "+número+" pero que no son divisibles entre "+ númerocondicional +" son");
        do{
           número--;
           
           if(número %  númerocondicional!=0)
           System.out.println(número);
        }while(número>=1);
        
}
}
