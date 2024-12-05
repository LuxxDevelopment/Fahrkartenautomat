package A4;

public class A424_Schaltjahr {
    public static void main(String[] args) {
        int jahr;
        int modulo;
        System.out.print("Bitte geben Sie das Jahr ein: ");
        jahr = Integer.parseInt(System.console().readLine());
        modulo = jahr % 4;
        if (modulo == 0) {
            modulo = jahr % 100;
            if (modulo == 0) {
                modulo = jahr % 400;
                if (modulo == 0) {
                    System.out.println("Das Jahr ist ein Schaltjahr");
                    return;
                }
            }
        }
        System.out.println("Das Jahr ist kein Schaltjahr");
    }
}
