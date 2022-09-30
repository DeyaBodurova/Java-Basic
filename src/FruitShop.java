import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        String day = sc.nextLine();
        double quantity = Double.parseDouble(sc.nextLine());
        double sum = 0;
        boolean isValid = true;
        if ("Monday".equals(day) || "Tuesday".equals(day) || "Wednesday".equals(day) || "Thursday".equals(day) || "Friday".equals(day)) {
            switch (fruit) {
                case "banana" -> sum = quantity * 2.5;
                case "apple" -> sum = quantity * 1.2;
                case "orange" -> sum = quantity * 0.85;
                case "grapefruit" -> sum = quantity * 1.45;
                case "kiwi" -> sum = quantity * 2.7;
                case "pineapple" -> sum = quantity * 5.5;
                case "grapes" -> sum = quantity * 3.85;
                default -> {
                    System.out.println("error");
                    isValid = false;
                }
            }
        } else if ("Saturday".equals(day) || "Sunday".equals(day)) {
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
                    isValid = false;
                    break;
            }
        } else {
            System.out.println("error");
            isValid = false;
        }
        if (isValid) {
            System.out.printf("%.2f", sum);
        }

    }
}
