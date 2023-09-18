/******************************************************************************
9. Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las
horas ordinarias (40 primeras horas de trabajo) se pagan a 12 soles la hora. A partir de la hora
41, se pagan a 16 soles la hora.
*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int  horas_trabajadas, salario_semanal;
        horas_trabajadas = 41;
        if(horas_trabajadas>=40){
            salario_semanal=(40*12)+(horas_trabajadas - 40)*16;
        }else{
            salario_semanal = horas_trabajadas * 12;
        }
		System.out.println("Horas Trabajadas :"+horas_trabajadas);
		System.out.println("Salario Semanal :"+salario_semanal+" soles");

	}
}