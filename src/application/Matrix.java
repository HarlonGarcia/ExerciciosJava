package application;

import java.util.Scanner;

public class Matrix {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[l][c];

        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                mat[i][x] = sc.nextInt();
            }
        }

        System.out.print("Digite o número que você quer buscar: ");
        int search = sc.nextInt();
        System.out.println();

        for (int i = 0; i < mat.length; i++) {
            for (int x = 0; x < mat[i].length; x++) {
                if (mat[i][x] == search) {
                    System.out.printf("Position %d,%d:%n", i, x);
                    if (x > 0) {
                        System.out.println("Left: " + mat[i][x - 1]);
                    }
                    if (x < mat[i].length -1) {
                        System.out.println("Right: " + mat[i][x + 1]);
                    }
                    if (i < mat.length -1) {
                        System.out.println("Down: " + mat[i + 1][x]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][x]);
                    }
                }
            }
        }

        sc.close();
    }
}