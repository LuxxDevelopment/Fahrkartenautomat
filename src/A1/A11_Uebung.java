package A1;

public class A11_Uebung {
    public static void main(String[] args) {
        int cent;
        cent = 70;
        System.out.println(cent);
        cent = 80;
        System.out.println(cent);

        double maximum = 95.50;
        System.out.println(maximum);

        boolean wert1 = true;
        int wert2 = -1000;
        float wert3 = 1.255F;
        char wert4 = '#';
        int wert5 = 8;
        long wert6 = 2147483648L;

        System.out.println(
                "Wert 1: " + wert1 + "\n" + "Wert 2: " + wert2 + "\n" + "Wert 3: " + wert3 + "\n" + "Wert 4: " + wert4 + "\n" + "Wert 5: " + wert5 + "\n" + "Wert 6: " + wert6
        );

        String text = "Haste das Semicolon vergessen";
        final int PRUEFNUMMER = 8765;
        System.out.println(
                "Text: " + text + "\n" + "Check NR: " + PRUEFNUMMER
        );

        /*
        Warum Daten typen sinnvoll sind.
        - Es macht das Speichern im RAM schneller
        - Der Compiler muss das programm nicht durchsuchen, nach was für einen wert es Speichern soll.
        - Macht den Compile prozess generell schneller.
         */

        int ergebnis;
        ergebnis =  4+8*9-1;
        System.out.println("Ergebnis: " + ergebnis);

        int zaehler  = 1;
        zaehler++;
        System.out.println("Zaehler: " + zaehler);

        int ergebnis_division;
        ergebnis_division = 22/6;
        System.out.println("Ergebnis: " + ergebnis_division);

        int a = 0;
        a++;
        System.out.println(a);
        ++a;
        System.out.println(a);

        /*
        a++ & ++a
        Erhöhen beide die Variable a um eins

        a-- & --a
        Vermindern beide die Variable a um eins

        If Boolean check with operator &&
        false && false == false
        false && true == false
        true && false == false
        true && true == false

        If Boolean check with operator ||
        false || false = false
        false || true = true
        true  || false = true
        true  || true = true
         */

        int schalter = 10;
        if (schalter > 7 && schalter < 12) {
            System.out.println("Schalter ist zwischen 7 und 12");
        }

        System.out.println("Meine Oma " + "fährt im " + "Hühnerstall Motorrad.");
    }
}
