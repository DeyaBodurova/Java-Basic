import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int degrees = Integer.parseInt(sc.nextLine());
        String dayTime = sc.nextLine();
        String outfit = "";
        String shoes = "";
        if (10 <= degrees && degrees <= 18) {
            switch (dayTime) {
                case "Morning" -> {
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                case "Afternoon", "Evening" -> {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            }
        } else if (18 <= degrees && degrees <= 24) {
            switch (dayTime) {
                case "Morning", "Evening" -> {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                case "Afternoon" -> {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
            }
        } else if (degrees >= 25) {
            switch (dayTime) {
                case "Morning" -> {
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                }
                case "Afternoon" -> {
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                }
                case "Evening" -> {
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degrees, outfit, shoes);
    }

}