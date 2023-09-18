/******************************************************************************
15. Realiza el control de acceso a una caja fuerte. La combinación será un número de 4 cifras. El
programa nos pedirá la combinación para abrirla. Si no acertamos, se nos mostrará el mensaje
“Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte se ha abierto
satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner s = new Scanner(System.in);
        int contraseña,combinación;
        
        do{
        System.out.println("Establezca la contraseña: ");
        contraseña = s.nextInt();
        if(contraseña>9999 || contraseña<1000){
            System.out.println("Debe ser una contraseña de 4 números");
        }
        }while(contraseña>9999 || contraseña<1000);
        
        for(int i=1; i<=4;i++){
            System.out.println("Introducir la combinación:");
            combinación =s.nextInt();
            if(combinación == contraseña){
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                break;
            }else{
                System.out.println("Lo siento, esa no es la combinación");
            }
        }
        
}
}
