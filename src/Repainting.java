import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int naylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double sumSupplies = ((naylon + 2) * 1.5) +
                ((paint + (paint * 0.01)) * 14.5)
                + thinner * 5.0
                + 0.4;

        double maistorsPayment = (sumSupplies * 0.03) * hours;
        double finalSum = sumSupplies + maistorsPayment;
        System.out.printf("%.2f",finalSum);
    }
}
