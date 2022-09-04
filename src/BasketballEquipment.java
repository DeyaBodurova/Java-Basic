import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax = Integer.parseInt(sc.nextLine());
        double sneakers = tax - (tax * 0.4);
        double clothes = sneakers - (sneakers*0.2);
        double ball = clothes /4.0;
        double accessories = ball /5.0;

        double sum = tax + sneakers + clothes
                + ball + accessories;
        System.out.println(sum);
    }
}
