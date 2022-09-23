import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flower = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double total;
        double price = switch (flower) {
            case "Roses" -> 5.0;
            case "Dahlias" -> 3.8;
            case "Tulips" -> 2.8;
            case "Narcissus" -> 3.0;
            case "Gladiolus" -> 2.5;
            default -> 0;

        };
        total = price * count;
        if(flower.equalsIgnoreCase("Roses")
        && (count > 80)){
            total = total - (total * 0.1);
        }

        if(flower.equalsIgnoreCase("Dahlias")
        && count > 90) {
        total = total - (total * 0.15);
        }

        if(flower.equalsIgnoreCase("Tulips")
                && count > 80) {
            total = total - (total * 0.15);
        }

        if(flower.equalsIgnoreCase("Narcissus")
                && count < 120) {
            total = total + (total * 0.15);
        }

        if(flower.equalsIgnoreCase("Gladiolus")
                && count < 80) {
            total = total + (total * 0.2);
        }

        if (budget >= total) {
            System.out.printf("Hey, you have a great " +
                            "garden with %d %s " +
                            "and %.2f leva left.",
                    count, flower, Math.abs(budget - total));
        } else {
            System.out.printf("Not enough money, you need " +
                    "%.2f leva more.", Math.abs(total - budget));
        }
    }
}
