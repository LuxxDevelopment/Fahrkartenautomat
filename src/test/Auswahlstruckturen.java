package test;

import java.util.Scanner;

public class Auswahlstruckturen {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int zahl = 0;
        System.out.print("Bitte gib eine Zahl ein: ");
        zahl = tastatur.nextInt();
        if (zahl == 0) {
            System.out.print("Sie haben eine 0 eingegeben.");
        } else if (zahl >= 1 && zahl <= 10) {
            System.out.print("Eingaben ist zwischen. 1 u. 10");
        } else if (zahl > 10 && zahl <= 20) {
            System.out.print("Eingaben ist zwischen. 11 u. 20");
        } else if (zahl > 20 && zahl <= 30) {
            System.out.print("Eingaben ist zwischen. 21 u. 30");
        } else {
            System.out.printf("Sie haben eine %d eingegeben.", zahl);
        }

        if (zahl < 0) {
            System.out.println("Eingegebene Zahl ist negativ.");
        } else {
            System.out.println("Eingegebene Zahl ist positiv.");
        }
    }
}
