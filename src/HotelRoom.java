import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String month = sc.nextLine();
        int nights = Integer.parseInt(sc.nextLine());
        double priceStudio = 0.0;
        double priceApartment = 0.0;
        switch (month) {
            case "May", "October" -> {
                priceStudio = 50 * nights;
                priceApartment = 65 * nights;
            }
            case "June", "September" -> {
                priceStudio = 75.2 * nights;
                priceApartment = 68.7 * nights;
            }
            case "July", "August" -> {
                priceStudio = 76 * nights;
                priceApartment = 77 * nights;
            }
        }
        if (nights > 14 && ((month.equals("May")) ||
                (month.equals("October")))) {
            priceStudio -= priceStudio * 0.3;
        } else if (nights > 14 && ((month.equals("June")) ||
                (month.equals("September")))) {
            priceStudio -= priceStudio * 0.2;
        } else if (nights > 7 && ((month.equals("May")) ||
                (month.equals("October")))) {
            priceStudio -= priceStudio * 0.05;
        }
        if (nights > 14) {
            priceApartment -= priceApartment * 0.1;
        }
        System.out.printf("Apartment: %.2f lv.\n", priceApartment);
        System.out.printf("Studio: %.2f lv.\n", priceStudio);
    }
}