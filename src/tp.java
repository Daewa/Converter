import java.util.Scanner; 
import java.util.*;
public class tp {

	
	public static void main(String[] args) {
		
		
		System.out.println("CONVERTISSEUR CELSIUS/FARENHEIT");
		
		int mode = 0;
		
		do{
			System.out.println("Mode de convertion :");
			System.out.println("1: CELSIUS->FARENHEIT");
			System.out.println("2: FARENHEIT->CELSIUS");
			Scanner sc = new Scanner(System.in);
			mode = sc.nextInt();
			
		}while (mode != 1 && mode != 2);
		
		System.out.println("Température à convertir :");
		
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		switch (mode)
		{
		  case 1:
		    System.out.println(temp+"C° = "+(((9.0/5.0)*temp)+32)+"F°");
		    break;
		  case 2:
			System.out.println(temp+"F° = "+(((temp-32)*5)/9)+"C°");
		    break;
		}
	}
	
	public static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
		}

}
