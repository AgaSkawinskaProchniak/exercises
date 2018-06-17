package exercises;
import java.util.Scanner;
import java.lang.Math.*;
import java.util.InputMismatchException;


public class Home {

	public static void main(String[] args) {
		double a;
		double b=3;
		boolean error=true;
		
		System.out.println("Podaj liczbę:");
		Scanner userNo = new Scanner(System.in);
		while(error) {
			
				try {
		a = userNo.nextDouble();
			System.out.println(Math.pow(a,b));
			error =false;
			}
		
		catch(InputMismatchException e) {
			System.out.println("To nie jest poprawna liczba!Spróbuj jeszcze raz...");
			userNo.next();
		}
		}
		}
			
		
		//System.out.println("Podaj drugą liczbę:");
		//b = userNo.nextInt();
		
		
		
	
	private static boolean couldDivideBy3And5(double a) {
			return a % 3 == 0 && a % 5==0;
		}
	
}
