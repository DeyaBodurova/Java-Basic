import java.util.Scanner;

public class SpeedInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.nextLine());
        if (n <= 10) {
            System.out.println("slow");
        } else if (n <= 50) {
            System.out.println("average");
        } else if (n <= 150) {
            System.out.println("fast");
        } else if (n <= 1000) {
            System.out.println("ultra fast");
        } else {
            System.out.println("extremely fast");
        }
    }
}
