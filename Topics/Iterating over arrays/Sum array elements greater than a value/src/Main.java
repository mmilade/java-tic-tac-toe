import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numbers = new int[arraySize];
        int sum = 0;

        for (int i = 0; i < arraySize; i++) {
            numbers[i] = scanner.nextInt();
        }

        int n = scanner.nextInt();

        for (int number: numbers) {
            if (number > n) {
                sum += number;
            }
        }

        System.out.println(sum);
    }
}
