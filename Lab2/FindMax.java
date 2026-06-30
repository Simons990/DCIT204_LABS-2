import java.util.Scanner;


public class FindMax {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get the size of the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int size = scanner.nextInt();

        while (size <= 0) {
            System.out.print("Array size must be greater than 0. Please enter again: ");
            size = scanner.nextInt();
        }

        int[] numbers = new int[size];

        System.out.println("Enter " + size + " integer values:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element [" + i + "]: ");
            numbers[i] = scanner.nextInt();
        }

        int maxValue = numbers[0];
        int maxIndex = 0;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > maxValue) {
                maxValue = numbers[i];
                maxIndex = i;
            }
        }
      
        System.out.println("Array entered : " + java.util.Arrays.toString(numbers));
        System.out.println("Maximum Value : " + maxValue);
        System.out.println("Found at Index: " + maxIndex);

        scanner.close();
    }
}
