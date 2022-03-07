import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        float firstClass = scanner.nextFloat();
        float secondClass = scanner.nextFloat();
        float thirdClass = scanner.nextFloat();

        int noOfDesksRequired = (int) (
                Math.ceil(firstClass / 2)
                + Math.ceil(secondClass / 2)
                + Math.ceil(thirdClass / 2)
        );
        System.out.println(noOfDesksRequired);
    }
}