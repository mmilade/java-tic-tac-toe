import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int durationInDays = scanner.nextInt();
        int totalFoodCostPerDay = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        // (the number of nights equal duration minus one)
        int costOfOneNightInHotel = scanner.nextInt();

        int cost = durationInDays * totalFoodCostPerDay
                + costOfOneNightInHotel * (durationInDays - 1)
                + oneWayFlightCost * 2;

        System.out.println(cost);
    }
}