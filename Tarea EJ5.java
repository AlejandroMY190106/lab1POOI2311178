/******************************************************************************
5. Escribe un programa que calcule el salario semanal de un empleado en base a las horas
trabajadas, a razón de 12 euros la hora.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int  horas_trabajadas, salario_semanal;
        horas_trabajadas = 30;
        salario_semanal = horas_trabajadas * 12;
		System.out.println("Horas Trabajadas :"+horas_trabajadas);
		System.out.println("Salario Semanal :"+salario_semanal+" euros");

	}
}