import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double budget = Double.parseDouble(sc.nextLine());
        String season = sc.nextLine();
        String type = "";
        String destination = "";
        double moneySpend = 0.0;
        switch (season) {
            case "summer":
                type = "Camp";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneySpend = budget * 0.3;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    moneySpend = budget * 0.4;
                } else if (budget > 1000) {
                    destination = "Europe";
                    type = "Hotel";
                    moneySpend = budget * 0.9;
                }
                break;
            case "winter":
                type = "Hotel";
                if (budget <= 100) {
                    destination = "Bulgaria";
                    moneySpend = budget * 0.7;
                } else if (budget <= 1000) {
                    destination = "Balkans";
                    moneySpend = budget * 0.8;
                } else if (budget > 1000) {
                    destination = "Europe";
                    moneySpend = budget * 0.9;
                }
                break;
        }
        System.out.printf("Somewhere in %s\n", destination);
        System.out.printf("%s - %.2f", type, moneySpend);
    }
}
