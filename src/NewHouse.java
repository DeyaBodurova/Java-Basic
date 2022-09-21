import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String flower = sc.nextLine();
        int count = Integer.parseInt(sc.nextLine());
        int budget = Integer.parseInt(sc.nextLine());
        double change;
        double total;
        double price;
        switch (flower){
            case "Roses":
                price = 5.0;
                break;
            case "Dahlias":
                price = 3.8;
                break;
            case "Tulips":
                price = 2.8;
                break;
            case "Narcissus":
                price = 3.0;
                break;
            case "Gladiolus":
                price = 2.5;
                break;
        }
        total = price * count;
        if(){}

        if (budget >= total) {
            System.out.printf("Hey, you have a great " +
                            "garden with %d %s " +
                            "and %.2f leva left.",
                    count, flower, change);
        } else {
            System.out.printf("Not enough money, you need " +
                    "%.2f leva more.", Math.abs(total - budget));
        }
    }
}
