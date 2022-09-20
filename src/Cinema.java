import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        double ticketPrice;
        switch (projection) {
            case "Premiere":ticketPrice = 12.0; break;
            case "Normal": ticketPrice = 7.5;break;
            case "Discount":ticketPrice = 5.0;break;
            default:ticketPrice = 0;
        }
        double cost = rows * cols * ticketPrice;
        System.out.printf("%.2f leva", cost);
    }
}
