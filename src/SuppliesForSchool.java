import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pens = Integer.parseInt(sc.nextLine());
        int markers = Integer.parseInt(sc.nextLine());
        int cleaningSupplies = Integer.parseInt(sc.nextLine());
        int discount = Integer.parseInt(sc.nextLine());

        double sum = pens * 5.80 + (markers * 7.2) + (cleaningSupplies * 1.2);
        double finalSum = sum - (sum * (discount*0.01));
        System.out.println(finalSum);

    }
}
