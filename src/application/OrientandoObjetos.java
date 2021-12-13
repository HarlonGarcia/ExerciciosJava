package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class OrientandoObjetos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the rectangle width and height: ");
		Rectangle x = new Rectangle();
		
		x.width = sc.nextDouble();
		x.height = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", x.Area());
		System.out.printf("PERIMETER = %.2f%n", x.Perimeter());
		System.out.printf("DIAGONAL = %.2f", x.Diagonal());
		
		sc.close();
	}

}
