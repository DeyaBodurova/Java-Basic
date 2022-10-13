import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hour = Integer.parseInt(sc.nextLine());
        String day = sc.nextLine();
        if (hour >= 10 & hour <= 18) {
            switch (day) {
                case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" -> System.out.println("open");
                case "Sunday" -> System.out.println("closed");
                default -> System.out.println("Invalid day!");
            }
        } else {
            System.out.println("closed");
        }
    }
}
