import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());

        //todo to fix this mess - it's doesn't work!!
        for (int i = 1; i <= count; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int maxValue = n;
            int sum = 0;
            for (int j = 0; j < count - i; j++) {
                int a = Integer.parseInt(sc.nextLine());
                if (maxValue>a) {
                    sum += a;
                    maxValue = n;
                } else {
                    sum += n;
                    maxValue = a;
                }
            }
            System.out.println(sum);
        }
    }
}
