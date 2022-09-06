import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstTime = Integer.parseInt(sc.nextLine());
        int secondTime = Integer.parseInt(sc.nextLine());
        int thirdTime = Integer.parseInt(sc.nextLine());

        int sum = firstTime + secondTime + thirdTime;
        int min;
        int sec;
        if (sum > 59) {
            min = sum / 60;
            sec = sum % 60;
        } else {
            min = 0;
            sec = sum;
        }
        System.out.printf("%d:%.2f",min,sec);
    }
}
