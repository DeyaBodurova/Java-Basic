import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flower = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double change;

        System.out.printf("Hey, you have a great " +
                "garden with %d %s " +
                "and %.2f leva left.",
                count, flower, change);
    }
}
