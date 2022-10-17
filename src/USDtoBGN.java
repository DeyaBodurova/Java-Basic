import java.util.Scanner;

public class USDtoBGN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double lv = Double.parseDouble(sc.nextLine()) * 1.79549;
        System.out.printf("%.2f", lv);
    }

}
