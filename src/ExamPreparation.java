import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weekGrades = Integer.parseInt(sc.nextLine());
        int countPoorGrades = 0;
        int countTasks = 0;
        double totalGrades = 0;
        boolean isFailed = false;
        String input = sc.nextLine();
        String taskName = "";
        while (!input.equals("Enough")) {
            taskName = input;
            int currentGrade = Integer.parseInt(sc.nextLine());
            totalGrades += currentGrade;
            countTasks++;
            if (currentGrade <= 4) {
                countPoorGrades++;
                if (weekGrades == countPoorGrades) {
                    isFailed = true;
                    System.out.println("You need a break, "
                            + weekGrades + " poor grades.");
                    break;
                }
            }
            input = sc.nextLine();
        }
        if (!isFailed) {
            System.out.printf("Average score: %.2f\n", totalGrades / countTasks);
            System.out.println("Number of problems: " + countTasks);
            System.out.println("Last problem: " + taskName);
        }
    }

}
