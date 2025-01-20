package A4;

import java.util.Scanner;

public class A423_BMI {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Bitte geben Sie Ihre Körpergröße in cm an: ");
        int groesse = tastatur.nextInt();
        System.out.print("Bitte geben Sie Jetzt Ihr Gewicht in kg an: ");
        int gewicht = tastatur.nextInt();
        System.out.print("Als letztes geben Sie bitte Ihr Geschlecht an m/w: ");
        char geschlecht = tastatur.next().charAt(0);
        float bmi = (float) gewicht / ((groesse / 100f) * (groesse / 100f));
        String klasifizierung = "";
        switch (geschlecht) {
            case 'm':
                if (bmi <= 20) {
                    klasifizierung = "Leider bist du Untergewichtig";
                } else if (bmi > 20 && bmi <= 25) {
                    klasifizierung = "Du hast Normalgewicht";
                } else if (bmi >= 25) {
                    klasifizierung = "Leider bist du Übergewichtig";
                }
            case 'w':
                if (bmi <= 19) {
                    klasifizierung = "Leider bist du Untergewichtig";
                } else if (bmi > 19 && bmi <= 24) {
                    klasifizierung = "Du hast Normalgewicht";
                } else if (bmi >= 24) {
                    klasifizierung = "Leider bist du Übergewichtig";
                }
        }
        System.out.println(klasifizierung);
        System.out.printf("Dein BMI ist %.2f", bmi);
    }
}
