package A5;

import java.util.Scanner;

public class A523_Zinseszins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie die Laufzeit für den Vertrag an: ");
        int laufzeit = scanner.nextInt();

        System.out.print("Bitte geben Sie an, wie viel Kapital Sie anlegen: ");
        double kapital = scanner.nextDouble();

        System.out.print("Bitte geben Sie den Zinssatz an: ");
        double zinssatz = scanner.nextDouble();

        double ausgezahltesKapital = kapital * Math.pow(1 + (zinssatz / 100), laufzeit);

        System.out.printf("Eingezahltes Kapital: %.2f Euro%n", kapital);
        System.out.printf("Ausgezahltes Kapital: %.2f Euro%n", ausgezahltesKapital);
    }
}
