import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fisherman = Integer.parseInt(sc.nextLine());
        double boatPrice = switch (season) {
            case "Spring" -> 3000;
            case "Summer", "Autumn" -> 4200;
            case "Winter" -> 2600;
            default -> 0;
        };
        if (fisherman <= 6) {
            boatPrice -= boatPrice * 0.1;
        } else if (fisherman <= 11) {
            boatPrice -= boatPrice * 0.15;
        } else {
            boatPrice -= boatPrice * 0.25;
        }
        if (fisherman % 2 == 0 && (!season.equals("Autumn"))) {
            boatPrice -= boatPrice * 0.05;
        }
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - boatPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(boatPrice - budget));
        }
    }

}
