import java.util.Scanner;

public class SumNumbersWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int a= Integer.parseInt(sc.nextLine());
        while (sum <num){
            sum+=a;
        a=Integer.parseInt(sc.nextLine());
        }
        System.out.println(sum);
    }
}
