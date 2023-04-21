import java.util.Scanner;

/**
 * 
 */

/**
 * @author VG210A18
 *
 */
public class NotasAlumnos {
	public static void main(String[] args) { 
		Scanner dato = new Scanner(System.in);
		 float promnmay = 0;
		 float promfin = 0; 
		 float menor = 0;
		 float promenor = 0;
		 float promgral = 0;
		 int cuenta1 = 0;
		 int cuenta2 = 0;
		 int cuenta3 = 0;
		 int[] califica = new int[21]; 		 
		 System.out.print("*********************************************");
		 System.out.print("\n");
		 System.out.print("Notas finales de alumnos");
		 System.out.print("\n");
		for (int i = 0+1; i < 21; i++) {
		 System.out.print("Ingrese calificacion del 1 al 7 " + (i) + " a evaluar :"); 
		 califica[i] = dato.nextInt();
		} 
		for (int i = 1; i < califica.length; i++) {
		 if (califica[i] >= 5) { 
			 promnmay = promnmay + califica[i];
			 cuenta1 = cuenta1 + 1;
		 }
		 //promfin = promnmay/(califica.length - 1);
		 promfin = promnmay/cuenta1;
		 if (califica[i] < 5) { 
			 menor = menor + califica[i];
			 cuenta2 = cuenta2 + 1;
		 }
		 promenor = menor/cuenta2; 				
		 }
		promgral = (promnmay + menor) /(cuenta1 + cuenta2 );
		cuenta3 = cuenta2 + cuenta1;
		System.out.print("****************************************************");
		System.out.print("\n");
		System.out.print("Resultados de evaluaciones de alumnos escala 1 - 7 ");
		System.out.print("\n");
		System.out.print("****************************************************");
		System.out.print("\n");
		System.out.println(" El promedio notas >=5 es de : " + promfin);
		System.out.print("\n");
		System.out.println(" El promedio notas < 5 es de : " + promenor);
		System.out.print("\n");
		System.out.println(" El promedio general : " + promgral);
		System.out.print("\n");
		System.out.println(" Evaluaciones procesadas : " + cuenta3);
		
		} 
}
