import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = Integer.parseInt(sc.nextLine());
        String typeRoom = sc.nextLine();
        String grade = sc.nextLine();
        double price = 0.0;
        double discount = 0;
        switch (typeRoom) {
            case "room for one person" -> price = (days - 1) * 18.0;
            case "apartment" -> {
                price = (days - 1) * 25.0;
                if (days < 10) {
                    price -= price * 0.3;
                } else if (days <= 15) {
                    price -= price * 0.35;
                } else {
                    price -= price * 0.5;
                }
            }
            case "president apartment" -> {
                price = (days - 1) * 35.0;
                if (days < 10) {
                    price -= price * 0.1;
                } else if (days <= 15) {
                    price -= price * 0.15;
                } else {
                    price -= price * 0.2;
                }
            }
        }
        if (grade.equals("positive")) {
            price += price * 0.25;
        } else {
            price -= price * 0.1;
        }
        System.out.printf("%.2f", price);
    }
}
