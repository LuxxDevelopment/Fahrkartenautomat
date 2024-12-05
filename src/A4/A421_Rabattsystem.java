package A4;
import java.util.Scanner;

public class A421_Rabattsystem {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int zu_zahlender_betrag = 0;
        float rabatt = 0f;
        System.out.print("Bitte geben Sie Ihren Bestellwert ein: ");
        zu_zahlender_betrag = tastatur.nextInt();
        if (zu_zahlender_betrag <= 100) {
            rabatt = 0.10f;
        } else if (zu_zahlender_betrag <= 500) {
            rabatt = 0.15f;
        } else {
            rabatt = 0.20f;
        }
        float reduzierter_betrag = zu_zahlender_betrag - (zu_zahlender_betrag * rabatt);
        System.out.printf("Der Bestellwert abzüglich Rabatt beträgt %.2f EUR", reduzierter_betrag);    }
}
