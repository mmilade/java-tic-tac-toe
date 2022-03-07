import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lengthOfSequence = 0;
        int number = scanner.nextInt();


        while (number != 0) {
            lengthOfSequence++;
            number = scanner.nextInt();
        }

        System.out.println(lengthOfSequence);
    }
}