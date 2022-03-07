import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfStudentsPassedTest = scanner.nextInt();
        int aGrades = 0;
        int bGrades = 0;
        int cGrades = 0;
        int dGrades = 0;

        for (int i = 0; i <= numberOfStudentsPassedTest; i++) {

            String grade = scanner.nextLine();

            if ("A".equals(grade)) {
                aGrades++;
            } else if ("B".equals(grade)) {
                bGrades++;
            } else if ("C".equals(grade)) {
                cGrades++;
            } else if ("D".equals(grade)) {
                dGrades++;
            }

        }

        System.out.println(dGrades + " " + cGrades + " " + bGrades + " " + aGrades);

    }
}