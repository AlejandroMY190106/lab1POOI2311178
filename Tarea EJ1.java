/******************************************************************************
1. Escribe un programa en el que se declaren las variables enteras Número1 e Número2. Asígnales los valores 144 y
999 respectivamente. A continuación, muestra por pantalla el valor de cada variable, la suma, la
resta, la división y la multiplicación.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		float Número1,Número2,suma,resta,división,multiplicación;
		Número1= 144; Número2=999;
		suma=Número1+Número2;
		resta=Número1-Número2;
		división=Número1/Número2;
		multiplicación=Número1*Número2;
		System.out.println("Número1 = "+Número1);
		System.out.println("Número2 = "+Número2);
		System.out.println("SUMA = "+suma);
		System.out.println("RESTA = "+resta);
		System.out.println("DIVISIÓN = "+división);
		System.out.println("MULTIPLICACIÓN = "+multiplicación);
	}
}