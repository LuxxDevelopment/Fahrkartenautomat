package A5;

import java.util.Scanner;

public class A525_Treppe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Treppenhöhe: ");
        int hoehe = scanner.nextInt();

        System.out.print("Stufenbreite: ");
        int breite = scanner.nextInt();

        for (int i = 1; i <= hoehe; i++) {
            // Print the spaces
            for (int j = 0; j < (hoehe - i) * breite; j++) {
                System.out.print(" ");
            }
            // Print the stars
            for (int j = 0; j < i * breite; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
