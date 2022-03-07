import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxElementDivisibleByZero = 0;

        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            if (number % 4 == 0 && number > maxElementDivisibleByZero) {
                maxElementDivisibleByZero = number;
            }
        }

        System.out.println(maxElementDivisibleByZero);
    }
}
