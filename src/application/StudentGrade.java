package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class StudentGrade {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas info = new Notas();
		
		info.name = sc.nextLine();
		info.a = sc.nextDouble();
		info.b = sc.nextDouble();
		info.c = sc.nextDouble();
		System.out.printf("FINAL GRADE = %.2f", info.SumGrades());
		System.out.println();
		
		if (info.SumGrades() >= 60.00) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS", 60.00 - info.SumGrades());
		}
		
		sc.close();
	}

}
