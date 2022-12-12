package overage_odd_even;

import java.util.Arrays;
import java.util.Scanner;

public class AverageOddEven {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int numberElement = 0;

        do {
            System.out.print("Enter numbers element of array integer: ");
            try {
                numberElement = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.err.println(e.getMessage());
            }
        } while (numberElement <= 0);

        int[] arrayInteger = new int[numberElement];

        for (int i = 0; i < numberElement; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arrayInteger));

        averageOddEven(arrayInteger);
    }

    private static void averageOddEven(int[] arrayInteger) {
        double sumEven = 0;
        double countEven = 0;
        double sumOdd = 0;
        double countOdd = 0;

        for (int j : arrayInteger) {
            if (j % 2 == 0) {
                sumOdd += j;
                countOdd++;
            } else {
                sumEven += j;
                countEven++;
            }
        }

        double divOdd = sumOdd/countOdd;
        int averageOdd = (int) Math.round(divOdd);

        System.out.println("Average odd: " + averageOdd);

        double divEven = sumEven/countEven;
        int averageEven = (int) Math.round(divEven);

        System.out.println("Average even: " + averageEven);

        int minusOddEven = averageOdd - averageEven;

        System.out.println("Odd minus even: " + minusOddEven);
    }
}
