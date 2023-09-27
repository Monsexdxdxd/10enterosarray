package fmsr.formulario;
import java.util.Scanner;
public class Formulario 
{
    public static void main(String[] args) 
    {
        Scanner leer=new Scanner(System.in);
        int[]arreglo=new int[10];
        for(int cont=0; cont<=9; cont++)
        {
            System.out.print("Ingrese un entero: ");
            arreglo[cont]=leer.nextInt();
        }
        for(int cont=1; cont<=10; cont++)
        {
            System.out.print("Los valores sn: "+arreglo[cont]);
        }
    }
}
