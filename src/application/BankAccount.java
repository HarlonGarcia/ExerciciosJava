package application;

import java.util.Locale;
import java.util.Scanner;
import entities.BankEntities;

public class BankAccount {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		BankEntities bankEntities;
		
		System.out.print("Enter account number: ");
		int accNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		String accHolder = sc.next();
		System.out.println("Is there an initial deposit? (y/n)");
		char yesOrNo = sc.next().charAt(0);
		
		if ( yesOrNo == 'y') {
			System.out.print("Enter initial deposit value: ");
			double bankValue = sc.nextDouble();
			bankEntities = new BankEntities(accNumber, accHolder, bankValue);
		} else {
			bankEntities = new BankEntities(accNumber, accHolder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bankEntities);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double bankValue = sc.nextDouble();
		bankEntities.depositValue(bankValue);
		System.out.println("Updated account data:");
		System.out.println(bankEntities);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		bankValue = sc.nextDouble();
		bankEntities.withDraw(bankValue);
		System.out.println("Updated account data:");
		System.out.print(bankEntities);
		
		sc.close();
	}
}