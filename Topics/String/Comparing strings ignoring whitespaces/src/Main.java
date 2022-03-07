import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstString = scanner.nextLine().trim().replace(" ", "");
        String secondString = scanner.nextLine().trim().replace(" ", "");

        System.out.println(firstString.equals(secondString));
    }
}