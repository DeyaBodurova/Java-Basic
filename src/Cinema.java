import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String projection = sc.nextLine();
        int rows = Integer.parseInt(sc.nextLine());
        int cols = Integer.parseInt(sc.nextLine());
        switch (projection) {
            case "Premiere":
                break;
            case "Normal":
                break;
            case "Discount":
                break;
            default:
                System.out.println("Invalid projection");
        }
    }
}
