import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int naylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());

        double nylonSum = (naylon + 2) * 1.5;
        double paintSum = 14.5 * (paint + (paint * 0.1));
        double thinnerSum = thinner * 5.0;
        double sumSupplies = nylonSum + paintSum + thinnerSum + 0.4;

        double maistorsPayment = (sumSupplies * 0.3) * hours;
        double finalSum = sumSupplies + maistorsPayment;
        System.out.print(finalSum);
    }
}
