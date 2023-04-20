import java.util.Scanner;

/**
 * 
 */

/**
 * @author VG210A18
 *
 */
public class Estanque {
	public static void main(String []args) 
	{
		int num1 = 1;
		int num2= 20;
		int num3= 35;
		int num4= 40;
		int num5= 60;
		int num6= 70;
		int eva =0;
		Scanner eg= new Scanner(System.in);
		System.out.println("Digite medida actual de litros gasolina");
	
		int ingre = eg.nextInt();
		if (ingre>=num6) {
			System.out.println("----------------------------------------");
			System.out.println("DIAGNOSTICO DE GASOLINA");
		    System.out.println(" ESTANQUE LLENO " + ingre);
	}
		 if (ingre>=num5 && ingre < num6) {
			 System.out.println("----------------------------------------");
				System.out.println("DIAGNOSTICO DE GASOLINA");
			    System.out.println(" estanque casi lleno " + ingre);
		}
		 if (ingre>= num4 && ingre < num5)   {
			 System.out.println("----------------------------------------");
				System.out.println("DIAGNOSTICO DE GASOLINA");
			    System.out.println(" estanque 3/4 de capacidad " + ingre);
		}
		 if (ingre>=num3 && ingre < num4)   {
			 System.out.println("----------------------------------------");
				System.out.println("DIAGNOSTICO DE GASOLINA");
			    System.out.println(" con medio estanque " + ingre);
		} 
		 if (ingre>= num2 && ingre <num3)   {
			 System.out.println("----------------------------------------");
				System.out.println("DIAGNOSTICO DE GASOLINA");
			    System.out.println(" estanque suficiente " + ingre);
		} 
		 if (ingre>= num1 && ingre <num2)   {
			 System.out.println("---------------------------------------*-");
				System.out.println("DIAGNOSTICO DE GASOLINA");
			    System.out.println(" estanque insuficiente " + ingre);
		} 
				
}
}
