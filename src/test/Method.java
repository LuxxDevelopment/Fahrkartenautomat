package test;

public class Method {
    public static double berechne(double seitenlaenge) {
        double ergebniss = seitenlaenge * seitenlaenge * seitenlaenge;
        return ergebniss;
    }

    public static void main(String[] args) {
        double zahl1 = 2;

        double ergebnis = berechne(zahl1);
        System.out.printf("Das Ergebnis ist: %f", ergebnis);
    }
}
