package A5;

import java.util.Scanner;

public class A524_Matrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte geben Sie eine Ziffer zwischen 2 und 9 ein: ");
        int ziffer = scanner.nextInt();

        if (ziffer < 2 || ziffer > 9) {
            System.out.println("Ungültige Eingabe. Bitte starten Sie das Programm erneut und geben Sie eine Ziffer zwischen 2 und 9 ein.");
            return;
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int zahl = i * j;

                if (enthaeltZiffer(zahl, ziffer) || durchTeilbar(zahl, ziffer) || hatQuersumme(zahl, ziffer)) {
                    System.out.printf("%4s", "*");
                } else {
                    System.out.printf("%4d", zahl);
                }
            }
            System.out.println();
        }
    }

    private static boolean enthaeltZiffer(int zahl, int ziffer) {
        return String.valueOf(zahl).contains(String.valueOf(ziffer));
    }

    private static boolean durchTeilbar(int zahl, int ziffer) {
        return zahl % ziffer == 0;
    }

    private static boolean hatQuersumme(int zahl, int ziffer) {
        int quersumme = 0;

        while (zahl > 0) {
            quersumme += zahl % 10;
            zahl /= 10;
        }

        return quersumme == ziffer;
    }
}
