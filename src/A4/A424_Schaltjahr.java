package A4;

public class A424_Schaltjahr {
    public static void main(String[] args) {
int jahr = 0; // Initialized variable to handle compilation
        int modulo;
System.out.print("Bitte geben Sie das Jahr ein: ");
java.util.Scanner scanner = new java.util.Scanner(System.in);
try {
    jahr = Integer.parseInt(scanner.nextLine());

if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
    System.out.println("Das Jahr ist ein Schaltjahr");
} else {
    System.out.println("Das Jahr ist kein Schaltjahr");
}

} catch (NumberFormatException e) {
    System.out.println("Ungültige Eingabe! Bitte geben Sie eine ganze Zahl ein.");
} finally {
    scanner.close();
}
    }
}
