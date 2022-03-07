import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String cityName = scanner.nextLine().toLowerCase();
        System.out.println(cityName.endsWith("burg"));
    }
}