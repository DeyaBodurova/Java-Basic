import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = Integer.parseInt(sc.nextLine());
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < count; i++) {
            int n = Integer.parseInt(sc.nextLine());
            if(min <= n) {
                min = n;
            }
            if(max >= n){
                max = n;
            }
        }
        System.out.println("Max number: "+ max);
        System.out.println("Min nimber: "+ min);
    }
}
