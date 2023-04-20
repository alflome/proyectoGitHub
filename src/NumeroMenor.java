import java.util.Scanner;

/**
 * 
 */

/**
 * @author VG210A18
 *
 */
public class NumeroMenor {
	public static void main(String []args) 
	{
		//evaluacion de numero mayor en operador ternario
		/*int numero1 = 5; */
		int numero1 = 5;
		int numero2 = 10;
		int mayor = (numero1 > numero2) ? numero1: numero2;
		
		int max =0;
		Scanner s= new Scanner(System.in);
		System.out.println("Ingrese  un numero");
		int num1 = s.nextInt();
		
		System.out.println("Ingrese  un numero2");
		int num2 = s.nextInt();
		
		max = (num1 > num2) ? num1:num2;
		System.out.println("*--------------------*");
		System.out.println("*NUMEROS ORDENADOS*");
		 if (num1 > num2)   {
			    System.out.println("  numero mayor = " + num1);
	        	System.out.println("  numero menor = " + num2);
		} 
	        else {
	        	System.out.println(" numero mayor = " + num2);
	        	System.out.println(" numero menor = " + num1);
	        } 
}
}
