import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shape = scanner.nextLine();
        double a;
        double b;
        double c;

        switch (shape) {
            case "triangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                c = scanner.nextDouble();
                double s = (a + b + c) / 2;
                System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
                break;
            case "rectangle":
                a = scanner.nextDouble();
                b = scanner.nextDouble();
                System.out.println(a * b);
                break;
            case "circle":
                a = scanner.nextDouble();
                System.out.println(3.14 * (a * a));
                break;
            default:
                System.out.println("wrong shape");
                break;
        }
    }
}