package application;

import java.util.Locale;
import java.util.Scanner;

public class CambioDollar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double quantity = sc.nextDouble();
		double toBePaid = CurrencyConverter(price, quantity);
		System.out.printf("Amount to be paid in reais = %.2f", toBePaid);
		
		sc.close();
	}
	
	public static double CurrencyConverter(double price, double quantity) {
		return price * quantity + (quantity * price) * 6.00 / 100.00;
	}

}
