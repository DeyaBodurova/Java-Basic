import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double oneSqrM = 7.61;
        double totalMeters = Double.parseDouble(sc.nextLine());
        double sum = totalMeters * oneSqrM;
        double discount = sum * 0.18;
        double finalSum = sum - discount;
        System.out.printf("The final price is: %.2f lv.", finalSum);
        System.out.printf("The discount is: %.2f lv.", discount);
    }

}