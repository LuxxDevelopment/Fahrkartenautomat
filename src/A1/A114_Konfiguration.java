package A1;

public class A114_Konfiguration {
    public static void main(String[] args) {
        String name = "Automat AVR Q2021_FAB_A";
        char sprachModul = 'd';
        final int PRUEFNR = 142;
        double prozent = 49.16;
        double euro = 53.76;
        byte cent = 80;
        boolean status = true;

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Prüfnummer : " + PRUEFNR);
        System.out.println("Füllstand: " + prozent + " %");
        System.out.println("Summe Euro: " + euro + " Euro");
        System.out.println("Summe Rest: " + cent + " Cent");
        System.out.println("Status: " + status);
    }
}