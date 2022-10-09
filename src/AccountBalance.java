import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        double money = 0;
        while (!text.equals("NoMoreMoney")) {
            double deposition = Double.parseDouble(text);
            if (deposition >= 0) {
                System.out.println("Increase: "+deposition);
            money+=deposition;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
            text = sc.nextLine();
        }
        System.out.printf("Total: %.2f",money);
    }
}
