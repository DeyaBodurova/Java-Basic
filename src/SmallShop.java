import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double sum = 0;
        if ("Sofia".equals(city)) {
            switch (product) {
                case "coffee" -> sum = quantity * 0.5;
                case "water" -> sum = quantity * 0.8;
                case "beer" -> sum = quantity * 1.2;
                case "sweets" -> sum = quantity * 1.45;
                case "peanuts" -> sum = quantity * 1.6;
            }
        } else if ("Plovdiv".equals(city)) {
            sum = switch (product) {
                case "coffee" -> quantity * 0.4;
                case "water" -> quantity * 0.7;
                case "beer" -> quantity * 1.15;
                case "sweets" -> quantity * 1.30;
                case "peanuts" -> quantity * 1.5;
                default -> sum;
            };
        } else if ("Varna".equals(city)) {
            sum = switch (product) {
                case "coffee" -> quantity * 0.45;
                case "water" -> quantity * 0.7;
                case "beer" -> quantity * 1.1;
                case "sweets" -> quantity * 1.35;
                case "peanuts" -> quantity * 1.55;
                default -> sum;
            };
        }
        System.out.printf("%.2f", sum);
    }
}