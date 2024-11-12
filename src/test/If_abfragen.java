package test;

public class If_abfragen {
    public static void main(String[] args) {
        int schalter = 10;
        if (schalter < 10 || schalter > 12) {
            System.out.println("Absolut unnötige If abfrage, da sie immer true ist.");
        }
    }
}
