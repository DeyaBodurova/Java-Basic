import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chickenMenus = Integer.parseInt(sc.nextLine());
        int fishMenus = Integer.parseInt(sc.nextLine());
        int veganMenus = Integer.parseInt(sc.nextLine());
        double sum = (chickenMenus * 10.35) + (fishMenus * 12.4)
                + (veganMenus * 8.15);
        double dessert = sum * 0.2;
        double total = sum + dessert + 2.5;
        System.out.println(total);
    }
}
