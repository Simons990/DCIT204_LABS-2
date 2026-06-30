import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the array size from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        while (size <= 1) {
            System.out.print("Array size must be at least 2 to form a pair. Please enter again: ");
            size = scanner.nextInt();
        }

        // To Create and populate the array
        int[] numbers = new int[size];
        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the Target Sum: ");
        int target = scanner.nextInt();

        // Brute force nested loop search
        boolean pairFound = false;
        int firstIndex = -1;
        int secondIndex = -1;

        for (int i = 0; i < numbers.length && !pairFound; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    firstIndex = i;
                    secondIndex = j;
                    pairFound = true;
                    break;
                }
            }
        }

        System.out.println("Array entered: " + java.util.Arrays.toString(numbers));
        System.out.println("Target Sum   : " + target);

        if (pairFound) {
            int val1 = numbers[firstIndex];
            int val2 = numbers[secondIndex];
            System.out.println("Pair Found!");
            System.out.println("Indices : [" + firstIndex + "] and [" + secondIndex + "]");
            System.out.println("Values  : " + val1 + " and " + val2);
            System.out.println("Equation: " + val1 + " + " + val2 + " = " + target);
        } else {
            System.out.println("No pair was found that sums to " + target + ".");
        }

        scanner.close();
    }
}
