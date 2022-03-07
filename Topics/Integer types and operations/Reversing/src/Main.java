import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // Remember
        // 179 % 10 = 9
        // 179 % 100 = 79
        // (179 % 100) / 10 = 7
        int number = scanner.nextInt();

        int firstNumber = (number % 10) * 100;
        int secondNumber = ((number % 100) / 10) * 10;
        int thirdNumber = (number / 100);

        System.out.println(firstNumber + secondNumber + thirdNumber);

    }
}