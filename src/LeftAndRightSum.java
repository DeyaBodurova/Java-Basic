import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 1; i <= 2*count; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if(i <= count){
                leftSum += n;
            } else {
                rightSum +=n;
            }
        }

        if(leftSum == rightSum) {
            System.out.printf("Yes, sum = %d",leftSum);
        } else {
            System.out.printf("No, diff = %d",
                    Math.abs(leftSum - rightSum));
        }
    }
}
