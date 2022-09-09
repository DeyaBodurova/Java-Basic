import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int statist = Integer.parseInt(sc.nextLine());
        double clothes = Double.parseDouble(sc.nextLine());
        double decor = budget * 0.1;

        double sum = (statist * clothes) + decor;

        if (budget < sum) {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", Math.abs(sum - budget));
        } else {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", Math.abs(budget - sum));
        }
    }
}
