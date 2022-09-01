import java.util.Scanner;

public class VacationBooksList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pages = Integer.parseInt(sc.nextLine());
        int pagesPerHour = Integer.parseInt(sc.nextLine());
        int days = Integer.parseInt(sc.nextLine());

        int totalHours = pages / pagesPerHour;
        int hoursPerDay = totalHours / days;
        System.out.println(hoursPerDay);
    }
}
