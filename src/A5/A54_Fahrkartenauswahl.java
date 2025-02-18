/**
 * Fahrkartenautomat übungsprojekt
 *
 * @author Lukas Koch (FI-A 45)
 * @version A5.4: Fahrkartenauswahl
 */
package A5;

import java.util.Scanner;
import java.util.UUID;

public class A54_Fahrkartenauswahl {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);

        double zuZahlenderBetrag = 0;
        int anzahlDerTickets;
        double eingezahlterGesamtbetrag;
        double eingeworfeneMuenze;
        double rueckgabebetrag;
        double nochZuZahlen;

        // Fahrkartenwahl
        while (true) {
            System.out.println("Wählen Sie Ihre Wunschfahrkarte für Berlin AB aus:");
            System.out.println("  Kurzstrecke AB [2,00 EUR] (1)");
            System.out.println("  Einzelfahrschein AB [3,00 EUR] (2)");
            System.out.println("  Tageskarte AB [8,80 EUR] (3)");
            System.out.println("  4-Fahrten-Karte AB [9,40 EUR] (4)");
            System.out.print("\nIhre Wahl: ");
            int wahl = tastatur.nextInt();

            if (wahl == 1) {
                zuZahlenderBetrag = 2.00;
                break;
            } else if (wahl == 2) {
                zuZahlenderBetrag = 3.00;
                break;
            } else if (wahl == 3) {
                zuZahlenderBetrag = 8.80;
                break;
            } else if (wahl == 4) {
                zuZahlenderBetrag = 9.40;
                break;
            } else {
                System.out.println(">>falsche Eingabe<<");
            }
        }

        // Anzahl der Tickets abfragen mit Wiederholung bei falscher Eingabe
        while (true) {
            System.out.print("Anzahl der Tickets: ");
            anzahlDerTickets = tastatur.nextInt();
            if (anzahlDerTickets > 0 && anzahlDerTickets <= 10) {
                break;
            } else {
                System.out.println("Fehlerhafte Eingabe - Bitte geben Sie eine Anzahl zwischen 1 und 10 ein.");
            }
        }

        zuZahlenderBetrag = zuZahlenderBetrag * anzahlDerTickets;

        // Geldeinwurf
        eingezahlterGesamtbetrag = 0.0;
        nochZuZahlen = 0.0;
        while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
            nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
            System.out.printf("Noch zu zahlen: %.2f Euro \n", nochZuZahlen);
            System.out.print("Eingabe (mind. 5 Cent, höchstens 2 Euro): ");
            eingeworfeneMuenze = tastatur.nextDouble();
            if (eingeworfeneMuenze != 2 && eingeworfeneMuenze != 1 && eingeworfeneMuenze != 0.5
                    && eingeworfeneMuenze != 0.2 && eingeworfeneMuenze != 0.1 && eingeworfeneMuenze != 0.05) {
                System.out.println("Ungültige Münzeinzahlung. Akzeptierte Werte: 2€, 1€, 50ct, 20ct, 10ct, 5ct.");
                continue;
            } else {
                eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
            }
        }

        // Fahrscheinausgabe
        System.out.println("\nFahrschein wird ausgegeben");
        for (int i = 0; i < 8; i++) {
            System.out.print("=");
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("\n\n");

        // Rückgeldberechnung und -ausgabe
        rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
        if (rueckgabebetrag > 0.0) {
            System.out.println("Der Rückgabebetrag in Höhe von " + rueckgabebetrag + " Euro");
            System.out.println("wird in folgenden Münzen ausgezahlt:");

            while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
                System.out.println("2 Euro");
                rueckgabebetrag = rueckgabebetrag - 2.0;
            }
            while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
                System.out.println("1 Euro");
                rueckgabebetrag = rueckgabebetrag - 1.0;
            }
            while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
                System.out.println("50 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.5;
            }
            while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
                System.out.println("20 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.2;
            }
            while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
                System.out.println("10 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.1;
            }
            while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
                System.out.println("5 Cent");
                rueckgabebetrag = rueckgabebetrag - 0.05;
            }
        }

        for (int i = 0; i < anzahlDerTickets; i++) {
            System.out.println("Fahrschein UID: " + UUID.randomUUID());
        }

        if (anzahlDerTickets > 1) {
            System.out.println("\nVergessen Sie nicht, die Fahrscheine\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                    + "Wir wünschen Ihnen eine gute Fahrt.");
        } else {
            System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
                    + "Wir wünschen Ihnen eine gute Fahrt.");
        }

        tastatur.close();
    }
}
