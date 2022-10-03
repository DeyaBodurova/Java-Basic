import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int maxNum = 0;
        int sum = 0;
        for (int i = 0; i < count; i++) {
            int a = Integer.parseInt(sc.nextLine());
            if (maxNum <= a) {
                sum += maxNum;
                maxNum = a;
            } else {
                sum += a;
            }
        }
        if (sum == maxNum) {
            System.out.println("Yes\nSum = " + sum);
        } else {
            System.out.println("No\nDiff = " + Math.abs(maxNum - sum));
        }
    }
}
