package A3;



public class A32_Ausgabe_Formatieren {
    public static void main(String[] args) {
        int radius = 4;
        // dist represents distance to the center
        double dist;

        // for horizontal movement
        for (int i = 0; i <= 2 * radius; i++) {

            // for vertical movement
            for (int j = 0; j <= 2 * radius; j++) {
                dist = Math.sqrt((i - radius) * (i - radius) +
                        (j - radius) * (j - radius));

                // dist should be in the range (radius - 0.5)
                // and (radius + 0.5) to print stars(*)
                if (dist > radius - 0.5 && dist < radius + 0.5)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("\n");
        }

        System.out.println("\n");
        System.out.println("\n");

        // Header der Tabelle
        System.out.printf("%-12s | %-10s%n", "Fahrenheit", "Celsius");
        System.out.println("------------------------------");

        // Array mit den spezifischen Fahrenheit-Werten
        int[] fahrenheitValues = {-20, -10, 0, 20, 30};

        // Werte für die Tabelle
        for (int fahrenheit : fahrenheitValues) {
            double celsius = (fahrenheit - 32) * 5.0 / 9.0;
            System.out.printf("%-12d | %-10.2f%n", fahrenheit, celsius);
        }

    }
}
