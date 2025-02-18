package A5;

import java.util.Scanner;

public class A521_Addieren_BW {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        System.out.print("Geben sie bitte eine Zahl ein: ");
        int zahl = tastatur.nextInt();
        System.out.println("Die Zahlen werden addiert:");
        int solution = 0;
        for (int i = zahl; i > 0; i--) {
            System.out.println(i);
            solution += i;
        }
        System.out.println();
        System.out.println("Die Summe beträgt: " + solution);
    }
}
