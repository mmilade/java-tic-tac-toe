import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int largestElement = scanner.nextInt();
        int element;

        do {
            element = scanner.nextInt();

            if (element > largestElement) {
                largestElement = element;
            }

        } while (element != 0);

        System.out.println(largestElement);
    }
}