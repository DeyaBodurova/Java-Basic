import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String product = sc.nextLine();
        String city = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double sum = 0;
        switch (city) {
            case "Sofia":
                switch (product) {
                    case "coffee" -> sum = quantity * 0.5;
                    case "water" -> sum = quantity * 0.8;
                    case "beer" -> sum = quantity * 1.2;
                    case "sweets" -> sum = quantity * 1.45;
                    case "peanuts" -> sum = quantity * 1.6;
                }
                break;
            case "Plovdiv":
                sum = switch (product) {
                    case "coffee" -> quantity * 0.4;
                    case "water" -> quantity * 0.7;
                    case "beer" -> quantity * 1.15;
                    case "sweets" -> quantity * 1.30;
                    case "peanuts" -> quantity * 1.5;
                    default -> sum;
                };
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        sum = quantity * 0.45;
                        break;
                    case "water":
                        sum = quantity * 0.7;
                        break;
                    case "beer":
                        sum = quantity * 1.1;
                        break;
                    case "sweets":
                        sum = quantity * 1.35;
                        break;
                    case "peanuts":
                        sum = quantity * 1.55;
                        break;
                }
                break;
        }
        System.out.printf("%.2f", sum);
    }
}
