import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double sum = 0;
        switch (day) {
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit) {
                    case "banana":
                        sum = quantity * 2.5;
                        break;
                    case "apple":
                        sum = quantity * 1.2;
                        break;
                    case "orange":
                        sum = quantity * 0.85;
                        break;
                    case "grapefruit":
                        sum = quantity * 1.45;
                        break;
                    case "kiwi":
                        sum = quantity * 2.7;
                        break;
                    case "pineapple":
                        sum = quantity *5.5;
                        break;
                    case "grapes":
                        sum = quantity *3.85;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case "Saturday":
            case "Sunday":
                switch (fruit) {
                    case "banana":
                        sum = quantity * 2.7;
                        break;
                    case "apple":
                        sum = quantity * 1.25;
                        break;
                    case "orange":
                        sum = quantity * 0.9;
                        break;
                    case "grapefruit":
                        sum = quantity * 1.6;
                        break;
                    case "kiwi":
                        sum = quantity * 3.0;
                        break;
                    case "pineapple":
                        sum = quantity * 5.6;
                        break;
                    case "grapes":
                        sum = quantity * 4.2;
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
        }
        System.out.printf("%.2f", sum);
    }
}
