import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tripPrice = Double.parseDouble(sc.nextLine());
        int puzzleCount = Integer.parseInt(sc.nextLine());
        int dollCount = Integer.parseInt(sc.nextLine());
        int teddyBearCount = Integer.parseInt(sc.nextLine());
        int minionsCount = Integer.parseInt(sc.nextLine());
        int truckCount = Integer.parseInt(sc.nextLine());

        int totalCountToys = puzzleCount + dollCount + teddyBearCount
                + minionsCount + truckCount;
        double totalToysSum = (puzzleCount * 2.6) +
                (dollCount * 3.0) + (teddyBearCount * 4.1)
                + (minionsCount * 8.2) + (truckCount * 2.0);

        if (totalCountToys >= 50) {
            totalToysSum = totalToysSum - (totalToysSum * 0.25);
        }
        totalToysSum = totalToysSum - (totalToysSum * 0.1);

        if (tripPrice <= totalToysSum) {
            System.out.printf("Yes! %.2f lv left.", Math.abs(tripPrice - totalToysSum));
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(totalToysSum - tripPrice));
        }

    }
}
