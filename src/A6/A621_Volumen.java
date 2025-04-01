package A6;

public class A621_Volumen {

    // Methode zur Berechnung des Volumens eines Würfels
    public static double volumenWuerfel(double seitenlaenge) {
        return Math.pow(seitenlaenge, 3); // Seitenlänge hoch 3
    }

    // main-Methode zum Testen
    public static void main(String[] args) {
        // Testaufrufe der Methode volumenWuerfel
        double ergebnis1 = volumenWuerfel(3); // Volumen für Seitenlänge 3
        double ergebnis2 = volumenWuerfel(5); // Volumen für Seitenlänge 5

        // Ergebnisse ausgeben
        System.out.println("Das Volumen eines Würfels mit Seitenlänge 3 ist: " + ergebnis1);
        System.out.println("Das Volumen eines Würfels mit Seitenlänge 5 ist: " + ergebnis2);
    }
}