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
		 if (eva>num5 && eva < num6) {
			    System.out.println(" estanque casi lleno " + eva);
		}
		 if (eva> num4 && eva < num5)   {
			    System.out.println(" estanque 3/4 de capacidad" + eva);
		}
		 if (eva> num3 && eva < num4)   {
			    System.out.println(" con medio estanque" + eva);
		} 
		 if (eva> num2 && eva <num3)   {
			    System.out.println(" estanque suficiente" + eva);
		} 
		 if (eva> num1 && eva <num2)   {
			    System.out.println(" estanque insuficiente" + eva);
		} 
				
}
}
