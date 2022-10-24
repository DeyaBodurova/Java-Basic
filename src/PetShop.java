import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dogsPackage = Integer.parseInt(sc.nextLine());
        int catsPackage = Integer.parseInt(sc.nextLine());
        double sum = dogsPackage * 2.5 + (catsPackage * 4);
        System.out.printf("%.2f lv.", sum);
    }
}