import java.util.Scanner;
public class Main
{
	public static void main(String[] args) { 
	 
   //1a
   if(6<6*5)
   System.out.print("Hello");
   System.out.print(" There");
	//Respuesta:Imprime Hello There
	
   //1b
   int x=1, y=2,z=3;
   if (x>y)
   if (x>z)
   System.out.println("1111");
   else 
   System.out.println("2222");
	//Respuesta: No se imprimirá nada
   
   //1c
   x=1 ;y=2; z=3;
   if(x<z)
   System.out.println("*");
   else if (x==z)
   System.out.println("&");
   else
   System.out.println("$");
   //Respuesta: Se imprimirá *
   
   //1d
   x=1 ;y=2; z=3;
   if(x<y)
      System.out.println("####");
   else{
      System.out.println("&&&&");
      System.out.println("****");
   }
   //Respuesta: Se imprimirá ####
   
   //1e
   x=1 ;y=2; z=3;
   if(x>y)
      System.out.println("####");
   else{
      System.out.println("&&&&");
      System.out.println("****");
   }
   //Respuesta: Se imprimirá &&&& ****
   
   //1f
   int a1=100; int a2=200;
   if(a1>100 && a2>200)
      System.out.print(a1+" "+a2+" "+(a1+a2));
   else
      System.out.print(a1+" "+a2+" "+(2*a1-a2));
   //Respuesta: Se imprimirá 100 200 0
      
   //1g
   x=1 ;y=2; z=3;
   if(++x > y++ || x-- >0)
      z++;
   else 
      z--;
   System.out.println(x+" "+y+" "+z);
   //Respuesta: Se imprimirá 1 3 4
   //1h
   x=1 ;y=2; z=3;
   if(x<y){
      System.out.println("####");
      System.out.println("****");
   }else{
      System.out.println("&&&&");
   }
   //Respuesta: Se imprimirá #### ****
   
   //1i
   x=1 ;y=2; z=3;
   if('x'>'y' || 66 > (int)('A'))
      System.out.println("#*#");
      
   //Respuesta: Se imprimirá #*#
   
   //1j
   x=1 ;y=2; z=3;
   if (x < z)
      System.out.println("*");
   else if (x==z)
      System.out.println("&");
   else
      System.out.println("$");
   //Respuesta: Se imprimirá *
}
}