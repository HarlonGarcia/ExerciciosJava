package application;

import entities.Aumento;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class SalarioDoFuncionario {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Aumento> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("%nEmployee #%d:%n", i+1);
            System.out.print("ID: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            list.add(new Aumento(id, name, salary));
        }

        System.out.println();
        System.out.print("Enter the employee id that will be have salary increase: ");
        int id = sc.nextInt();

        Aumento var = list.stream().filter(a -> a.getId() == id).findFirst().orElse(null);

        if (var != null) {
            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            var.increaseSalary(percentage);
        } else {
            System.out.println("This id doesn't exist!");
        }

        System.out.println();
        System.out.println("List of employees:");

        for (Aumento x: list) {
            System.out.println(x);
        }
    }

}
