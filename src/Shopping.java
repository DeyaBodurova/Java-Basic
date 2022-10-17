import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        int videoCardsCount = Integer.parseInt(sc.nextLine());
        int CPUCount = Integer.parseInt(sc.nextLine());
        int RAMCount = Integer.parseInt(sc.nextLine());
        double videoPrice = videoCardsCount * 250.0;
        double cpuPrice = CPUCount * (videoPrice * 0.35);
        double ramPrice = RAMCount * (videoPrice * 0.1);
        double total = videoPrice + cpuPrice + ramPrice;
        if (videoCardsCount > CPUCount) {
            total = total - (total * 0.15);
        }
        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", Math.abs(budget - total));
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", Math.abs(total - budget));
        }
    }

}
