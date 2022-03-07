import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int sum = 0;

        for (int i = firstNumber; i <= secondNumber; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}