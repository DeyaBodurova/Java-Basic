import java.util.Scanner;

public class SumNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        while (sum <num){
            int a= Integer.parseInt(sc.nextLine());
            sum+=a;
        }
        System.out.println(sum);
    }

}
