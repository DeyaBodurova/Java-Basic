import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        double bonus = 0;
        if (num < 100) {
            bonus += 5;
        } else if (num > 100 && num <= 1000) {
            bonus += num * 0.2;
        } else if (num > 1000) {
            bonus += num * 0.1;
        }
        if (num % 2 == 0) {
            bonus += 1;
        } else if (num % 5 == 0) {
            bonus += 2;
        }
        System.out.println(bonus);
        System.out.println(num + bonus);
    }
}
