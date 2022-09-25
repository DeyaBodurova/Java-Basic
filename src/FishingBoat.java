import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int budget = Integer.parseInt(sc.nextLine());
        String season = sc.nextLine();
        int fisherman = Integer.parseInt(sc.nextLine());
        double boatPrice = 0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }

        if (fisherman <= 6) {
            boatPrice = boatPrice - (boatPrice * 10/100.0);
        } else if (fisherman > 6 && fisherman <= 11) {
            boatPrice = boatPrice - (boatPrice * 15/100.0);
        } else if (fisherman >= 12) {
            boatPrice = boatPrice - (boatPrice * 25/100.0);
        }

        if (fisherman % 2 == 0 && (!season.equals("Autumn"))) {
            boatPrice -= boatPrice * 5/100.0;
        }

        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - boatPrice));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(boatPrice - budget));
        }
    }
}
