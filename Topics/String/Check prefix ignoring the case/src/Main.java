import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String str = scanner.nextLine().toLowerCase();
        System.out.println(str.startsWith("j"));
    }
}