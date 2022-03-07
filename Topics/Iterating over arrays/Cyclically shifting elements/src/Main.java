import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int originalLastNumber = numbers[numbers.length - 1];
        for (int i = 1; i < numbers.length; i++) {
            numbers[numbers.length - i] = numbers[numbers.length - 1 - i];
        }

        numbers[0] = originalLastNumber;

        System.out.println(Arrays.toString(numbers).replace("[", "").replace("]", "").replace(",", ""));
    }
}
