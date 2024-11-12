package A1;

public class A115_Spezialkonfiguration {
    public static void main(String[] args) {
        String typ = "Automat AVR";
        String bezeichnung = "Q2021_FAB_A";
        String name = typ + " " + bezeichnung;
        char sprachModul = 'd';
        int PRUEFNR = 4;
        double maximum = 100.00;
        double patrone = 46.24;
        double prozent = maximum - patrone;
        int muenzenCent = 1280;
        int muenzenEuro = 130;
        int summe = muenzenCent + muenzenEuro * 100;
        double euro = summe / 100.0;
        int cent = summe % 100;
        boolean status = (euro <= 150) && (euro >= 50) && (cent != 0) && (sprachModul == 'd') && (prozent >= 50.00) && (!(PRUEFNR == 5 || PRUEFNR == 6));

        System.out.println("Name: " + name);
        System.out.println("Sprache: " + sprachModul);
        System.out.println("Prüfnummer : " + PRUEFNR);
        System.out.println("Füllstand Patrone: " + prozent + " %");
        System.out.println("Summe Euro: " + euro + " Euro");
        System.out.println("Summe Rest: " + cent + " Cent");
        System.out.println("Status: " + status);
    }
}