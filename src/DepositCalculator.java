import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double deposit = Double.parseDouble(sc.nextLine());
        int period = Integer.parseInt(sc.nextLine());
        double percent = Double.parseDouble(sc.nextLine());
        double sum = deposit + period * ((deposit * (percent * 0.01)) / 12.0);
        System.out.println(sum);
    }
}
