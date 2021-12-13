package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class UserSalary {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee user = new Employee();
		
		System.out.print("Name: ");
		user.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		user.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		user.tax = sc.nextDouble();
		
		System.out.println();
		System.out.print("Employee: " + user);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		user.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.print("Update data: " + user);
		
		sc.close();

	}

}
