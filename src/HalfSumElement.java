import java.util.List;
import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= count; i++) {
            int n = Integer.parseInt(sc.nextLine());
            int sum = 0;
            for (int j = 0; j < count - i; j++) {
                int a = Integer.parseInt(sc.nextLine());
                sum += a;
            }

            //doesn't seem right
        }
    }
}
