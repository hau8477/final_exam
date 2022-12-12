package remove_duplicate_element;

import java.util.*;

public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberElement = 0;

        do {
            System.out.print("Enter numbers element of array integer: ");
            try {
                numberElement = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e){
                System.err.println(e.getMessage());
            }
        } while (numberElement <= 0);

        int[] arrayInteger = new int[numberElement];

        for (int i = 0; i < numberElement; i++) {
            System.out.print("Enter element " + (i + 1) + " : ");
            arrayInteger[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.toString(arrayInteger));
        System.out.println(removeDuplicateElement(arrayInteger));
    }

    private static Set<Integer> removeDuplicateElement(int[] arrayInteger){
        Set<Integer> set = new LinkedHashSet<>();

        for (int j : arrayInteger) {
            set.add(j);
        }

        return set;
    }
}
