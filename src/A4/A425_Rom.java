package A4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A425_Rom {

    public static int convertRomanToDecimal(String roman) {
        Map<Character, Integer> romanToDecimalMap = new HashMap<>();
        romanToDecimalMap.put('I', 1);
        romanToDecimalMap.put('V', 5);
        romanToDecimalMap.put('X', 10);
        romanToDecimalMap.put('L', 50);
        romanToDecimalMap.put('C', 100);
        romanToDecimalMap.put('D', 500);
        romanToDecimalMap.put('M', 1000);

        int total = 0;
        int prevValue = 0;

        for (int i = roman.length() - 1; i >= 0; i--) {
            char currentChar = roman.charAt(i);
            int currentValue = romanToDecimalMap.get(currentChar);

            if (currentValue < prevValue) {
                total -= currentValue;
            } else {
                total += currentValue;
            }

            prevValue = currentValue;
        }

        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie eine römische Zahl ein (z.B. XIV): ");
        String romanInput = scanner.nextLine().toUpperCase();

        int decimalValue = convertRomanToDecimal(romanInput);
        System.out.println("Die entsprechende Dezimalzahl ist: " + decimalValue);
    }
}