import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nylon = Integer.parseInt(sc.nextLine());
        int paint = Integer.parseInt(sc.nextLine());
        int thinner = Integer.parseInt(sc.nextLine());
        int hours = Integer.parseInt(sc.nextLine());
        double nylonSum = (nylon + 2) * 1.5;
        double paintSum = 14.5 * (paint + (paint * 0.1));
        double thinnerSum = thinner * 5.0;
        double sumSupplies = nylonSum + paintSum + thinnerSum + 0.4;
        double workersPayment = (sumSupplies * 0.3) * hours;
        double finalSum = sumSupplies + workersPayment;
        System.out.print(finalSum);
    }
}
