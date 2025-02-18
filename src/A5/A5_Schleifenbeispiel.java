package A5;

import java.util.Scanner;

public class A5_Schleifenbeispiel {
    public static void main(String[] args) {
        Scanner tastatur = new Scanner(System.in);
        int x = 0;
        System.out.print("Geben sie bitte eine Zahl ein: ");
        x = tastatur.nextInt();
        for (int i = 0; i < x; i++) {
            System.out.println("For Schleife: " + i);
        }
        int j = 0;
        while (j < x) {
            System.out.println("While Schleife: " + j * j);
            j++;
        }
    }
}
