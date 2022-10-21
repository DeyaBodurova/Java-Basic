import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day = sc.nextLine();
        switch (day) {
            case "Monday", "Tuesday", "Friday" -> System.out.println(12);
            case "Wednesday", "Thursday" -> System.out.println(14);
            case "Saturday", "Sunday" -> System.out.println(16);
        }
    }
}
