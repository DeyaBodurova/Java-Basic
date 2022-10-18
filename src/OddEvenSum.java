import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if (i % 2 == 0) {
                evenSum += n;
            } else {
                oddSum += n;
            }
        }
        if (evenSum == oddSum) {
            System.out.println("Yes\nSum = " + evenSum);
        } else {
            System.out.println("No\nDiff = " + Math.abs(evenSum - oddSum));
        }
    }

}
