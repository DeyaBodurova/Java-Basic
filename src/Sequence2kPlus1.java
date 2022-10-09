import java.util.Scanner;

public class Sequence2kPlus1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        int a = 1;
        while (a<=num){
            System.out.println(a);
            a=a*2+1;
        }
    }
}
