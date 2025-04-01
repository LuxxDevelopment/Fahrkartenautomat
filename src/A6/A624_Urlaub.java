package A6;

import java.util.Scanner;

public class A624_Urlaub {

    // Wechselkurse als Konstanten
    private static final double USD_KURS = 0.98; // Dollar
    private static final double JPY_KURS = 141; // Yen
    private static final double GBP_KURS = 0.88; // Pfund
    private static final double CHF_KURS = 0.96; // Franken
    private static final double DKK_KURS = 7.44; // Kronen

    // Scanner für Benutzereingaben
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Geben Sie Ihr gesamtes Reisebudget an:");
        double budget = readPositiveDouble();
        double reserve = budget * 0.1; // Eiserne Reserve = 10% des Budgets
        double verbleibendesGeld = budget - reserve;

        System.out.printf("Ihre Reserve beträgt: %.2f€\n", reserve);

        // Das Programm läuft, bis der Nutzer zuhause ist (z. B. bei Abbruch)
        while (true) {
            System.out.println("\nWelches Land wollen Sie auswählen?");
            System.out.println("D: Dänemark\nE: England\nJ: Japan\nS: Schweiz\nU: USA");
            System.out.println("Eingabe (oder X zum Beenden):");
            String land = scanner.nextLine().trim().toUpperCase();

            if (land.equals("X")) {
                System.out.printf("Programm wurde beendet. Reserve: %.2f€\n", reserve);
                break;
            }

            System.out.println("Wie viele Euros wollen Sie umwechseln?");
            double wechselbetrag = readPositiveDouble();

            // Prüfen, ob das Budget ausreicht
            while (wechselbetrag > verbleibendesGeld) {
                System.out.println("Sie haben nicht genug Budget. Bitte geben Sie einen kleineren Betrag ein:");
                wechselbetrag = readPositiveDouble();
            }

            // Währung umrechnen
            switch (land) {
                case "D":
                    wechsleGeld("DKK (Kronen)", wechselbetrag, DKK_KURS);
                    break;
                case "E":
                    wechsleGeld("GBP (Pfund)", wechselbetrag, GBP_KURS);
                    break;
                case "J":
                    wechsleGeld("JPY (Yen)", wechselbetrag, JPY_KURS);
                    break;
                case "S":
                    wechsleGeld("CHF (Franken)", wechselbetrag, CHF_KURS);
                    break;
                case "U":
                    wechsleGeld("USD (Dollar)", wechselbetrag, USD_KURS);
                    break;
                default:
                    System.out.println("Ungültige Eingabe. Bitte versuchen Sie es erneut.");
                    continue;
            }

            // Abziehen des Wechselbetrags
            verbleibendesGeld -= wechselbetrag;

            // Budget ausgeben
            System.out.printf("Ihr freies Reisebudget beträgt: %.2f€ + %.2f€ (Reserve)\n", verbleibendesGeld, reserve);

            // Prüfen, ob Budget unter die Reserve fällt
            if (verbleibendesGeld <= reserve) {
                System.out.println("Sie fallen unter Ihre Reserve.");
                System.out.println("Wollen Sie mehr in Ihre Reisekasse einzahlen? (y/n)");

                String eingabe = scanner.nextLine().trim().toLowerCase();

                if (eingabe.equals("y")) {
                    System.out.println("Geben Sie den Wert ein, den Sie einzahlen möchten:");
                    double nachzahlung = readPositiveDouble();
                    verbleibendesGeld += nachzahlung;
                    budget += nachzahlung; // Aktualisiertes Budget
                    verbleibendesGeld = budget - reserve; // Reserve bleibt konstant
                    System.out.printf("Neuer Reisekassen-Wert: %.2f€ + %.2f€ (Reserve)\n", verbleibendesGeld, reserve);
                } else {
                    System.out.printf("Programm wurde beendet. Reserve: %.2f€\n", reserve);
                    break;
                }
            }
        }
    }

    // Methode zum positiven Double-Einlesen
    private static double readPositiveDouble() {
        while (true) {
            try {
                double value = Double.parseDouble(scanner.nextLine().trim());
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Bitte geben Sie einen positiven Wert ein:");
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein:");
            }
        }
    }

    // Methode zum Umrechnen und Ausgeben des Wechselbetrags
    private static void wechsleGeld(String währungsname, double euroBetrag, double kurs) {
        double umgerechneterBetrag = euroBetrag * kurs;
        System.out.printf("Sie erhalten %.2f %s\n", umgerechneterBetrag, währungsname);
    }
}