import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double angleRadians = Double.parseDouble(sc.nextLine());
        double result = angleRadians * 180 /Math.PI;
        System.out.println(result);
    }
}
