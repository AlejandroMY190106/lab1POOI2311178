import java.util.Scanner;
public class Main
{
public static void main(String[] args) { 
Scanner s= new Scanner(System.in);
   int día;
   System.out.println("Introduzca el número para hallar el día de la semana");
   día = s.nextInt();
   switch(día){
      case 1:
         System.out.println("Lunes");
         break;
      case 2:
         System.out.println("Martes");
         break;
      case 3:
         System.out.println("Miércoles");
         break;
      case 4:
         System.out.println("Jueves");
         break;
      case 5:
         System.out.println("Viernes");
         break;
      case 6:
         System.out.println("Sábado");
         break;
      case 7:
         System.out.println("Domingo");
         break;
}
}
}