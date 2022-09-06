import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTime = Integer.parseInt(sc.nextLine());
        int secondTime = Integer.parseInt(sc.nextLine());
        int thirdTime = Integer.parseInt(sc.nextLine());

        int sum = firstTime + secondTime + thirdTime;
        if (sum > 59) {
            int min = sum / 60;
            int sec = sum % 60;
        }
    }
}
