import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        double ticketPrice;
        switch (projection) {
            case "Premiere" -> ticketPrice = 12.0;
            case "Normal" -> ticketPrice = 7.5;
            case "Discount" -> ticketPrice = 5.0;
            default -> ticketPrice = 0;
        }
        double cost = rows * cols * ticketPrice;

    }
}
